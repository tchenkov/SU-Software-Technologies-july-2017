function solve(input) {
    let[num1, num2] = input.map(Number);
    let result = num1 <= num2 ?
        num1 * num2 :
        num1 / num2;
    console.log(result);
}

solve(['3', '2']);