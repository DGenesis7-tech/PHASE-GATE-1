import java.util.Scanner;
public class taskTwo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Please enter first integer : ");
int firstInteger = input.nextInt();

System.out.print("Please enter second integer : ");
int secondInteger = input.nextInt();

System.out.print("Please enter third integer : ");
int thirdInteger = input.nextInt();

int sum = firstInteger + secondInteger + thirdInteger; 
float average = sum / 3;
int product = firstInteger * secondInteger * thirdInteger;
int preLargest = Math.max(firstInteger, secondInteger);
int largest = Math.max(preLargest, thirdInteger);
int preSmallest = Math.min(firstInteger, secondInteger);
int smallest = Math.min(preSmallest, thirdInteger);

System.out.println("Sum of integers is: " + sum);
System.out.println("Average of integers is: " + average);
System.out.println("Product of integers is: " + product);
System.out.println("Largest of integers is: " + largest);
System.out.println("Smallest of integers is: " + smallest);

	}
}	