<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        table * {
            border: 1px solid black;
            width: 50px;
            height: 50px;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>
            Red
        </td>
        <td>
            Green
        </td>
        <td>
            Blue
        </td>
    </tr>
    <?php
        for ($i = 51; $i <= 255; $i+=51)
        { ?>
            <tr>
                <?php
                $rgb = [0, 0, 0];
                for ($c = 0; $c < 3; $c++)
                {
                    $rgb[$c] = $i; ?>
                <td style="background-color: rgb(<?=$rgb[0].','.$rgb[1].','.$rgb[2]?>)"></td>
                <?php
                $rgb[$c] = 0;
                } ?>
                </tr>
       <?php }
    ?>
</table>
</body>
</html>