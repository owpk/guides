DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `firstname` varchar(50) DEFAULT NULL,
  `lastname` varchar(50) DEFAULT NULL COMMENT 'users',
  `email` varchar(120) DEFAULT NULL,
  `password_hash` varchar(100) DEFAULT NULL,
  `phone` bigint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phone` (`phone`),
  KEY `users_firstname_lastname_idx` (`firstname`,`lastname`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='users';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Tamekah','Chan','blandit.Nam.nulla@enimnectempus.co.uk','33949225',8958155130),(2,'Ralph','Chavez','at@elit.ca','78818799',8941837860),(3,'Lucy','Rutledge','faucibus@Phasellusornare.net','16886912',8906332534),(4,'McKenzie','Reilly','fermentum.metus@acmattis.ca','59823386',8950697968),(5,'Dahlia','Terry','ultrices@egetlaoreet.co.uk','92766418',8980219305),(6,'Gareth','Curtis','et@quislectus.com','29165759',8942884124),(7,'Drew','Curtis','vel.mauris.Integer@ametconsectetuer.co.uk','53188007',8998830705),(8,'Madonna','Burch','pede.sagittis.augue@eueuismodac.edu','68116523',8928373184),(9,'Renee','Gill','Nulla.tempor@tellus.edu','39838769',8943304902),(10,'Leslie','Knox','amet.ante@Nuncmaurissapien.net','62207740',8953331302),(12,'Troy','Baker','troyBaker@gmail.com','1234545645',1235456);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_communities`
--
DROP TABLE IF EXISTS `media`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `media` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `media_type_id` bigint unsigned NOT NULL,
  `user_id` bigint unsigned NOT NULL,
  `body` text,
  `filename` varchar(255) DEFAULT NULL,
  `size` int DEFAULT NULL,
  `metadata` json DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `likes_count` bigint DEFAULT NULL,
  UNIQUE KEY `id` (`id`),
  KEY `user_id` (`user_id`),
  KEY `media_type_id` (`media_type_id`),
  CONSTRAINT `media_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `media_ibfk_2` FOREIGN KEY (`media_type_id`) REFERENCES `media_types` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `media`
--

LOCK TABLES `media` WRITE;
/*!40000 ALTER TABLE `media` DISABLE KEYS */;
INSERT INTO `media` VALUES (1,7,2,'Nullam vitae diam. Proin dolor.','sagittis.',1070,'{\"some_data\": \"100\"}','2021-04-19 15:56:17',NULL,NULL),(2,4,7,'ligula.','magna',1956,'{\"some_data\": \"100\"}','2021-03-04 15:45:03',NULL,NULL),(3,9,7,'gravida molestie arcu.','Sed',1747,'{\"some_data\": \"100\"}','2019-09-16 21:04:28',NULL,NULL),(4,2,7,'gravida','sed',1679,'{\"some_data\": \"100\"}','2020-10-09 05:17:02',NULL,NULL),(5,15,2,'cursus in,','dictum.',903,'{\"some_data\": \"100\"}','2020-08-27 05:34:13',NULL,NULL),(6,1,8,'consectetuer rhoncus.','sed',851,'{\"some_data\": \"100\"}','2020-05-05 22:23:05',NULL,NULL),(7,11,1,'mauris. Morbi','amet',911,'{\"some_data\": \"100\"}','2020-04-24 22:12:12',NULL,NULL),(8,2,3,'Nam','facilisis',867,'{\"some_data\": \"100\"}','2019-10-24 03:16:20',NULL,NULL),(9,3,6,'Sed','ligula.',1322,'{\"some_data\": \"100\"}','2019-11-15 14:07:01',NULL,NULL),(10,2,5,'ipsum. Suspendisse non','velit',1098,'{\"some_data\": \"100\"}','2019-11-06 15:01:18',NULL,NULL),(11,12,4,'purus mauris a nunc. In','erat.',1826,'{\"some_data\": \"100\"}','2019-12-10 06:25:11',NULL,NULL),(12,11,8,'est. Mauris eu','scelerisque',1176,'{\"some_data\": \"100\"}','2021-04-25 03:40:57',NULL,NULL),(13,14,3,'Proin vel nisl. Quisque fringilla','Aenean',1012,'{\"some_data\": \"100\"}','2020-08-27 18:48:33',NULL,NULL),(14,5,5,'Integer tincidunt','ut',1598,'{\"some_data\": \"100\"}','2019-11-22 01:30:06',NULL,NULL),(15,9,6,'ipsum primis','elit.',1016,'{\"some_data\": \"100\"}','2021-05-02 15:38:37',NULL,NULL),(16,6,10,'eget, volutpat ornare,','non',1533,'{\"some_data\": \"100\"}','2020-12-24 14:34:08',NULL,NULL),(17,2,8,'urna','dis',777,'{\"some_data\": \"100\"}','2021-03-30 15:36:35',NULL,NULL),(18,11,2,'adipiscing.','purus.',589,'{\"some_data\": \"100\"}','2019-10-23 11:46:24',NULL,NULL),(19,8,3,'Donec non','eget',992,'{\"some_data\": \"100\"}','2019-11-02 12:13:02',NULL,NULL),(20,9,8,'condimentum. Donec at','fermentum',636,'{\"some_data\": \"100\"}','2021-02-02 15:46:40','2020-07-06 19:15:33',16);
/*!40000 ALTER TABLE `media` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `communities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `communities` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(150) DEFAULT NULL,
  `admin_user_id` bigint unsigned NOT NULL,
  UNIQUE KEY `id` (`id`),
  KEY `communities_name_idx` (`name`),
  KEY `admin_user_id` (`admin_user_id`),
  CONSTRAINT `communities_ibfk_1` FOREIGN KEY (`admin_user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `communities`
--

LOCK TABLES `communities` WRITE;
/*!40000 ALTER TABLE `communities` DISABLE KEYS */;
INSERT INTO `communities` VALUES (1,'Praesent',10),(2,'Etiam',1),(3,'amet, dapibus',1),(4,'in, dolor.',7),(5,'eu eros.',8),(6,'dapibus ligula.',7),(7,'ornare, elit',9),(8,'urna. Ut',1),(9,'molestie arcu.',7),(10,'Aenean sed',5),(11,'in',8),(12,'lectus',7),(13,'semper',4),(14,'nunc',10),(15,'mauris',10),(16,'nulla vulputate',10),(17,'nisi dictum',2),(18,'penatibus',10),(19,'leo. Cras',9),(20,'imperdiet dictum',4);
/*!40000 ALTER TABLE `communities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `friend_requests`
--

DROP TABLE IF EXISTS `friend_requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `friend_requests` (
  `initiator_user_id` bigint unsigned NOT NULL,
  `target_user_id` bigint unsigned NOT NULL,
  `status` enum('requested','approved','unfriended','declined') DEFAULT NULL,
  `requested_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `confirmed_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`initiator_user_id`,`target_user_id`),
  KEY `target_user_id` (`target_user_id`),
  CONSTRAINT `friend_requests_ibfk_1` FOREIGN KEY (`initiator_user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `friend_requests_ibfk_2` FOREIGN KEY (`target_user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `friend_requests_chk_1` CHECK ((`initiator_user_id` <> `target_user_id`)),
  CONSTRAINT `friend_requests_chk_2` CHECK ((`initiator_user_id` <> `target_user_id`))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friend_requests`
--

LOCK TABLES `friend_requests` WRITE;
/*!40000 ALTER TABLE `friend_requests` DISABLE KEYS */;
/*!40000 ALTER TABLE `friend_requests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `lesson6_view`
--

DROP TABLE IF EXISTS `lesson6_view`;
/*!50001 DROP VIEW IF EXISTS `lesson6_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `lesson6_view` AS SELECT 
 1 AS `firstname`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `likes`
--

DROP TABLE IF EXISTS `likes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `likes` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint unsigned NOT NULL,
  `media_id` bigint unsigned NOT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  UNIQUE KEY `id` (`id`),
  KEY `likes_fk` (`media_id`),
  KEY `likes_fk_1` (`user_id`),
  CONSTRAINT `likes_fk` FOREIGN KEY (`media_id`) REFERENCES `media` (`id`),
  CONSTRAINT `likes_fk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `likes`
--

LOCK TABLES `likes` WRITE;
/*!40000 ALTER TABLE `likes` DISABLE KEYS */;
INSERT INTO `likes` VALUES (1,6,5,'2020-07-06 18:47:21');
/*!40000 ALTER TABLE `likes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `media`
--


--
-- Table structure for table `media_types`
--

DROP TABLE IF EXISTS `media_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `media_types` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `media_types`
--

LOCK TABLES `media_types` WRITE;
/*!40000 ALTER TABLE `media_types` DISABLE KEYS */;
INSERT INTO `media_types` VALUES (1,'image','2020-04-10 13:33:48','2020-10-07 08:51:24'),(2,'image','2019-12-02 21:28:05','2021-03-29 18:25:53'),(3,'image','2020-03-04 17:32:07','2020-10-25 19:07:47'),(4,'video','2020-04-28 03:37:53','2020-11-06 10:15:05'),(5,'video','2019-09-05 23:39:22','2020-08-02 16:14:15'),(6,'video','2020-01-27 19:17:23','2021-06-03 20:58:26'),(7,'text','2019-12-23 00:03:44','2020-10-25 11:00:39'),(8,'text','2020-02-13 23:43:46','2020-08-07 09:22:52'),(9,'text','2019-10-30 23:45:29','2021-01-21 01:13:08'),(10,'image','2019-12-07 22:01:13','2020-12-14 08:24:29'),(11,'image','2019-07-06 18:44:05','2021-05-11 22:21:24'),(12,'image','2019-11-15 17:07:32','2020-12-09 06:19:01'),(13,'video','2019-08-14 17:29:05','2020-12-26 09:41:21'),(14,'video','2020-03-12 12:42:03','2021-01-14 06:51:22'),(15,'video','2020-05-29 00:04:46','2020-06-28 00:59:43'),(16,'text','2020-02-03 19:45:46','2021-01-12 06:00:43');
/*!40000 ALTER TABLE `media_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `messages` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `from_user_id` bigint unsigned NOT NULL,
  `to_user_id` bigint unsigned NOT NULL,
  `body` text,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  UNIQUE KEY `id` (`id`),
  KEY `from_user_id` (`from_user_id`),
  KEY `to_user_id` (`to_user_id`),
  CONSTRAINT `messages_ibfk_1` FOREIGN KEY (`from_user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `messages_ibfk_2` FOREIGN KEY (`to_user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (31,2,3,'in, cursus','2020-06-23 23:41:53'),(33,4,6,'tristique pellentesque, tellus sem mollis dui, in sodales elit','2019-07-05 21:50:46'),(34,2,3,'eu dolor','2019-08-17 06:25:32'),(35,5,8,'Fusce dolor quam, elementum at, egestas','2020-02-13 00:53:13'),(37,1,5,'ultrices.','2020-05-17 12:59:10'),(39,4,3,'arcu. Sed','2019-11-23 11:43:08'),(40,9,3,'auctor vitae,','2020-05-19 07:48:03');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `photo_albums`
--

DROP TABLE IF EXISTS `photo_albums`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `photo_albums` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `user_id` bigint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `photo_albums_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `photo_albums`
--

LOCK TABLES `photo_albums` WRITE;
/*!40000 ALTER TABLE `photo_albums` DISABLE KEYS */;
INSERT INTO `photo_albums` VALUES (1,'blandit at,',7),(2,'hendrerit a,',4),(3,'scelerisque',4),(4,'non',6),(5,'ante',3),(6,'non,',6),(7,'Proin',2),(8,'placerat. Cras',3),(9,'Nunc',10),(10,'augue eu',6);
/*!40000 ALTER TABLE `photo_albums` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `photos`
--

DROP TABLE IF EXISTS `photos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `photos` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `album_id` bigint unsigned NOT NULL,
  `media_id` bigint unsigned NOT NULL,
  UNIQUE KEY `id` (`id`),
  KEY `album_id` (`album_id`),
  KEY `media_id` (`media_id`),
  CONSTRAINT `photos_ibfk_1` FOREIGN KEY (`album_id`) REFERENCES `photo_albums` (`id`),
  CONSTRAINT `photos_ibfk_2` FOREIGN KEY (`media_id`) REFERENCES `media` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `photos`
--

LOCK TABLES `photos` WRITE;
/*!40000 ALTER TABLE `photos` DISABLE KEYS */;
INSERT INTO `photos` VALUES (1,10,19),(2,5,12),(3,7,1),(4,10,11),(5,3,17),(6,7,10),(7,1,12),(8,1,6),(9,2,8),(10,1,6);
/*!40000 ALTER TABLE `photos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profiles`
--

DROP TABLE IF EXISTS `profiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profiles` (
  `user_id` bigint unsigned NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `photo_id` bigint unsigned DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `hometown` varchar(100) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL,
  UNIQUE KEY `user_id` (`user_id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profiles`
--

LOCK TABLES `profiles` WRITE;
/*!40000 ALTER TABLE `profiles` DISABLE KEYS */;
INSERT INTO `profiles` VALUES (1,'f','2020-08-10',907045,'2020-06-28 16:10:44','Rocca d\'Arce',0),(2,'f','2021-01-20',223236,'2020-06-28 16:10:44','Bellevue',0),(3,'m','2020-06-21',145352,'2020-06-28 16:10:44','Villa Faraldi',0),(4,'m','2020-05-19',284021,'2020-06-28 16:10:44','Quirihue',0),(5,'f','2021-01-20',205804,'2020-06-28 16:10:44','Town of Yarmouth',0),(6,'f','2020-07-11',648711,'2020-06-28 16:10:44','Gwadar',0),(7,'m','2021-04-12',709439,'2020-06-28 16:10:44','Khanewal',0),(8,'m','2019-07-31',76437,'2020-06-28 16:10:44','Smoky Lake',0),(9,'f','2020-03-15',850635,'2020-06-28 16:10:44','Helmsdale',0),(10,'f','2021-03-28',51952,'2020-06-28 16:10:44','Lac Ste. Anne',0);
/*!40000 ALTER TABLE `profiles` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `check_user_age_before_update` BEFORE UPDATE ON `profiles` FOR EACH ROW begin
    IF NEW.birthday >= CURRENT_DATE() THEN
        SET NEW.birthday = now();
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `users`
--



DROP TABLE IF EXISTS `users_communities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_communities` (
  `user_id` bigint unsigned NOT NULL,
  `community_id` bigint unsigned NOT NULL,
  PRIMARY KEY (`user_id`,`community_id`),
  KEY `community_id` (`community_id`),
  CONSTRAINT `users_communities_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `users_communities_ibfk_2` FOREIGN KEY (`community_id`) REFERENCES `communities` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_communities`
--

LOCK TABLES `users_communities` WRITE;
/*!40000 ALTER TABLE `users_communities` DISABLE KEYS */;
INSERT INTO `users_communities` VALUES (2,2),(5,2),(2,3),(10,3),(6,15),(3,16),(1,17),(4,17),(3,19),(6,19);
/*!40000 ALTER TABLE `users_communities` ENABLE KEYS */;
UNLOCK TABLES;

