use shop;

-- == SELECT == --
-- Вывести все категории товаров
SELECT * from category;

-- Вывести все категории товаров с идентификатором, равным 3
SELECT * from category WHERE id = 3;

-- Вывести все категории товаров, у котрых скидка не равна 0
SELECT * from category WHERE discount <> 0;


-- Вывести все категории товаров, у котрых скидка больше 5 
SELECT * from category WHERE discount > 5;

-- Вывести все категории товаров, у котрых скидка больше 5 и меньше 15
SELECT * from category WHERE (discount > 5) AND (discount < 15);

-- Вывести все категории товаров, у котрых скидка меньше 5 или больше или равна 10
SELECT * from category WHERE (discount < 5) OR (discount >= 10);


-- Вывести все категории товаров, у котрых скидка не меньше 5
SELECT * from category WHERE NOT (discount < 5);

-- Вывести всех юзеров имя которых начинается на букву "В" 
SELECT * from `order` where user_name like 'В%';

-- Вывести все категории товаров, у котрых есть псевдоним
SELECT * from category WHERE alias_name IS NOT NULL;

-- Вывести все категории товаров, у котрых нет псевдонима
SELECT * from category WHERE  alias_name IS NULL;
