/* 1. Сделать запрос, в котором мы выберем все данные о городе – регион, страна.*/

SELECT '1-й вариант - все города (но берём только первые 20 строк)' AS '';
SELECT _cities.title AS city, _regions.title AS region, _countries.title AS country
FROM _cities
LEFT JOIN _regions
ON region_id=_regions.id
LEFT JOIN _countries
ON _cities.country_id=_countries.id
LIMIT 20;

SELECT '2-й вариант - конкретные города Волгоград, Лондон (UK), Лагош (Португалия)' AS '';
SELECT _cities.title AS city, _regions.title AS region, _countries.title AS country
FROM _cities
LEFT JOIN _regions
ON region_id=_regions.id
LEFT JOIN _countries
ON _cities.country_id=_countries.id
WHERE _cities.title='Волгоград'
      OR _cities.title='London' AND _countries.title='Великобритания'
      OR _cities.title='Lagos' AND _regions.title LIKE '%Faro%'
ORDER BY _cities.title DESC;

/* Бонусный запрос
   Возвращает информацию о городах, страна которых в таблице _cities отличается от страны в таблице _regions.
   Анализ показал, что в изначальной базе таких расхождений между таблицами нет, но если предварительно выполнить команду
   update _regions set country_id=2 where id=1927460;
   то увидим города Кахетинской области (Грузия).
   Главное, не забыть потом сделать
   update _regions set country_id=7 where id=1927460;
*/

SELECT 'Бонусный вариант' AS '';
SELECT _cities.title AS city, _regions.title AS region, c1.title AS country_city, c2.title AS country_region
FROM _cities
LEFT JOIN _regions
ON region_id=_regions.id
LEFT JOIN _countries c1
ON _cities.country_id=c1.id
LEFT JOIN _countries c2
ON _regions.country_id=c2.id
WHERE NOT _cities.country_id=_regions.country_id;
