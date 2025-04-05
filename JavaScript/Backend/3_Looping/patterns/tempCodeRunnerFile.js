console.log();
const prompt = require("prompt-sync")();
console.log("Inverted-Right-Angle-Triangle...!");
let rows = (Number(prompt("Enter a rows : ")));

console.log();
for(let i=rows; i>=0; i--){
    console.log("*".repeat(i));
}
console.log();