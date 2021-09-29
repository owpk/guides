-- 1. Создать VIEW на основе SELECT-запроса, который вы писали в ДЗ к уроку 3.

CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `lesson4_view` AS
    SELECT DISTINCT
        `users`.`firstname` AS `firstname`
    FROM
        `users`
    ORDER BY `users`.`firstname`

    ---------------------------------

-- 2. Создать функцию, которая найдет пользователя по имени и фамилии.

CREATE DEFINER=`root`@`localhost` FUNCTION `search_id_by_name`(firstname varchar(255), lastname varchar(255)) RETURNS int
    DETERMINISTIC
BEGIN
DECLARE c1 INT;
SELECT vk.users.id INTO c1 FROM vk.users WHERE users.firstname = firstname AND users.lastname = lastname;
RETURN c1;
END

-- Проверяем
SELECT search_id_by_name('Neil', 'Druckmann'); --output row: 12 

    ---------------------------------

-- 3. Создать триггер, который при обновлении профиля пользователя будет проверять его дату рождения. 
-- Если дата из будущего, то подменить ее на сегодняшнее число.

DELIMITER //

CREATE TRIGGER check_user_age_before_update BEFORE UPDATE ON profiles
FOR EACH ROW
BEGIN
    IF NEW.birthday >= CURRENT_DATE() THEN
        SET NEW.birthday = now();
    END IF;
END//

DELIMITER ;
