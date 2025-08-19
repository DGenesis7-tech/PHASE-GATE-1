public class TaskOne {

public int ageDifference(int fathersAge, int sonsAge){
int yearsDifference;
int twiceSonsAge = sonsAge * 2;
if (fathersAge > twiceSonsAge) {
yearsDifference = fathersAge - twiceSonsAge;
}
else if (fathersAge < twiceSonsAge){
yearsDifference = twiceSonsAge - fathersAge;
}
else {
yearsDifference = 0;
}
return yearsDifference;
}


public static void main(String[] args){
TaskOne object = new TaskOne();
int result = object.ageDifference(50, 10);
System.out.println(result);
}
}
