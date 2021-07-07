import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _7_MinMaxAverageValuesFromAnArray {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert an array (elements separated by \" \"): ");
			
			String[] values=in.readLine().split(" ");
			int numbers=values.length;
			
			int[] array=new int[numbers];
			for(int i=0;i<numbers;i++) {
				array[i]=Integer.parseInt(values[i]);
			}
			
			
			int min=array[0];
			int max=array[0];
			float average=0;
			int sum=0;
			for(int i=0;i<array.length;i++) {
				if(min>array[i]) {
					min=array[i];
				}
				if(max<array[i]) {
					max=array[i];
				}
				sum+=array[i];
			}
			
			average=(float)sum/array.length;
			
			System.out.println("Minim = " + min + "\nMaxim = " + max + "\nAverage = " + average);
			
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}

}
