<!DOCTYPE html>
<html>
<head>
	<meta charset = "utf-8">
	<title>Загадки</title>
	<link rel="stylesheet" href="style.css">
	
</head>
<body>

<div class="content">
<?php
	include "menu.php";
?>
<div class = "contentWrap">
	<div class ="content">
		<div class = "center">

			<h1>Загадки</h1>

			<div class ="box">

			<?php
		
				$userAnswer = $_GET["userAnswer1"];	
				$score = 0;
				if ($userAnswer== "гора"||$userAnswer=="скала"){
					$score++;
				}
				$userAnswer = $_GET["userAnswer2"];
	
				if ($userAnswer== "зубы"||$userAnswer=="клыки"){
					$score++;
				}
				$userAnswer = $_GET["userAnswer3"];
	
				if ($userAnswer== "ветер"||$userAnswer=="буря"){
					$score++;
				}
				echo "Правильно отвечено: ". $score
			 
			?>
				<form method="GET">
				<p>Не отыскать её корней,<br>Верхушка выше тополей.<br>Всё круче вверх она идёт-<br> Но не растёт</p>
				<input type = "text" name="userAnswer1">
				<p>"Тридцать белых коней<br>На двух красных холмах -<br>Разбегутся, сшибутся<br>И снова затихнут впотьмах.</p>
				<input type = "text" name="userAnswer2">
				<p>Без голоса кричит,<br>Без крыльев - а летает,<br>И безо рта свистит,<br>И без зубов кусает.</p>
				<input type = "text" name="userAnswer3">
				<br>
				<input type="submit" value="Ответить"name="">
			<p>
			</p>
		</div>
	</div>
</div>
	
	<div class="footer">
	Copyright &copy; VZ
	</div> 
</body>
</html>