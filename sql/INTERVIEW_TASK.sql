 insert into cinema.schedules (movie_id, start_at_time, session_cost) values (3, '2021-02-11 21:44:52', 600);

 DELETE FROM cinema.schedules s WHERE s.id = 44 or s.id = 43; 
 SELECT * FROM cinema.schedules;

 DELETE FROM cinema.schedules s WHERE s.id = 21;
 SELECT * FROM cinema.schedules;

 SELECT m.title, m.runtime, s.start_at_time, s.end_at_time FROM cinema.schedules s JOIN cinema.movies m ON s.movie_id = m.id;

 WITH excepts AS (
     SELECT 
         m.title movie_title,
 		m.runtime runtime,
         generate_series(s.start_at_time, s.end_at_time, interval '1 minute') gs
     FROM cinema.schedules s JOIN cinema.movies m ON s.movie_id = m.id 
 )
 SELECT
     movie_title,
 	MIN(gs::time) AS start_time,
     MAX(gs::time) AS end_time
 FROM (
     SELECT
         *,
         SUM(same_time) OVER (PARTITION BY movie_title ORDER BY gs)
     FROM (
         SELECT
             movie_title,
              gs,
             COALESCE((gs - LAG(gs) OVER (PARTITION BY movie_title ORDER BY gs) >= interval '1 hour')::int, 0) as same_time
         FROM excepts
     ) s
 ) s
 GROUP BY movie_title, sum
 ORDER BY start_time;

 select to_timestamp(cast (extract(epoch from payment_date) as integer)) as time_ from payment;
 select to_timestamp(535 + cast (extract(epoch from payment_date) as integer)) as time_ from payment;
 SELECT 1 from customer where address_id < 10;
 select amount from payment;


 select m.title as movie_title,
 s.start_at_time::time as start_time,
 ((m.runtime ||' minutes')::interval + s.start_at_time::time)
 as end_time
 from cinema.schedules s
 left join cinema.movies m on s.movie_id = m.id;



 WITH series AS (
 	SELECT generate_series(
 		now()::date, now()::date + ('1 day')::interval, ('5 hour'::interval)) AS r_from
 ),
 range AS (
 	SELECT r_from, (r_from::time + '4 hour'::interval + '59 minute'::interval) AS r_to FROM series)
 SELECT r_from::time, r_to,
 	(SELECT COUNT(*)
 	 	FROM schedules s
 	 	WHERE s.start_at_time::time between r_from::time AND r_to::time) AS session_count,
	
 	(SELECT string_agg(m.title, ', ')
 	 	FROM schedules s 
 	 	JOIN movies m ON s.movie_id = m.id
 	 	WHERE s.start_at_time::time BETWEEN r_from::time AND r_to::time) AS movies,
    
     (SELECT sum(s.session_cost) 
         FROM schedules s 
         WHERE s.start_at_time::time BETWEEN r_from::time AND r_to::time) AS box_office
 FROM range;