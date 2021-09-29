<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Сайт студента GeekBrains</title>
    <link rel = "stylesheet" href="style.css">
    <script type="text/javascript">


        var answer = parseInt(Math.random() *100) ;
        var tryCount = 0;
		var maxTryCount = 4;
        var userNumber = 1 ;

        function readInt() {
            var number =  document.getElementById("userAnswer").value ;
            return parseInt(number) ;
<!--            или так return + document.getElementById("userAnswer").value ;-->
        }

        function write(text) {
            document.getElementById("info").innerHTML = text ;
        }

        function hide(id) {
            document.getElementById(id).style.display = "none" ;
        }


        function guess() {
            tryCount++;
            var userAnswer = readInt() ;

            if(userAnswer == answer) {
                write("<b>Игрок " + userNumber + ". Поздравляю, вы угадали!</b>") ;
                hide("button") ;
                hide("userAnswer") ;
            } else if(tryCount >= maxTryCount){
                write("Вы проиграли<br>Правильный ответ: " + answer);
                hide("button");
                hide("userAnswer");
		    } else if (userAnswer > answer) {
                write("Игрок " + userNumber + ". Вы ввели слишком большое число<br><br>Слудующий Игрок. Введите число от 1 до 100") ;
            } else if (userAnswer < answer) {
                write("Игрок " + userNumber + ". Вы ввели слишком маленькое число<br><br>Слудующий Игрок. Введите число от 1 до 100") ;
            }

            if (userNumber ==1)
                userNumber = 2 ;
                else userNumber = 1 ;

        }
    </script>

</head>

<body>

<div class = "content">
    <div class = "header">
        <?php
                include "menu.php" ;
        ?>
    </div>

    <div class = "contentWrap">
        <div class = "content">
            <div class="center">

                <h1>Игра угадайка для двоих </h1>

                <div class="box">
                    <p id="info">Угадайте число от 0 до 100<br> У каждого игрока по две попытки<br> Ходит Игрок 1</p>
                    <input type="text" id="userAnswer">
                    <br>
                    <a href="#" onclick=" guess() ;" id="button" >Начать</a>
                </div>

            </div>

        </div>
    </div>




</div>
<div class = "footer">
    Copyright &copy; SPQR
</div>

</body>
</html>