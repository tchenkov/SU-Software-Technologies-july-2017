<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num" />
    <input type="submit" />
</form>
<?php
if (isset($_GET['num'])){
    $endNum = intval(htmlspecialchars($_GET['num']));
    echo $i = 2;
    $i += 2;
    for (; $i <= $endNum; $i += 2){
        echo " ".$i;
    }
}
?>
</body>
</html>