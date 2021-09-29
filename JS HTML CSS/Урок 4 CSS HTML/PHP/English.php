<!DOCTYPE html>
<html>
<head>
	<meta charset = "utf-8">
	<title>IT English</title>
	<link rel="stylesheet" href="style.css">
	<script type="text/javascript">
			
			var counter=0;
			var answCor = [];
			var x = [
		["apply for ","устраиваться"],
		["degree ","степень"],
		[" elementary ","базовый"],
		[" implement ","внедрять"],
		[" intermediate ","средний"],
		[" layout ","формат"],
		[" operate ","работать"],
		[" part-time ","неполная ставка"],
		[" relevant ","соответствующий"],
];
function show (id) {
		document.getElementById(id).style.display = "block";
	}
function hide (id) {
		document.getElementById(id).style.display = "none";
	}
function write (id,text){ //перезапись элемента c id "info"
		document.getElementById(id).innerHTML=text;
	}

function readUserData() {//получить значение из поля с id "userData"
		var usAnsw = document.getElementById("userData").value;
		return usAnsw;
	}
			
function start(){
		counter=0;
	i = parseInt(Math.random()*x.length-1);
		if (i<0) i++;
	
	write ("info","Как переводится слово "+x[i][0]);
	write ("next","Далее");
	write ("Check","Проверить");

	hide ("start");
	}

function nextWord (){
	if (x.length==0){
		write("info","Начните заново");
		write("restart","Заново");
		hide ("check");
		write("info2","Отвечено верно: "+answCor);
	} 
		counter=0;
	i = parseInt(Math.random()*x.length);
		if (i<0) i++;
		write ("info","Как переводится слово "+x[i][0]);
		show ("Check");
}

function getAnsw(tryCounter){
		var usAnsw = readUserData();
		counter++;
	if (x.length==0)
		write("info","Начните заново");
		
	if (usAnsw!=x[i][1]) 
		write ("info","Нет, еще "+(tryCounter-counter)+" поптыки, слово "+x[i][0]);
		

	if (counter==tryCounter) {
		write ("info","Не верно<br>"+x[i][0]+" - "+x[i][1]+"<br>нажмите далее");
		hide ("Check");
		x.splice(i,1); 
		answInc.push(x[i][0]);
		}

	if (usAnsw==x[i][1]) {
		counter=tryCounter;
			
		write ("info","Верно, нажмите Далее");

		hide ("Check");
		answCor.push(x[i][1]+" - "+x[i][0]+"<br>");
		write ("info2",answCor);
	
		x.splice(i,1);
		} 
	}
	
</script>
</head>
<body>

<div class="content">
<?php
	include "menu.php";
?>
	<h1>IT English</h1>
	<p id = "info2"></p>
	<div class="center">
		<div class="box_text">
			<a id = "start" href = "#" onclick="start();">Начать</a><a id = "next" href = "#" onclick="nextWord();"></a>
			<a id = "restart" href = "English.php" onclick=""></a>
			<p>	<p id = "info">Как переводится слово</p>
				

				<input type= "text" id="userData">
				<a id = "Check" href = "#" onclick="getAnsw(2);"></a>
				
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
<meta charset="utf-8">
