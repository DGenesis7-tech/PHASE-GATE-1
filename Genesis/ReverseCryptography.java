public class ReverseCryptography{
public static void main(String[] args){
FourIntegerPrompt object = new FourIntegerPrompt();
int verifiedData = object.readFourIntInput();
int firstDigit = verifiedData / 1000;
int secondDigit = (verifiedData / 100) % 10;
int thirdDigit = (verifiedData % 100) / 10;
int fourthDigit =  (verifiedData % 10);
int reverseFirstMod = (firstDigit - 7 + 10) % 10;
int reverseSecondMod = (secondDigit - 7 + 10)  % 10;
int reverseThirdMod = (thirdDigit - 7 + 10)  % 10;
int reverseFourthMod = (fourthDigit - 7 + 10)  % 10;
String reverseData = "" + reverseThirdMod + reverseFourthMod + reverseFirstMod + reverseSecondMod; 

System.out.println("Reverse Decrypted data : " + reverseData);
}
}