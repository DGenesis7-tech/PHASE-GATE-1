public class TaskTwo {

public String averageScore(int firstScore, int secondScore, int thirdScore){
String grade = "";
double averageScore = (firstScore + secondScore + thirdScore) / 3;
if (90 <= averageScore && averageScore <= 100){
grade = "A";
}
if (80 <= averageScore && averageScore < 90){
grade = "B";
}
if (70 <= averageScore && averageScore < 80){
grade = "C";
}
if (60 <= averageScore && averageScore < 70){
grade = "D";
}
if (0 <= averageScore && averageScore < 60){
grade = "F";
}
return grade;
}

public static void main(String[] args){
TaskTwo object = new TaskTwo();
String result = object.averageScore(20, 20, 20);
System.out.println(result);
}
}
