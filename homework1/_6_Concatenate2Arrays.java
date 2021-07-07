import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _6_Concatenate2Arrays {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert the first array (elements separated by \" \"): ");
			
			String[] valuesFirstArray=in.readLine().split(" ");
			int numbersInFirstArray=valuesFirstArray.length;
			
			System.out.print("Insert the second array (elements separated by \" \"): ");
			
			
			String[] valuesSecondArray=in.readLine().split(" ");
			int numbersInSecondArray=valuesSecondArray.length;
			
			int[] firstArray=new int[numbersInFirstArray];
			for(int i=0;i<numbersInFirstArray;i++) {
				firstArray[i]=Integer.parseInt(valuesFirstArray[i]);
			}
			
			int[] secondArray=new int[numbersInSecondArray];
			for(int i=0;i<numbersInSecondArray;i++) {
				secondArray[i]=Integer.parseInt(valuesSecondArray[i]);
			}
			
			int numbersInResultArray=numbersInFirstArray + numbersInSecondArray;
			
			int[] resultArray=new int[numbersInResultArray];
			for(int i=0;i<numbersInFirstArray;i++) {
				resultArray[i]=firstArray[i];
			}
			for(int i=0;i<numbersInSecondArray;i++) {
				resultArray[i + numbersInFirstArray]=secondArray[i];
			}
			
			for(int nr:resultArray) {
				System.out.print(nr + " ");
			}
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
    }
}