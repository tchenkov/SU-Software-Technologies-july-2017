<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        button {
            display: block;
        }
    </style>
</head>
<body>
<form>
    N: <input type="text" name="num" />
    <input type="submit" />
</form>
<?php
if (isset($_GET['num']))
{
    $num = intval(htmlspecialchars($_GET['num']));
    for ($i = 1; $i <= $num; $i++)
    {
        echo "<button>$i</button>";
    }
}
?>
</body>
</html>