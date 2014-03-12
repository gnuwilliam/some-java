import java.util.ArrayList;


public class SimpleArrayLists {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("United States");
		arrList.add("Canada");
		arrList.add("Brazil");
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}

}
