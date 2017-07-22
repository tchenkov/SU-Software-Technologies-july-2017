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
    $startNum = intval(htmlspecialchars($_GET['num']));
    echo $startNum % 2 ?
    $startNum :
    --$startNum;
    $startNum -= 2;
    for (; $startNum > 0; $startNum -= 2){
        echo " ".$startNum;
    }
}
?>
</body>
</html>