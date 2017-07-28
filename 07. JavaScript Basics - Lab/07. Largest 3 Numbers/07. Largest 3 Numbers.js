function solve(input) {
    let inputArr = input.map(Number)
        .sort((a, b) => b-a)
        .slice(0,3);
    for (let currentNum of inputArr){
        console.log(currentNum);
    }
}

solve([ '10', '10', '5', '0', '50', '5' ]);