--users
INSERT INTO `users` (`firstname`,`lastname`,`email`,`password_hash`,`phone`) VALUES 
("Tamekah","Chan","blandit.Nam.nulla@enimnectempus.co.uk",33949225,"8958155130"),
("Ralph","Chavez","at@elit.ca",78818799,"8941837860"),
("Lucy","Rutledge","faucibus@Phasellusornare.net",16886912,"8906332534"),
("McKenzie","Reilly","fermentum.metus@acmattis.ca",59823386,"8950697968"),
("Dahlia","Terry","ultrices@egetlaoreet.co.uk",92766418,"8980219305"),
("Gareth","Curtis","et@quislectus.com",29165759,"8942884124"),
("Drew","Curtis","vel.mauris.Integer@ametconsectetuer.co.uk",53188007,"8998830705"),
("Madonna","Burch","pede.sagittis.augue@eueuismodac.edu",68116523,"8928373184"),
("Renee","Gill","Nulla.tempor@tellus.edu",39838769,"8943304902"),
("Leslie","Knox","amet.ante@Nuncmaurissapien.net",62207740,"8953331302");

--profiles
INSERT INTO `profiles` (`user_id`,`gender`,`birthday`,`photo_id`,`created_at`,`hometown`) VALUES 
(1,"m","1970-08-10 14:33:05",907045,CURRENT_TIMESTAMP,"Rocca d'Arce"),
(2,"m","1988-01-20 12:09:02",223236,CURRENT_TIMESTAMP,"Bellevue"),
(3,"f","1990-06-21 23:47:46",145352,CURRENT_TIMESTAMP,"Villa Faraldi"),
(4,"m","1978-05-19 01:46:49",284021,CURRENT_TIMESTAMP,"Quirihue"),
(5,"f","1994-01-20 06:51:04",205804,CURRENT_TIMESTAMP,"Town of Yarmouth"),
(6,"m","1983-07-11 23:58:55",648711,CURRENT_TIMESTAMP,"Gwadar"),
(7,"m","1977-04-12 10:46:58",709439,CURRENT_TIMESTAMP,"Khanewal"),
(8,"m","1979-07-31 16:44:58",76437,CURRENT_TIMESTAMP,"Smoky Lake"),
(9,"f","1991-03-15 15:05:12",850635,CURRENT_TIMESTAMP,"Helmsdale"),
(10,"f","1989-03-28 22:04:41",51952,CURRENT_TIMESTAMP,"Lac Ste. Anne");

--media_types
INSERT INTO `media_types` (`name`,`created_at`,`updated_at`) VALUES 
("image","2020-04-10 13:33:48","2020-10-07 08:51:24"),
("image","2019-12-02 21:28:05","2021-03-29 18:25:53"),
("image","2020-03-04 17:32:07","2020-10-25 19:07:47"),
("video","2020-04-28 03:37:53","2020-11-06 10:15:05"),
("video","2019-09-05 23:39:22","2020-08-02 16:14:15"),
("video","2020-01-27 19:17:23","2021-06-03 20:58:26"),
("text","2019-12-23 00:03:44","2020-10-25 11:00:39"),
("text","2020-02-13 23:43:46","2020-08-07 09:22:52"),
("text","2019-10-30 23:45:29","2021-01-21 01:13:08"),
("image","2019-12-07 22:01:13","2020-12-14 08:24:29"),
("image","2019-07-06 18:44:05","2021-05-11 22:21:24"),
("image","2019-11-15 17:07:32","2020-12-09 06:19:01"),
("video","2019-08-14 17:29:05","2020-12-26 09:41:21"),
("video","2020-03-12 12:42:03","2021-01-14 06:51:22"),
("video","2020-05-29 00:04:46","2020-06-28 00:59:43"),
("text","2020-02-03 19:45:46","2021-01-12 06:00:43");

--media
INSERT INTO `media` (`media_type_id`,`user_id`,`body`,`filename`,`size`,`metadata`,`created_at`,`updated_at`) VALUES 
(7,2,"Nullam vitae diam. Proin dolor.","sagittis.",1070,'{"some_data":"100"}',"2021-04-19 15:56:17",NULL),
(4,7,"ligula.","magna",1956,'{"some_data":"100"}',"2021-03-04 15:45:03",NULL),
(9,7,"gravida molestie arcu.","Sed",1747,'{"some_data":"100"}',"2019-09-16 21:04:28",NULL),
(2,7,"gravida","sed",1679,'{"some_data":"100"}',"2020-10-09 05:17:02",NULL),
(15,2,"cursus in,","dictum.",903,'{"some_data":"100"}',"2020-08-27 05:34:13",NULL),
(1,8,"consectetuer rhoncus.","sed",851,'{"some_data":"100"}',"2020-05-05 22:23:05",NULL),
(11,1,"mauris. Morbi","amet",911,'{"some_data":"100"}',"2020-04-24 22:12:12",NULL),
(2,3,"Nam","facilisis",867,'{"some_data":"100"}',"2019-10-24 03:16:20",NULL),
(3,6,"Sed","ligula.",1322,'{"some_data":"100"}',"2019-11-15 14:07:01",NULL),
(2,5,"ipsum. Suspendisse non","velit",1098,'{"some_data":"100"}',"2019-11-06 15:01:18",NULL),
(12,4,"purus mauris a nunc. In","erat.",1826,'{"some_data":"100"}',"2019-12-10 06:25:11",NULL),
(11,8,"est. Mauris eu","scelerisque",1176,'{"some_data":"100"}',"2021-04-25 03:40:57",NULL),
(14,3,"Proin vel nisl. Quisque fringilla","Aenean",1012,'{"some_data":"100"}',"2020-08-27 18:48:33",NULL),
(5,5,"Integer tincidunt","ut",1598,'{"some_data":"100"}',"2019-11-22 01:30:06",NULL),
(9,6,"ipsum primis","elit.",1016,'{"some_data":"100"}',"2021-05-02 15:38:37",NULL),
(6,10,"eget, volutpat ornare,","non",1533,'{"some_data":"100"}',"2020-12-24 14:34:08",NULL),
(2,8,"urna","dis",777,'{"some_data":"100"}',"2021-03-30 15:36:35",NULL),
(11,2,"adipiscing.","purus.",589,'{"some_data":"100"}',"2019-10-23 11:46:24",NULL),
(8,3,"Donec non","eget",992,'{"some_data":"100"}',"2019-11-02 12:13:02",NULL),
(9,8,"condimentum. Donec at","fermentum",636,'{"some_data":"100"}',"2021-02-02 15:46:40",NULL);

--communities
INSERT INTO `communities` (`name`,`admin_user_id`) VALUES 
("Praesent",10),
("Etiam",1),
("amet, dapibus",1),
("in, dolor.",7),
("eu eros.",8),
("dapibus ligula.",7),
("ornare, elit",9),
("urna. Ut",1),
("molestie arcu.",7),
("Aenean sed",5),
("in",8),
("lectus",7),
("semper",4),
("nunc",10),
("mauris",10),
("nulla vulputate",10),
("nisi dictum",2),
("penatibus",10),
("leo. Cras",9),
("imperdiet dictum",4);

--users_communities
INSERT INTO `users_communities` (`user_id`,`community_id`) VALUES (2,2),(2,3),(6,19),(1,17),(4,17),(10,3),(3,19),(6,15),(3,16),(5,2);

--photo_albums
INSERT INTO `photo_albums` (`name`,`user_id`) VALUES 
("blandit at,",7),("hendrerit a,",4),
("scelerisque",4),("non",6),
("ante",3),("non,",6),
("Proin",2),("placerat. Cras",3),
("Nunc",10),("augue eu",6);

--photos
INSERT INTO `photos` (`album_id`,`media_id`) VALUES (10,19),(5,12),(7,1),(10,11),(3,17),(7,10),(1,12),(1,6),(2,8),(1,6);

--messages
INSERT INTO `messages` (`from_user_id`,`to_user_id`,`body`,`created_at`) VALUES 
(2,3,"in, cursus","2020-06-23 23:41:53"),
(6,8,"Etiam imperdiet dictum magna. Ut tincidunt orci quis","2021-04-24 02:22:37"),
(4,6,"tristique pellentesque, tellus sem mollis dui, in sodales elit","2019-07-05 21:50:46"),
(2,3,"eu dolor","2019-08-17 06:25:32"),
(5,8,"Fusce dolor quam, elementum at, egestas","2020-02-13 00:53:13"),
(6,3,"feugiat. Sed nec","2021-03-19 10:05:19"),
(1,5,"ultrices.","2020-05-17 12:59:10"),
(6,4,"Maecenas iaculis aliquet diam. Sed diam lorem, auctor quis, tristique","2021-01-07 15:58:21"),
(4,3,"arcu. Sed","2019-11-23 11:43:08"),
(9,3,"auctor vitae,","2020-05-19 07:48:03");

-------------------------------------------------
-- 2 задание на выборку
SELECT DISTINCT firstname FROM users ORDER BY firstname ASC; 

-------------------------------------------------
-- 3 задание
ALTER TABLE vk.profiles ADD is_active TINYINT(1) NOT NULL;

UPDATE profiles
SET is_active = 1
WHERE YEAR(birthday) < YEAR(CURRENT_DATE()) - 18;

-------------------------------------------------
--4 задание
DELETE FROM messages
WHERE created_at > current_date();

