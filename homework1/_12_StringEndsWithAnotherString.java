import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _12_StringEndsWithAnotherString {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert a string: ");
			String string=in.readLine();
			System.out.print("Insert another string: ");
			String stringEnd=in.readLine();
			
			if(string.endsWith(stringEnd)) {
				System.out.println("TRUE");
			}else {
				System.out.println("FALSE");
			}
		
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}

}
