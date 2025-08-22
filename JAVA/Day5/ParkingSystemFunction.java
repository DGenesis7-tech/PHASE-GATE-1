import java.util.ArrayList;

public class ParkingSystemFunction {
ArrayList<String> slots = new ArrayList<>();

public static ArrayList<String> carSlots(ArrayList<String> slots){
String empty = "0";
for (int index = 0; index < 20; index++){
slots.add(empty);
}
return slots;
}

public static ArrayList<String> parkCarFromRight(ArrayList<String> slots, String choice){
for (int index = 19; index >= 0; index--){
if (choice.toLowerCase() == "right" && slots.get(index) == "0"){
slots.remove(index);
slots.add(index, "1");
break;
}
}
return slots;
}

public static ArrayList<String> parkCarFromLeft(ArrayList<String> slots, String choice){

for (int index = 0; index < 20 ; index++){
if (choice.toLowerCase() == "left" && slots.get(index) == "0"){
slots.remove(index);
slots.add(index, "1");
break;
}
}
return slots;
}

public static ArrayList<String> removeCarFromLeftOrRight(ArrayList<String> slots, int choice){
for (int index = 0; index < 20 ; index++){
if (slots.get(index) == "1"){
slots.remove(choice);
slots.add(choice, "0");
break;
}
}
return slots;
}



}



