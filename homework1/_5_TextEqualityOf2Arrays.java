import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _5_TextEqualityOf2Arrays {

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
			
			boolean ok=true;
			
			if(firstArray.length==secondArray.length) {
				for(int i=0;i<numbersInFirstArray;i++) {
					if(firstArray[i]!=secondArray[i]) {
						ok=false;
						break;
					}
				}
			}else {
				ok=false;
			}
			
			if(ok==true) {
				System.out.println("TRUE");
			}else {
				System.out.println("FALSE");
			}
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}

}