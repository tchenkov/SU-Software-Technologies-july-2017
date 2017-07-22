<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num1" />
    M: <input type="text" name="num2" />
    <input type="submit" />
</form>
<ul>
    <?php
    function printList(string $content, int $count)
    {
        for ($i = 1; $i <= $count; $i++)
        { ?>
            <li><?= $content.$i ?></li>
        <?php }
    }

    if (isset($_GET['num1']) && isset($_GET['num2']))
    {
        $num1 = intval(htmlspecialchars($_GET['num1']));
        $num2 = intval(htmlspecialchars($_GET['num2']));

        for ($i = 1; $i <= $num1; $i++)
        { ?>
            <li>List <?= $i ?>
                <ul>
                    <?php
                    $content = "Element ".$i.".";
                    printList($content, $num2);
                    ?>
                </ul>
            </li>
    <?php
        }
    }
    ?>
</ul>
</body>
</html>