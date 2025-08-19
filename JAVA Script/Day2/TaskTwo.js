function averageScore(firstScore, secondScore, thirdScore) {
let averageScore = (firstScore + secondScore + thirdScore) / 3;
let grade = "";
if (90 <= averageScore && averageScore <= 100) grade += "A";
if (80 <= averageScore && averageScore < 90) grade += "B";
if (70 <= averageScore && averageScore < 80) grade += "C";
if (60 <= averageScore && averageScore < 70) grade += "D";
if (0 <= averageScore && averageScore < 60) grade += "F";
return grade;
}

console.log(averageScore(20, 20, 20));