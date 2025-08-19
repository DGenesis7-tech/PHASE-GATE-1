function ageDifference(fathersAge, sonsAge){
const twiceSonsAge = sonsAge * 2;
let yearsDifference = 0;
if (fathersAge > twiceSonsAge) yearsDifference = fathersAge - twiceSonsAge;
else if (fathersAge < twiceSonsAge) yearsDifference = twiceSonsAge - fathersAge;
else yearsDifference = 0;
return yearsDifference;
}

console.log(ageDifference(50, 10));