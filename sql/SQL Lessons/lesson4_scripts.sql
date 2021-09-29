/*
Напишем процедуру, которая будет предлагать пользователям новых друзей.
Критерии выбора пользователей:
	-	из одного города
	-	состоят в одной группе
	-	друзья друзей
Из выборки будем показывать 5 человек в случайной комбинации.
*/
drop procedure if exists sp_friendship_offers;

delimiter //
create procedure sp_friendship_offers(in for_user_id BIGINT)
  begin
	-- общий город
	select p2.user_id
	from profiles p1
	join profiles p2 
	    on p1.hometown = p2.hometown
	where p1.user_id = for_user_id 
	    and p2.user_id <> for_user_id -- исключим себя
	
		union 
		
	-- общие группы
	select uc2.user_id
	from users_communities uc1
	join users_communities uc2 
	    on uc1.community_id = uc2.community_id
	where uc1.user_id = for_user_id 
	    and uc2.user_id <> for_user_id -- исключим себя

		union 
		
	-- друзья друзей
	-- получим друзей друзей
	-- объединяем таблицу саму с собой 3 раза
	-- фильтруем «первую» таблицу по for_user_id
	select fr3.target_user_id	
	from friend_requests fr1
		join friend_requests fr2 
		    on (fr1.target_user_id = fr2.initiator_user_id 
		        or fr1.initiator_user_id = fr2.target_user_id)
		join friend_requests fr3 
		    on (fr3.target_user_id = fr2.initiator_user_id 
		        or fr3.initiator_user_id = fr2.target_user_id)
	where (fr1.initiator_user_id = for_user_id or fr1.target_user_id = for_user_id)
	 	and fr2.status = 'approved' -- оставляем только подтвержденную дружбу
	 	and fr3.status = 'approved'
		and fr3.target_user_id <> for_user_id -- исключим себя
	
	order by rand() -- будем брать всегда случайные записи
	limit 5; -- ограничим всю выборку до 5 строк
  END// -- не забываем наш новый разделитель
DELIMITER ; -- вернем прежний разделитель

-- Вызов продедуры / результаты
CALL sp_friendship_offers(1);


/*
функция, вычисляющая направленность дружбы
Формула:
	Кол-во приглашений в друзья к пользователю
	/
	Кол-во приглашений в друзья от пользователя

Чем больше - популярность выше
Если значение меньше единицы - пользователь инициатор связей.
*/
USE vk;

DROP FUNCTION IF EXISTS func_friendship_direction;

DELIMITER // -- выставим разделитель
CREATE FUNCTION func_friendship_direction(check_user_id BIGINT)
RETURNS FLOAT READS SQL DATA
  BEGIN
-- объявим переменные
    DECLARE requests_to_user INT;
    DECLARE requests_from_user INT;
    
-- получим запросы к пользователю
    SET requests_to_user = 
      (SELECT COUNT(*) 
        FROM friend_requests
          WHERE target_user_id = check_user_id);
    
-- получим запросы от пользователя
    SET requests_from_user = 
      (SELECT COUNT(*) 
        FROM friend_requests
          WHERE initiator_user_id = check_user_id);
    
-- разделим первое на второе и вернем результат
    RETURN requests_to_user / requests_from_user;
  END// -- не забываем наш новый разделитель
DELIMITER ; -- вернем прежний разделитель

-- Вызов функции 
SELECT friendship_direction(1);


-- представление, выбирающее друзей пользователей
CREATE or replace VIEW view_friends
AS 
  select *
  FROM users u
    JOIN friend_requests fr ON u.id = fr.target_user_id
  WHERE 
  fr.status = 'approved'
  	union
  select *
  FROM users u
    JOIN friend_requests fr ON u.id = fr.initiator_user_id
  WHERE 
  fr.status = 'approved';


-- получим друзей пользователя из представления 
select *
from view_friends
where id = 1

-- удаление представления
drop view view_friends;


-- триггер для проверки возраста возраста пользователя при вставке новых строк
DELIMITER //

CREATE TRIGGER check_user_age_before_insert BEFORE INSERT ON profiles
FOR EACH ROW
begin
    IF NEW.birthday >= CURRENT_DATE() THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Операция отменена. Дата рождения должна быть в прошлом';
    END IF;
END//

DELIMITER ;


-- проверка работы триггера
-- предварительно удалим запись
delete from vk.profiles
where user_id = 100;

-- добавляем запись: должен сработать триггер и не позволить выполнить вставку строки
INSERT INTO vk.profiles
(user_id, gender, birthday, photo_id, hometown)
VALUES(100, 'f', '2030.10.10', 1, 'Moscow');
