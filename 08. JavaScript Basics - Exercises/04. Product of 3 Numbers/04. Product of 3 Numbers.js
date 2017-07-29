function solve(input) {
    let inputArr = input.map(Number);
    let result = productSign(inputArr);
    console.log(result);

    function productSign(numArr) {
        if (inputArr.indexOf(0) >= 0){
            return "Positive";
        }
        let negativeCount = 0;
        numArr.map(e => negativeCount += e < 0 ? 1 : 0);

        return negativeCount % 2 ?
            "Negative" :
            "Positive";
    }
}

solve(['-2', '0', '-1']);