-- == SELECT <столбец> == --
-- вывести названя всех категорий товаров
SELECT name FROM category;

-- вывести названия и скидки товаров
SELECT discount, name  FROM category;

-- вывести все скидки
SELECT discount FROM category;


-- DISTINCT
-- вывести все уникальные значения скидок
SELECT DISTINCT discount FROM category;

-- == ORDER BY == --
-- вывести все категории товаров, и отсортировать их по размеру скидки
SELECT * FROM category ORDER BY discount; -- ASC;

-- == ORDER BY == --
-- вывести все категории товаров, и отсортировать их по размеру скидки в обратном порядке
SELECT * FROM category ORDER BY discount DESC;

-- вывести все категории товаров с ненулевой скидкой, и отсортировать их по размеру скидки в обратном порядке
SELECT * FROM category WHERE discount <> 0 ORDER BY discount DESC;

-- == LIMIT == --
-- вывести первые 2 категории товара
SELECT * FROM category LIMIT 2;

-- вывести первые 2 категории товара со скдикой не равной нулю
SELECT * FROM category WHERE discount <> 0 LIMIT 2;