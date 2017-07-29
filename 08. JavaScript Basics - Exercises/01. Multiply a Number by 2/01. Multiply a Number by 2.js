function solve(input) {
    let num = Number(input[0]);
    let result = multiplyBy2(num);
    console.log(result);

    function multiplyBy2(number) {
        return number * 2;
    }
}

solve([ '7' ]);