import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _9_OddAndEvenNumberInArray {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert an array (elements separated by \" \"): ");
			
			String[] values=in.readLine().split(" ");
			int numbers=values.length;
			
			int[] array=new int[numbers];
			for(int i=0;i<numbers;i++) {
				array[i]=Integer.parseInt(values[i]);
			}
			
			int oddNumbers=0;
			int evenNumbers=0;
			
			for(int i=0;i<numbers;i++) {
				if(array[i]%2==0) {
					oddNumbers++;
				}else {
					evenNumbers++;
				}
			}
			
			System.out.println("Odd numbers: "+ oddNumbers);
			System.out.println("Even numbers: "+ evenNumbers);
			
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}
}
