import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class GroceryAppTest{
ArrayList<String> items = new ArrayList<>();

@Test

public void testToKnowIfItemAddedToList(){

String item = "goat";

GroceryApp object = new GroceryApp();

object.addItem("goat");

assertEquals(1, object.items.size());
assertEquals("goat", object.items.get(0));
}

@Test
public void testToRemoveItemWithParameter() {

String item = "Milk";

GroceryApp object = new GroceryApp();
object.addItem(item);

object.removeItem();

assertEquals(0, object.items.size());
assertEquals("Milk", item);
    }

@Test
public void testToAddMultipleItems() {

String item1 = "Apple";
String item2 = "Banana";

GroceryApp object = new GroceryApp();

object.addItem("Apple");
object.addItem("Banana");

assertEquals(2, object.items.size());
    
}
}
