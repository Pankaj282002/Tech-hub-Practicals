console.log();
console.log("Swap two numbers");
let a = 10;
let b = 20;

// Swapping two numbers using a temporary variable
console.log("Swaping Using third variable.");
console.log("Before Swapping a = " + a + " b = " + b);
let temp = a;
a = b;
b = temp;
console.log("After Swapping a = " + a + " b = " + b);

// Swapping two numbers without using a temporary variable
 console.log();
 console.log("Swapping Using without third variable.");
 console.log("Before Swapping a = " + a + " b = " + b);
 a = a + b;
 b = a - b;
 a = a - b;
 console.log("After Swapping a = " + a + " b = " + b);
