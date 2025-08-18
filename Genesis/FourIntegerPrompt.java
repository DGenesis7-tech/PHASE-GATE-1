import java.util.Scanner;

public class FourIntegerPrompt{

Scanner input = new Scanner(System.in); 
public int readFourIntInput(){
int number;
do{
System.out.print("Please enter four numbers : ");
number = input.nextInt();
if (number >= 1000 && number <= 9999){
return number;
}
else {
System.out.println("Invalid Input!!!, TRY AGAIN!!!");
}
} while (true);
}

public static void main(String[] args){
FourIntegerPrompt object = new FourIntegerPrompt();
int verifiedNumber = object.readFourIntInput();
System.out.println(verifiedNumber);

}

}


