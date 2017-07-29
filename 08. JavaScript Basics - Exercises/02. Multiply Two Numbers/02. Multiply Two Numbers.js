function solve(input) {
    let inputArr = input.map(Number);
    let result = 1;
    inputArr.map(e => result *= e);
    console.log(result);
}

solve([ '2', '3' ]);