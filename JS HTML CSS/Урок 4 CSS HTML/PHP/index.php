<!DOCTYPE html>
<html>
<head>
	<meta charset = "utf-8">
	<title>SK</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>

<div class="content">
<?php
	include "menu.php";
?>

	<h1>Главная страница</h1>

	<div class="center">
	<img src="img/immagine-peppa-pig.jpg">
		<div class="box_text">
			<p><b>Всем привет</b>. Меня зовут <i>Вячеслав</i>. Кодить я нормально не умею, поэтому вы смотрите на этот кошмар.</p>
			<p>Здесь вы можете поиграть в угадайку, посчитать всякие числа и добыть для себя новый пароль.</p>
			<br>
			<p>Вот пару активных ссылок: <br>
			<p>
			<a href="Riddles.html">Загадки</a>
			<a href="Угадайка.html">Угадайка</a>
			<a href="GuesserSerial.html">Массивы</a>
			<a href="PassGenerator.html">Генератор паролей</a>
			</p>
		</div>
	</div>
</div>
<br>
<br>
<br>
<br>
<br>
	<div class="footer">
	Copyright &copy; <?php echo date ("Y");?> VZ
	</div> 
</body>
</html>