import com.automobile.Ford;
import com.automobile.Logan;

public class Assignment4 {

	public static void main(String[] args)
       {
		Logan logan = new Logan("Logan XYZ", "WB16F2222", "Bob Biswas", 220, 1);
		logan.getModelName();
		logan.getOwnerName();
		logan.getRegistrationNumber();
		logan.speed();
		System.out.println("Has GPS? " + logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford("Mustang GT", "WB16F4444", "Alice", 300, 1);
		ford.getModelName();
		ford.getOwnerName();
		ford.getRegistrationNumber();
		ford.speed();
		System.out.println("Has AC? " + ford.tempControl());
	}
}
