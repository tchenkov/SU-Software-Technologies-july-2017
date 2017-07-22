<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        button{
            display: inline;
        }
    </style>
</head>
<body>
<?php
function buttonString(int $value)
{
    $style = $value == 1 ?
        "style='background-color: blue'" :
        "";
    return "<button $style>$value</button>";
}

function repeatButton(string $buttonStr, int $count){
    for ($i = 0; $i < $count; $i++)
    {
        echo $buttonStr;

    }
}

 repeatButton(buttonString(1), 5);
?> <br/> <?php
for ($i = 0; $i < 3; $i++)
{
    echo buttonString(1);
     repeatButton(buttonString(0), 4);
    ?><br/><?php
}

 repeatButton(buttonString(1), 5);
?> <br/> <?php
for ($i = 0; $i < 3; $i++)
{
     repeatButton(buttonString(0), 4);
    echo buttonString(1);
    ?><br/><?php
}

 repeatButton(buttonString(1), 5);
?>
</body>
</html>