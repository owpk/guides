--1. Проверить работу блокировки таблиц на примере 2 любых таблиц (команда LOCK TABLE, см. методичку).
	-- скрин приложен, проверил lock на write и read

--2. Подумать, какие операции являются транзакционными, и написать несколько примеров с транзакционными запросами. 
	-- добавление лайка и обновление счетчика лайков в таблице media

START TRANSACTION;
	SET @media_id = 20;

	INSERT INTO vk.likes
	(user_id, media_id, created_at)
	VALUES(6, @media_id, CURRENT_TIMESTAMP);

	UPDATE vk.media
	SET likes_count = media.likes_count + 1;
	WHERE id = @media_id;

COMMIT;

--3. Проанализировать несколько запросов с помощью EXPLAIN.

	EXPLAIN 
	SELECT communities.name, users.firstname FROM communities 
	INNER JOIN users ON admin_user_id = users.id;

	EXPLAIN
	SELECT messages.from_user_id, messages.to_user_id, u.firstname as from_id, us.firstname as to_id
	FROM vk.messages 
	INNER JOIN users u ON u.id = from_user_id
	INNER JOIN users us ON us.id = to_user_id;