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
function primeList(int $endNum)
{
    for ($i = 0; $i <= $endNum; $i++)
    {
        $isPrime[] = true;
    }

    for ($i = 2; $i <= $endNum; $i++)
    {
        if ($isPrime[$i])
        {
            $j = $i + $i;
            while ($j <= $endNum)
            {
                $isPrime[$j] = false;
                $j += $i;
            }
        }
    }

    for ($i = 2; $i <= $endNum; $i++)
    {
        if ($isPrime[$i])
        {
            $listOfPrimes[] = $i;
        }
    }
    $listOfPrimes = array_reverse($listOfPrimes);

    return $listOfPrimes;
}

if (isset($_GET['num']))
{
    $num = intval(htmlspecialchars($_GET['num']));
    $primes = primeList($num);
    echo implode(" ", $primes);
}
?>
</body>
</html>