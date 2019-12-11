import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _14_InsertHashTagBetweenDuplicateLetters {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert a string: ");
			char[] stringChars=in.readLine().toCharArray();
			
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<stringChars.length-1;i++) {
				if(stringChars[i]!=stringChars[i+1]) {
					sb.append(stringChars[i]);
				}else {
					sb.append(stringChars[i]);
					sb.append("#");
				}
			}
			
			sb.append(stringChars[stringChars.length-1]);
			
			System.out.println(sb.toString());
			
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}
}
