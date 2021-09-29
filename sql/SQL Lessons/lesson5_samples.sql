-- Транзакция по добавлению нового пользователя      
START TRANSACTION;
	INSERT INTO users (firstname, lastname, email, phone)
  	VALUES ('New', 'User', 'new@mail.com', 454545456);

	SELECT @last_user_id := (SELECT MAX(id) FROM users); -- опасный способ
  	SELECT @last_user_id := last_insert_id(); -- лучше так
	
  	INSERT INTO profiles (user_id, gender, birthday, hometown)
  	VALUES (@last_user_id, 'M', '1999-10-10', 'Moscow');  
COMMIT;
-- ROLLBACK;


-- проверим результат
select * from users order by id desc;	
select * from profiles order by user_id desc;	


-- Хранимая процедура по добавлению пользователя
DROP PROCEDURE IF EXISTS `sp_add_user`;

DELIMITER $$

CREATE PROCEDURE `sp_add_user`(firstname varchar(100), lastname varchar(100), email varchar(100), phone varchar(12), hometown varchar(50), photo_id INT, OUT tran_result varchar(200))
BEGIN
    DECLARE `_rollback` BOOL DEFAULT 0;
    DECLARE code varchar(100);
    DECLARE error_string varchar(100);

   DECLARE CONTINUE HANDLER FOR SQLEXCEPTION
   begin
    	SET `_rollback` = 1;
	GET stacked DIAGNOSTICS CONDITION 1
          code = RETURNED_SQLSTATE, error_string = MESSAGE_TEXT;
    	set tran_result := concat('Error occured. Code: ', code, '. Text: ', error_string);
    end;
		        
    START TRANSACTION;
		INSERT INTO users (firstname, lastname, email, phone)
		  VALUES (firstname, lastname, email, phone);
	
		INSERT INTO profiles (user_id, hometown, photo_id)
		  VALUES (last_insert_id(), hometown, photo_id); 
	
	    IF `_rollback` THEN
	       ROLLBACK;
	    ELSE
		set tran_result := 'ok';
	       COMMIT;
	    END IF;
END$$

DELIMITER ;

-- вызываем процедуру
call sp_add_user('New', 'User', 'new87@mail.com', 454545456, 'Moscow', -1, @tran_result);
-- смотрим результат
select @tran_result;

-- вызываем процедуру
call sp_add_user('New', 'User', 'new87@mail.com', 454545456, 'Moscow', 1, @tran_result);
-- смотрим результат
select @tran_result;

-- Транзакция по удалению пользователя      
START TRANSACTION;
	SELECT @last_user_id := 111;

	delete from profiles
	where user_id = @last_user_id;

	delete from users
	where id = @last_user_id;
COMMIT;


-- Список медиафайлов пользователя с количеством лайков
select
	media.filename,
  	media_types.name,
  	COUNT(*) AS total_likes,
  	CONCAT(firstname, ' ', lastname) AS owner,
  	hometown
 FROM media
    JOIN media_types ON media.media_type_id = media_types.id
    JOIN likes ON media.id = likes.media_id
    JOIN users ON users.id = media.user_id
    JOIN profiles ON users.id = profiles.user_id
 WHERE users.id = 1
 GROUP BY media.id;


-- удаляем внешний ключ и индекс из таблицы лайков
ALTER TABLE vk.likes DROP FOREIGN KEY likes_ibfk_2; 
ALTER TABLE vk.likes DROP INDEX media_id;


-- Применим команду EXPLAIN к запросу
explain
	select
		media.filename,
		media_types.name,
		COUNT(*) AS total_likes,
		CONCAT(firstname, ' ', lastname) AS owner
	 FROM media
		JOIN media_types ON media.media_type_id = media_types.id
		JOIN likes ON media.id = likes.media_id
		JOIN users ON users.id = media.user_id
		JOIN profiles ON users.id = profiles.user_id
	 WHERE users.id = 1
	 GROUP BY media.id; 


ALTER TABLE likes ADD INDEX likes_to_subject_id_idx (media_id);
-- explain again
ALTER TABLE likes ADD FOREIGN KEY (media_id) REFERENCES media(id);
-- explain again



