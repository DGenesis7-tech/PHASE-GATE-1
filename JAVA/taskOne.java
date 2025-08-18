import java.util.Scanner;
public class taskOne {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Please enter first integer : ");
int firstInteger = input.nextInt();

System.out.print("Please enter second integer : ");
int secondInteger = input.nextInt();

int squareOfFirstInt = firstInteger * firstInteger; 
int squareOfSecondInt = secondInteger * secondInteger;

int sumOfFirstAndSecondIntSquare = squareOfFirstInt + squareOfSecondInt;

int differenceOfFirstAndSecondIntSquare = squareOfFirstInt - squareOfSecondInt;

System.out.println("Square of first int : " + squareOfFirstInt);
System.out.println("Square of second int : " + squareOfSecondInt);
System.out.println("Sum of both squares : " + sumOfFirstAndSecondIntSquare);
System.out.println("Difference of both squares : " + differenceOfFirstAndSecondIntSquare);

	}

}