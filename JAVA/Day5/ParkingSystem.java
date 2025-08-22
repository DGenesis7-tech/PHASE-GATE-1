//1. define function to take in a list as argument and return a list of size 20, with all index having value of 0.
//2. value 0 representing empty slots available.
//3. value 1 representing filled slots in Park.
//4. define function that allows car to fill in empty slots from the right when string "right" is called as an argument.
//5. define function that allows car to fill in empty slots from the left when string "left" is called as an argument.
//5. define function that rmoves car from any designated position left or right if slot is empty by passing a number from 0 - 19 as an argument.



import java.util.ArrayList;
public class ParkingSystem {
public static void main(String[] args) {
ArrayList<String> slots = new ArrayList<>();
ParkingSystemFunction object = new ParkingSystemFunction();

slots = object.carSlots(slots);
System.out.println("Total slots available(0) is: " + slots);

slots = object.parkCarFromLeft(slots, "left");
slots = object.parkCarFromLeft(slots, "left");
slots = object.removeCarFromLeftOrRight(slots, 1);

int availableCount = 0;
int occupiedCount = 0;

for (int index = 0; index < slots.size(); index++){
if (slots.get(index) == "0"){
availableCount += 1;
}
if (slots.get(index) == "1"){
occupiedCount += 1;
}
}
System.out.println("Total slots available is: " + availableCount + " Total slots occupied is: " + occupiedCount);;
System.out.println("Parking slots display: " + slots);
}

}