import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2_AverageAndSumOfNumbersBetween2Values {

	
	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("From: ");
			int firstVal = Integer.parseInt(in.readLine().trim());
			System.out.print("To: ");
			int secondVal = Integer.parseInt(in.readLine().trim());
			
			int sum=0;
			float average=0.f;
			int numbers=secondVal-firstVal+1;
			
			for(int i=0;i<numbers;i++) {
				sum+=firstVal;
				firstVal++;		
			}
			
			System.out.println("Sum: "+ sum);
			average=(float)sum/numbers;
			System.out.println("Average: "+ average);
			
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}
}