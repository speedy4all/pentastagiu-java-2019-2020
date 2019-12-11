import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10_StringContainsAnotherString {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert a string: ");
			String string=in.readLine();
			System.out.print("Insert the searched string: ");
			String searchedString=in.readLine();
			
			if(string.contains(searchedString)) {
				System.out.println("TRUE");
			}else {
				System.out.println("FALSE");
			}
	
			
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}
}
