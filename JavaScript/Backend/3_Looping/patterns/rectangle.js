console.log("Rectangle Pattern");
const prompt = require("prompt-sync")();

rows = Number(prompt("Enter a rows : "));
console.log();
for (let i = 0; i < rows; i++) {
    console.log(" * ".repeat(rows));
}
console.log();