//1. define function to take in a list as argument and return a list of size 20, with all index having value of 0.
//2. value 0 representing empty slots available.
//3. value 1 representing filled slots in Park.
//4. define function that allows car to fill in empty slots from the right when string "right" is called as an argument.
//5. define function that allows car to fill in empty slots from the left when string "left" is called as an argument.
//5. define function that rmoves car from any designated position left or right if slot is empty by passing a number from 0 - 19 as an argument.



function carSlots(slotsArray) {
let empty = 0;
for (let index = 0; index < 20; index++){
slotsArray.push(empty);
}
return slotsArray;
}

function parkCarFromRight(slotsArray, choice){
for (let index = 19; index >= 0; index--){
if (choice.toLowerCase() == "right" && slotsArray[index] == 0){
slotsArray[index] += 1;
break 
}
}
return slotsArray;
}

function parkCarFromLeft(slotsArray, choice){
for (let index = 0; index < 20; index++){
if (choice.toLowerCase() == "left" && slotsArray[index] == 0){
slotsArray[index] += 1;
break 
}
}
return slotsArray;
}

function removeCarFromRightOrLeft(slotsArray, choice){
for (let index = 19; index >= 0; index--){
if (choice == index && slotsArray[index] == 1){
slotsArray[choice] -= 1;
break 
}
}
return slotsArray;
}





let myArray = [];
myArray = carSlots(myArray);
console.log("Total parking slots available (0) for available spaces (1) for the opposite: ", myArray);

myArray = parkCarFromRight(myArray, "right");
console.log("Parking(1) car from the right", myArray);
myArray = parkCarFromRight(myArray, "right");
console.log("Parking(1) car from the right", myArray);
myArray = parkCarFromLeft(myArray, "left");
console.log("Parking(1) car from the left", myArray);
myArray = removeCarFromRightOrLeft(myArray, 0);
console.log("Removing(0) car from the right or left", myArray);
console.log(myArray);
