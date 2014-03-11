import java.text.DateFormat;
import java.util.Date;


public class SimpleDate {

	public static void main(String[] args) {
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT);
		
		String date = df.format(d);
		System.out.println(date);
	}

}
