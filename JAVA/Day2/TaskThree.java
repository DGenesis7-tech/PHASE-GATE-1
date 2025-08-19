public class TaskThree {
public String likeSystem(String[] array){
String output = "";
if (array.length == 0){
output = "no one likes this";
}
if (array.length == 1){
output = array[0] + " likes this";
}
if (array.length == 2){
output = array[0] + " and " + array[1] + " likes this";
}
if (array.length == 3){
output = array[0] + ", " + array[1] + " and " + array[2] + " likes this";
}
if (array.length > 3){
output = array[0] + ", " + array[1] + " and " + (array.length - 2) + " others like this";
}
return output;
}


public static void main(String[] args){
TaskThree object = new TaskThree();
String[] myArray ={"Max", "John", "Mark"};
String result = object.likeSystem(myArray);
System.out.println(result);
 
}

}