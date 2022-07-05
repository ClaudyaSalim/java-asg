import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Validation {

	boolean shoeName(String name) {
		return name.endsWith("shoe") ? true : false;
	}
	
	boolean shoeCategory (String category) {
		return (category.contentEquals("Sneaker") || category.contentEquals("Running") || 
				category.contentEquals("Boot")) ? true : false;
	}
	
	boolean shoeRelease (String release) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			sdf.setLenient(false);
			sdf.parse(release);
		} catch(ParseException pe) {
			return false;
		}
		return true;
	}
	
	boolean shoePrice (Integer price) {
		return (price >= 5000) ? true: false;
	}

}
