<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Сайт студента GeekBrains</title>
    <link rel = "stylesheet" href="style.css">


</head>

<body>

 <div class = "content">
 <?php
    include "menu.php" ;
 ?>

<div class = "contentWrap">
    <div class = "content">
        <div class="center">

            <h1>Игра в загадки</h1>

            <div class="box">
                <?php
                    if(isset($_GET["userAnswer1"]) && isset($_GET["userAnswer2"]) && isset($_GET["userAnswer3"])) {

                        $userAnswer = $_GET["userAnswer1"] ;
                        $score = 0 ;
                        if($userAnswer=="водопровод" || $userAnswer == "канализация" ) {
                            $score++ ;
                        }

                        $userAnswer = $_GET["userAnswer2"] ;
                            if($userAnswer=="календарь" ) {
                            $score++ ;
                        }

                        $userAnswer = $_GET["userAnswer3"] ;
                            if($userAnswer=="шахматный" || $userAnswer == "мёртвый" ) {
                            $score++ ;
                        }

                        echo "Вы угадали "  .  $score .  " загадок" ;
                    }
                ?>

                <form method="GET">
                    <p>Речка спятила с ума.<br> По домам пошла сама.</p>
                    <input type="text" name="userAnswer1">

                    <p>На раскрашенных страницах<br> много праздников хранится.</p>
                    <input type="text" name="userAnswer2">

                    <p>Какой конь не есть овса?</p>
                    <input type="text" name="userAnswer3">

                    <br>
                    <br>
                    <br>
                    <input type="submit" value="Ответ" name="">
                </form>
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