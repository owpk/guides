<!DOCTYPE html>
<html>
<head>
	<meta charset = "utf-8">
	<title>Работа с массивами</title>
	<link rel="stylesheet" href="style.css">
	<script type="text/javascript">
	
	
	var numbers = 0;
	var arrS = [];


	function write (id,text){ //перезапись элемента c id "info"
		document.getElementById(id).innerHTML=text;
	}

	function readUserData() {//получить значение из поля с id "userData"
		var number = document.getElementById("userData").value;
		return parseInt(number);
	}

	function serialNumbers(){ //задаем n числовой одномерный массив из последовательных чисел
		numbers = readUserData();
		var arr = [];
		for (var i=1;i<=numbers;i++) {
		arr.push(i);
		}
		arrS=arr;
		return write ("info","Ваши числа: "+arr);
	}

	/*function randomNumbers(){ //задаем n числовой одномерный массив из случайных чисел
		var arrR = [];
		userChoise++;
		for (var i=1;i<=numbers;i++) {
		var b = Math.round(Math.random()*100); 
		arr.push(b);
		}
		arrR=arrB;
		return write ("info","Ваши числа: "+arr);
	}*/

	function sumNumbers() { //суммируем цифры в новом массиве 

		var sum = 0;
		for (var i=0;i<numbers;i++) {
		sum = sum + arrS[i];
			}
			return write ("info2","Сумма: "+sum);
	}

	function maxNum () { //поиск максимального значения в новом массиве
		
			var max = arrS[0];
			for (var i=1; i<numbers; i++) { 
			if (max<arrS[i]) {
				max = arrS[i]	
			}	
		}
		return write ("info2","Максимальное число: "+max);
}
	function minNum (n,x) { //поиск минимального значения в новом массиве
		// 1 2 3 4 5
			var min = arrS[0];
			for (var i=1; i<numbers; i++) {
			if (min>arrS[i]) {
				min = arrS[i]	
			}
		}
		return write ("info2","Минимальное число: "+min);
}
	function parityNum (n,x) { //поиск четного числа
			
			var par = [];
			for (var i=0; i<=numbers-1; i++) {
			if (arrS[i]%2==0) {
				par.push(arrS[i]);
		}
	}
	if (par.length==0){
		par.push ("Нет четных чисел");
	}
	return write ("info2","Четные числа: "+par);
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

			<h1>Работа с массивами</h1>
			<div class ="buttons">
			<a id = "Check" href = "GuesserSerial.php" onclick>Последовательные числа</a>
			<a id = "Retry" href = "GuesserRandom.php" onclick >Случайные числа</a>
			</div>
			<div class = "box">
				<h2>Создать массив последовательных чисел<h2>
				<p id = "info">Задайте размер массива</p>
				<input type= "text" id="userData">
				<br>
				<a id = "Check" href = "#" onclick="serialNumbers();">Задать</a>
				<a id = "Retry" href = "GuesserSerial.html" onclick >Заново</a>
				<br>
				<br>
				<br>
				<p id = "info2"></p>
				<a id = "Sum" href = "#" onclick="sumNumbers();">Сумма</a>
				<a id = "Min" href = "#" onclick="minNum();">Min</a>
				<a id = "Max" href = "#" onclick="maxNum();">Max</a>
				<a id = "Par" href = "#" onclick="parityNum();">Четные</a>
		</div>
	</div>
</div>
	
	<div class="footer">
	Copyright &copy; VZ
	</div> 
</body>
</html>