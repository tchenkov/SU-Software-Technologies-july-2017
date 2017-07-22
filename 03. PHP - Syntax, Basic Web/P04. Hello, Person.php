<?php
    if (isset($_GET['person'])){
        $person = htmlspecialchars($_GET['person']);
        echo "Hello, $person!";
    }
    else {
?>
<form action="P04.%20Hello,%20Person.php">
    Names: <input type="text" name="person"/>
    <input type="submit"/>
</form>
<?php } ?>