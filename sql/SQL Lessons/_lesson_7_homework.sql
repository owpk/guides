-- Задача 3.
-- общее количество лайков, которые получили пользователи младше 10 лет. 
-- (решение с вложенными запросами)

select count(*) -- количество лайков
from likes
where media_id in ( -- все медиа записи таких пользователей
	select id 
	from media 
	where user_id in ( -- все пользователи младше 10 лет
		select 
			user_id
		-- 	, birthday
		from profiles as p
		where  YEAR(CURDATE()) - YEAR(birthday) < 10
	)
);

-- решение с объединением таблиц
select count(*) -- количество лайков
from likes l
join media m on l.media_id = m.id
join profiles p on p.user_id = m.user_id
where  YEAR(CURDATE()) - YEAR(birthday) < 10;

-- Задача 4.
-- Определить кто больше поставил лайков (всего) - мужчины или женщины?
select 
	gender
	, count(*)
from (
	select 
		user_id as user,
		(
			select gender 
			from vk.profiles
			where user_id = user
		) as gender
	from likes
) as dummy
group by gender;

-- решение с объединением таблиц
SELECT  gender, COUNT(*)
from likes
join profiles on likes.user_id = profiles.user_id 
group by gender;
