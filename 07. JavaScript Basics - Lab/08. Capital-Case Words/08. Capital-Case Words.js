function solve(input) {
    var inputString = input.join(" ");
    var pattern = /\b[A-Z]+\b/g;
    var matches = [];
    var match = pattern.exec(inputString);
    while (match != null){
        matches.push(match[0])
        match = pattern.exec(inputString);
    }

    console.log(matches.join(", "));
}

solve([ 'We start by HTML, CSS, JavaScript, JSON and REST.',
    'Later we touch some PHP, MySQL and SQL.',
    'Later we play with C#, EF, SQL Server and ASP.NET MVC.',
    'Finally, we touch some Java, Hibernate and Spring.MVC.' ]);