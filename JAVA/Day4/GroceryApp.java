import java.util.ArrayList;
import java.util.Scanner;

public class GroceryApp {
ArrayList<String> items = new ArrayList<>();
Scanner input = new Scanner(System.in);

public void run() {
int select = 0;
while (select != 4) {
displayMenu();
select = input.nextInt();
           
switch (select) {
case 1 : 
addItem();
break;
case 2 : 
removeItem();
break;
case 3 : 
displayItems();
break;
case 4 : 
System.out.println("Closing app. Come again bye!!!");
break;
default : 
System.out.println("Invalid input, please enter a number");
break;
}
}

}

public void displayMenu() {
System.out.print("""
::> WELCOME TO YOUR GROCERY APP <:::::::::::
1. ADD ITEM TO YOUR GROCERY LIST.
2. REMOVE ITEM FROM YOUR GROCERY LIST.
3. DISPLAY ALL ITEMS CURRENTLY IN YOUR LIST.
4. EXIT APP.
::::::::::::::::::::::::::::::::::::::::::::
NOTE!!!!!>
*YOU CAN ONLY ADD ONE ITEM PER ENTRY!	
*YOU CAN ONLY REMOVE ONE ITEM PER ENTRY!
::::::::::::::::::::::::::::::::::::::::::::
:> PLEASE SELECT AN OPTION FROM THE GIVEN LIST OF OPTIONS (1 - 4) <:
""");
}

public void addItem() {
System.out.println("Enter grocery to add to your list:");
String item = input.next().toLowerCase();
items.add(item);
System.out.println(item + " added to the list.");
return;
}
public void addItem(String item) {
items.add(item.toLowerCase());
}

public void removeItem() {
if (items.size() == 0){
System.out.println("Your list is empty");
}
else {
for (int index = 0; index < items.size(); index++) {
System.out.printf(" %s%n", items.get(index));
}
}
System.out.println("Enter grocery to remove from your list:");
String item = input.next().toLowerCase();
items.remove(item);
System.out.println(item + " was removed from list.");
return;
}

public void displayItems() {
if (items.size() < 0){
System.out.println("Your list is empty");
}
else {
for (int index = 0; index < items.size(); index++) {
System.out.printf(" %s%n", items.get(index));
}
}
}
public static void main(String[] args) {
new GroceryApp().run();
    }


}