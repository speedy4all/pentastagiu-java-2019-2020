import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _8_IndexOfATargetElement {
	
	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert an array (elements separated by \" \"): ");
			
			String[] values=in.readLine().split(" ");
			int numbers=values.length;
			
			System.out.print("Insert the searched number: ");
			int number=Integer.parseInt(in.readLine().trim());
			
			int appearances=0;
			
			int[] array=new int[numbers];
			for(int i=0;i<numbers;i++) {
				array[i]=Integer.parseInt(values[i]);
				if(array[i]==number) {
					appearances++;
				}
			}
			
			int[] indexesOfNumber=new int[appearances];
			int j=0;
			for(int i=0;i<numbers;i++) {
				if(array[i]==number) {
					indexesOfNumber[j]=i;
					j++;
				}
			}
			
			if(indexesOfNumber.length==0) {
				System.out.println("The searched number does not appear in array!");
			}else {
				System.out.print("Indexes of searched number: ");
				for(int i=0;i<indexesOfNumber.length;i++) {
					System.out.print(indexesOfNumber[i]+ " ");
				}
			}
			
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}

}
