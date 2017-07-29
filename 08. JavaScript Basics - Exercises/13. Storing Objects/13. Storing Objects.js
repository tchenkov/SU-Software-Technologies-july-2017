function solve(input) {
    let arrOfObj = [];
    for (let line of input){
        let lineArr = line.split(" -> ");
        let obj = {
            Name: lineArr[0],
            Age: Number(lineArr[1]),
            Grade: Number(lineArr[2])
        };
        arrOfObj.push(obj);
    }

    for (let object of arrOfObj){
        console.log(`Name: ${object.Name}`);
        console.log(`Age: ${object.Age}`);
        console.log(`Grade: ${object.Grade.toFixed(2)}`);
    }
}

solve(['Pesho -> 13 -> 6.00', 'Ivan -> 12 -> 5.57', 'Toni -> 13 -> 4.90']);
