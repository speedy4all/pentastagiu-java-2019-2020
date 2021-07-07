import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1_SumFrom0ToUpToATargetNumber {
	
	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Target number: ");
			int val = Integer.parseInt(in.readLine().trim());
			
			int sum=0;
			int n=1;
			for(int i=0;i<val;i++) {
				sum+=n;
				n++;
			}
			
			
			System.out.println(sum);
				
		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}

}