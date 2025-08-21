import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskOneTest{
@Test

public void testToReturnPossitiveIfFathersAgeIsGreaterThanTwiceSonsAge(){

int fathersAge = 50;
int sonsAge = 10;

TaskOne object = new TaskOne();

int result = object.ageDifference(fathersAge, sonsAge);

assertEquals(30, result);
}

}
//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class TaskOneTest
