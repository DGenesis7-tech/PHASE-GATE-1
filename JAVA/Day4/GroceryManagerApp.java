import java.util.ArrayList;
import java.util.Scanner;
public class GroceryManagerApp{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
ArrayList<String> items = new ArrayList<String>();
GroceryAppFunctions object = new GroceryAppFunctions;

int select = 0;
	while (select != 4){
	
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
""");
System.out.println();
System.out.print("""
:> PLEASE SELECT AN OPPTION FROM THE GIVEN LIST OF OPTIONS (1 - 4) <:
""");
select = input.nextInt();

switch(select){
case 1:
	System.out.println("Enter grocery to add to your list : ");
	String item = input.next();
	items.add(item);
	break;

case 2:	 			 
	for (int index = 0; index < items.size(); index++) {
	if (items.size() < 0){
	System.out.println("Your list is empty");
	}
	System.out.printf(" %s%n", items.get(index));
	}
	System.out.println("Enter grocery to remove from your list : ");
	item = input.next();
	item.toLowerCase();
	items.remove(item);
	System.out.println(item + " was removed from list");
	break;

case 3:
	for (int index = 0; index < items.size(); index++) {
	if (items.size() < 0){
	System.out.println("Your list is empty");
	}
	System.out.printf(" %s%n", items.get(index));
	}
	break;

case 4:
	System.out.println("Closing app. Come again bye!!!");
	break;

default :
	System.out.println("Invalid input");
	
	}

}



}

}