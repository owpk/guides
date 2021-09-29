
-- 1. Создать нового пользователя и задать ему права доступа на определенную базу данных (выбрать самостоятельно).
CREATE USER 'vk_admin';
GRANT ALL PRIVILEGES ON vk_copy.* TO 'vk_admin'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;

----------------------------------------------------------------------------
-- 2. Сделать резервную копию базы, удалить базу и пересоздать из бекапа.

.\mysqladmin -u root -p create vk_copy

.\mysqldump -u root -p vk > "C:\full_path\vk.sql";

.\mysql -u root -p 
drop database vk;

.\mysql -u root -p vk_copy < "C:\full_path\vk.sql"

-- Фиксим ошибку «ERROR: ASCII ‘\0’ appeared in the statement, but this is not allowed», использую WSL 
iconv -f utf-16 -t utf-8 vk.sql > utf8_vk.sql

.\mysql -u root -p vk_copy < "C:\full_path\utf8_vk.sql"
-- output:
-- Оператор "<" зарезервирован для использования в будущем.

-- Фиксим ошибку Оператор «<» зарезервирован для будущего использования
MySQL Server 8.0\bin> Get-Content "C:\full_path\utf8_vk.sql" | .\mysql -u root -p vk_copy
Enter password: *********
-- OK

----------------------------------------------------------------------------
-- 3. Подсчитать общее количество лайков, которые получили пользователи младше 10 лет.

SELECT count(*) FROM likes 
INNER JOIN profiles ON profiles.user_id = likes.user_id 
WHERE year(now()) - year(profiles.birthday) < 10;

----------------------------------------------------------------------------
-- 4. Определить кто больше поставил лайков (всего) - мужчины или женщины?

SELECT profiles.gender, count(*) FROM profiles 
INNER JOIN likes ON profiles.user_id = likes.user_id GROUP BY profiles.gender;

--output: 
--+--------+----------+
--| gender | count(*) |
--+--------+----------+
--| f      |       35 |
--| m      |       19 |
--+--------+----------+