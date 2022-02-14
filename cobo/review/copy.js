const fs = require('fs')

let adjectives = fs.readFileSync("adjectives.csv", {encoding: "utf-8"})

adArr = adjectives.split("\n");

for (const adjective of adArr) {
    let word = adjective.split(",")[0];
    let rating = parseInt(adjective.split(",")[1]);

    if (rating >= 0) {
        fs.appendFileSync("positiveAdjectives.txt", word + "\n")
    }
    else {
        fs.appendFileSync("negativeAdjectives.txt", word + "\n")
    }
}