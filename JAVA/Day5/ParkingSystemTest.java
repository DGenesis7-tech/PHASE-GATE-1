import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class ParkingSystemTest{
ArrayList<String> items = new ArrayList<>();

@Test

public void testToCheckIfSizeOfParkingSlotsIs20(){
ArrayList<String> slots = new ArrayList<>();
String space = "0";
for (int index = 0; index < 20; index++){
slots.add(space);
}
ParkingSystemFunction object = new ParkingSystemFunction();

items = object.carSlots(slots);

assertEquals(items, slots);
}

@Test

public void testToCheckIfCarIsParkedFromRight(){
ArrayList<String> slots = new ArrayList<>();
String space = "0";
for (int index = 0; index < 20; index++){
slots.add(space);
}
slots.remove(19);
slots.add(19, "1");

ParkingSystemFunction object = new ParkingSystemFunction();

items = object.parkCarFromRight(slots, "right");

assertEquals(items, slots);
}

@Test

public void testToCheckIfCarIsParkedFromLeft(){
ArrayList<String> slots = new ArrayList<>();
String space = "0";
for (int index = 0; index < 20; index++){
slots.add(space);
}
slots.remove(0);
slots.add(0, "1");

ParkingSystemFunction object = new ParkingSystemFunction();

items = object.parkCarFromLeft(slots, "left");

assertEquals(items, slots);
}

@Test

public void testToRemoveCarFromAnySlot(){
ArrayList<String> slots = new ArrayList<>();
String space = "0";
for (int index = 0; index < 20; index++){
slots.add(space);
}
slots.remove(1);
slots.add(1, "0");

ParkingSystemFunction object = new ParkingSystemFunction();

items = object.removeCarFromLeftOrRight(slots, 1);

assertEquals(items, slots);
}


}