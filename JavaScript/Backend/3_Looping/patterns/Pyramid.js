console.log();
console.log("Pyramid");
let j = 5;
console.log();
for (let i = 1; i <= j; i++) {
    console.log(" ".repeat(5 - i) + "*".repeat(2 * i - 1) + " ".repeat(j));
}
console.log();