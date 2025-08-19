import java.util.Scanner;
public class Cryptography{
public static void main(String[] args){
FourIntegerPrompt object = new FourIntegerPrompt();
int verifiedData = object.readFourIntInput();
int firstDigit = verifiedData / 1000;
int secondDigit = (verifiedData / 100) % 10;
int thirdDigit = (verifiedData % 100) / 10;
int fourthDigit =  (verifiedData % 100) % 10;
int firstMod = (firstDigit + 7) % 10;
int secondMod = (secondDigit + 7) % 10;
int thirdMod = (thirdDigit + 7) % 10;
int fourthMod = (fourthDigit + 7) % 10;
String data = "" + thirdMod + fourthMod + firstMod + secondMod ;
System.out.println(data);
}

}