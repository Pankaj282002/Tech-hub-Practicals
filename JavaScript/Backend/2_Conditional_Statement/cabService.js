const prompt = require("prompt-sync")();
console.log();
console.log("Cab Service.");
let firstCab = Number(prompt("Enter a First Cab Price : "));
let secondCab = Number(prompt("Enter a Second Cab Price : "));
if(firstCab == secondCab){
    console.log("Both cabs are same price");
}else if(firstCab < secondCab){
    console.log("First cab " + (secondCab - firstCab) + "Rs cheaper than Second Cab.");
    console.log("Chef should chose First Cab for saving money.");
}else{
    console.log("Second cab " + (firstCab - secondCab) +"Rs cheaper than First Cab.");
    console.log("Chef should chose Second Cab for saving money.");
}