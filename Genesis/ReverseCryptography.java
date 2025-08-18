import java.util.Scanner;
public class ReverseCryptography{
public static void main(System[] args){
FourIntegerPrompt object = new FourIntegerPrompt();
int verifiedData = object.readFourIntInput();
int firstDigit = verifiedData / 1000;
int secondDigit = (verifiedData / 100) % 10;
int thirdDigit = (verifiedData % 100) / 10;
int fourthDigit =  (verifiedData % 100) % 10;
int reverseFirstMod = ((firstDigit - 7) + 10) % 10;
int reverseSecondMod = ((secondDigit - 7) + 10)  % 10;
int reverseThirdMod = ((thirdDigit -7) + 10)  % 10;
int reverseFourth= ((fourthDigit - 7) + 10)  % 10;
