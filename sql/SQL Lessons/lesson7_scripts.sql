-- посмотреть список поддерживаемых движков на сервере
SHOW engines;

USE vk;
-- посмотреть движок в DDL команде создания таблицы
SHOW CREATE TABLE users \G;

-- движок таблицы (ENGINE) указывается при создании таблицы
CREATE TABLE `archive_sample_table` (
  `id` SERIAL,
  `title` varchar(100) DEFAULT NULL
) ENGINE=ARCHIVE;

-- сменить движок таблицы
ALTER TABLE newtable ENGINE=InnoDB;

# сделаем дамп БД vk, причем, только структуру таблиц
> mysqldump -u root -p --no-data vk > f:\temp\mysql_dumps\vk.sql

# создадим новую БД утилитой mysqladmin
> mysqladmin -u root -p create vk_copy

# восстановим дамп в новую БД
> mysql -u root -p vk_copy < f:\temp\mysql_dumps\vk.sql

# выведем в консоль список БД утилитой mysqlshow
> mysqlshow -u root -p

# выведем в консоль список таблиц новой БД vk_copy
> mysqlshow -u root -p vk


-- На «горячем» сервере полезно пользоваться опциями
o	--single-transaction
o	--quick
o	--lock-tables=false


# посмотреть список опций команды mysqldump
> mysqldump -- help


# создадим пользователя, который будет админом БД vk
CREATE USER 'vk_admin'@'localhost' IDENTIFIED BY '123123';

# дадим нашему пользователю все права на БД vk
GRANT ALL PRIVILEGES ON vk.* TO vk_admin@localhost;
--	Так можно делать только для тех данных, которые не очень важны!!!
# лучше давать права на минимально необходимые действия для учетной записи
GRANT Select ON sakila.* TO 'sakila_manager'@'localhost';
GRANT Show view ON sakila.* TO 'sakila_manager'@'localhost';

# применим изменения прав на сервере
FLUSH PRIVILEGES;

# посмотреть права пользователя также можно командой SHOW GRANTS
SHOW GRANTS FOR vk_admin@localhost;

# удалим пользователя vk_admin
DROP USER vk_admin@localhost;



