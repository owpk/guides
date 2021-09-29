USE shop;

-- Получить название бренда с идентификатором 3;
SELECT name FROM brand WHERE id = 3;


-- Получить первые 2 типа товара;
SELECT * FROM product_type LIMIT 2;


-- Получить все категории товаров со скидкой < 10%, и отсортировать их по названию
SELECT * FROM category where discount < 10 ORDER BY name;

UPDATE category SET name = 'Головные уборы' WHERE id = 5;

SELECT * FROM category;

UPDATE category SET discount = 3 WHERE id IN ( 2 , 5 );

DELETE FROM category WHERE id = 5;