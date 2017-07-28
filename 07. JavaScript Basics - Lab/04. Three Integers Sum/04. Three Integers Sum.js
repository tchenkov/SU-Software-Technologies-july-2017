function solve(input) {
    let inputArr = input[0].split(" ").map(Number);
    let negativeNumsCount = (inputArr.filter(e => e < 0)).length;
    if (negativeNumsCount === 1){
        inputArr.sort((e2, e1) => e2 > e1);
        let mem = inputArr[1];
        inputArr[1] = inputArr[2];
        inputArr[2] = mem;
    }
    else {
        inputArr.sort((e2, e1) => Math.abs(e2) > Math.abs(e1));
    }

    let [num1, num2, sum] = inputArr;
    if (num1 + num2 === sum){
        console.log(`${Math.min(num1, num2)} + ${Math.max(num1, num2)} = ${sum}`);
    }
    else {
        console.log("No");
    }
}

solve(['8 15 7']);