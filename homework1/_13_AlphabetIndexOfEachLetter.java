import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _13_AlphabetIndexOfEachLetter {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert a string: ");
			String string=in.readLine().trim().toLowerCase();
			
			final String alphabet = "abcdefghijklmnopqrstuvwxyz";
			for(int i=0; i < string.length(); i++){
			    System.out.print(alphabet.indexOf(string.charAt(i))+1+ " ");
			}
				
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}

}
