DROP TABLE IF EXISTS users;
CREATE TABLE users(
	id SERIAL PRIMARY KEY, 
	firstname VARCHAR(50),
	lastname VARCHAR(50),
	email VARCHAR(120) UNIQUE,
	password_hash VARCHAR(100),
	phone BIGINT UNIQUE, 
	
	CHECK(phone > 0)
);

CREATE INDEX idx_people_names 
ON users (lastname, firstname);

DROP TABLE IF EXISTS profiles;
CREATE TABLE profiles (
	user_id SERIAL PRIMARY KEY,
	gender CHAR(1),
	birthday DATE,
	photo_id BIGINT NULL,
	created_at timestamp DEFAULT NOW(),
	hometown VARCHAR(100)
);

ALTER TABLE profiles ADD CONSTRAINT fk_user_id
	FOREIGN KEY (user_id) REFERENCES users(id)
	ON UPDATE CASCADE -- (значение по умолчанию)
	ON DELETE restrict; -- (значение по умолчанию)

DROP TABLE IF EXISTS messages;
CREATE TABLE messages (
	id SERIAL PRIMARY KEY,
	from_user_id BIGINT NOT NULL,
	to_user_id BIGINT NOT NULL,
	body TEXT,
	created_at timestamp DEFAULT NOW(), -- можно будет даже не упоминать это поле при вставке

	FOREIGN KEY (from_user_id) REFERENCES users(id),
	FOREIGN KEY (to_user_id) REFERENCES users(id)
);

create type friendship_status as enum('requested', 'approved', 'unfriended', 'declined');

DROP TABLE IF EXISTS friend_requests;
CREATE TABLE friend_requests (
	-- id SERIAL PRIMARY KEY, -- изменили на составной ключ (initiator_user_id, target_user_id)
	initiator_user_id BIGINT NOT NULL,
	target_user_id BIGINT NOT NULL,
	status friendship_status,
	-- status TINYINT(1) UNSIGNED, -- в этом случае в коде хранили бы цифирный enum (0, 1, 2, 3...)
	requested_at timestamp DEFAULT NOW(),
	confirmed_at timestamp,
	
	PRIMARY KEY (initiator_user_id, target_user_id),
	FOREIGN KEY (initiator_user_id) REFERENCES users(id),
	FOREIGN KEY (target_user_id) REFERENCES users(id),
	CHECK (initiator_user_id <> target_user_id)
);
-- чтобы пользователь сам себе не отправил запрос в друзья
ALTER TABLE friend_requests 
ADD CHECK(initiator_user_id <> target_user_id);

DROP TABLE IF EXISTS communities;
CREATE TABLE communities(
	id SERIAL PRIMARY KEY,
	name VARCHAR(150),
	admin_user_id BIGINT NOT NULL,
	
	foreign key (admin_user_id) references users(id)
);

CREATE INDEX communities_name_idx 
ON communities (name);

DROP TABLE IF EXISTS users_communities;
CREATE TABLE users_communities(
	user_id BIGINT NOT NULL,
	community_id BIGINT NOT NULL,
  
	PRIMARY KEY (user_id, community_id), -- чтобы не было 2 записей о пользователе и сообществе
	FOREIGN KEY (user_id) REFERENCES users(id),
	FOREIGN KEY (community_id) REFERENCES communities(id)
);

DROP TABLE IF EXISTS media_types;
CREATE TABLE media_types(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255), -- записей мало, поэтому в индексе нет необходимости
	created_at timestamp DEFAULT NOW(),
	updated_at timestamp
);

DROP TABLE IF EXISTS media;
CREATE TABLE media(
	id SERIAL PRIMARY KEY,
	media_type_id BIGINT NOT NULL,
	user_id BIGINT NOT NULL,
  	body text,
	filename VARCHAR(255),
	-- file blob,		
	size INT,
	metadata JSON,
	created_at timestamp DEFAULT NOW(),
	updated_at timestamp,

	FOREIGN KEY (user_id) REFERENCES users(id),
	FOREIGN KEY (media_type_id) REFERENCES media_types(id)
);

DROP TABLE IF EXISTS likes;
CREATE TABLE likes(
	id SERIAL PRIMARY KEY,
	user_id BIGINT NOT NULL,
	media_id BIGINT NOT NULL,
	created_at timestamp DEFAULT NOW()
);

DROP TABLE IF EXISTS photo_albums;
CREATE TABLE photo_albums (
	id SERIAL, 
	name varchar(255) DEFAULT NULL,
	user_id BIGINT DEFAULT NULL,

	FOREIGN KEY (user_id) REFERENCES users(id),
  	PRIMARY KEY (id)
);

DROP TABLE IF EXISTS photos;
CREATE TABLE photos (
	id SERIAL PRIMARY KEY,
	album_id BIGINT NOT NULL,
	media_id BIGINT NOT NULL,

	FOREIGN KEY (album_id) REFERENCES photo_albums(id),
	FOREIGN KEY (media_id) REFERENCES media(id)
);

ALTER TABLE likes 
ADD CONSTRAINT likes_fk 
FOREIGN KEY (media_id) REFERENCES media(id);

ALTER TABLE likes 
ADD CONSTRAINT likes_fk_1 
FOREIGN KEY (user_id) REFERENCES users(id);

