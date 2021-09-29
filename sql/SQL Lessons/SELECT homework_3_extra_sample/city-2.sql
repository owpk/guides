# 2. Выбрать все города из Московской области

SELECT 'Все города Московской области' AS '';

SELECT '1-й вариант (Join)' AS '';

SELECT _cities.title AS city
FROM _cities
INNER JOIN _regions
ON region_id=_regions.id
WHERE _regions.title='Московская область'
ORDER BY city;

/* Второй вариант - во-первых, обходимся без явного join, во-вторых, покажем только счётчик */
SELECT '2-й вариант (old style)' AS '';

SELECT COUNT(_cities.title) AS city
FROM _cities, _regions
WHERE region_id=_regions.id AND _regions.title='Московская область';

/* Третий вариант - вложенный подзапрос. Тоже только подсчёт количества городов, дабы не засорять вывод */
SELECT '3-й вариант (nested)' AS '';

SELECT COUNT(_cities.title) AS city
FROM _cities
WHERE region_id=(SELECT id
                 FROM _regions
                 WHERE _regions.title='Московская область');
