import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _4_TestEqualityOfFirstAndLastElementOfAnArray {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert an array (elements separated by \" \"): ");
			
			String[] values=in.readLine().split(" ");
			int numbers=values.length;
			
			int[] array=new int[numbers];
			for(int i=0;i<numbers;i++) {
				array[i]=Integer.parseInt(values[i]);
			}
			
			if(array[0]==array[array.length-1]) {
				System.out.println("TRUE");
			}else {
				System.out.println("FALSE");
			}
			
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}

}
