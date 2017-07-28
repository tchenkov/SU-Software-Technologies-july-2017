function solve(input) {
    let inputArr = input.map(Number);
    let sum = 0;
    inputArr.forEach(e => sum += e);
    console.log(sum);
}

solve(['10', '20']);