import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _11_CharacterAppearancesInAString {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert a string: ");
			char[] stringChars=in.readLine().toCharArray();
			System.out.print("Insert a character: ");
			char searchedChar=in.readLine().charAt(0);
			
			int appearances=0;
			
			for(int i=0;i<stringChars.length;i++) {
				if(stringChars[i]==searchedChar) {
					appearances++;
				}
			}
	
			System.out.println("Appearances: "+ appearances);
			
			
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}

}
