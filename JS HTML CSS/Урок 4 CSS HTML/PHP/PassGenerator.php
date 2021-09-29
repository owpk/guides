<!DOCTYPE html>
<html>
<head>
	<meta charset = "utf-8">
	<title>Генератор паролей</title>
	<title>Работа с массивами</title>
	<link rel="stylesheet" href="style.css">
	<script type="text/javascript">
	
	
	var numbers = 0;
	var arr = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"];

	
	function write (id,text){ //перезапись элемента c id "info"
		document.getElementById(id).innerHTML=text;
	}

	function readUserData() {//получить значение из поля с id "userData"
		var number = document.getElementById("userData").value;
		return parseInt(number);
	}

	function randomNumbers(numbers){ //генерирует 2 случайные цифры и включает их в пароль в произвольном порядке. Также выбирает случайные буквы в пароле и делает их большими;
		var text ="";
		var passArr = [];
		numbers = readUserData();
		for (var i=0;i<numbers;i++) {
		var c = Math.round(Math.random()*100);
		var b = Math.round(Math.random()*arr.length-1);
		if (b<0){
			b++;
		}
		if (c>50){
			passArr.push(arr[b]);
			passArr[i] = passArr[i].toUpperCase(); 
			}else {
				passArr.push(arr[b]);
			}
		}
		if (passArr.length>3) {
		for (var i=0;i<2;i++) {//тут можно задать сколько цифр будет у вас в пароле.
		var x = Math.round(Math.random()*passArr.length-1);
		if (x<0){
			x++;
		}
		var a = Math.round(Math.random()*9);
			passArr[x]=a;
		}
	}
		for (var i=0;i<passArr.length;i++){
			text=text+passArr[i];
		}
		return write ("info","Ваш пароль: "+text);
	}
</script>
</head>
<body>

<div class="content">
	<?php
	include "menu.php";
?>
<div class = "contentWrap">
	<div class ="content">
		<div class = "center">

			<h1>Генератор пароля</h1>
			<div class = "box">
				<h2>Создать пароль<h2>
				<p id = "info">Задайте размер пароля</p>
				<input type= "text" id="userData">
				<br>
				<a id = "Check" href = "#" onclick="randomNumbers();">Генерировать</a>
		</div>
	</div>
</div>
	
	<div class="footer">
	Copyright &copy; VZ
	</div> 
</body>
</html>