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
    for ($i = $startNum; $i > 0; $i--){
        if ($startNum % $i){
            echo $i." ";
        }
    }
}
?>
</body>
</html>