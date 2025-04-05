console.log();
console.log("Right-Angle-Triangle");
const prompt = require("prompt-sync")();

console.log();
let rows = (Number(prompt("Enter a Rows : ")));
for(let i=0; i<=rows; i++){
    console.log(" * ".repeat(i));
}
console.log();