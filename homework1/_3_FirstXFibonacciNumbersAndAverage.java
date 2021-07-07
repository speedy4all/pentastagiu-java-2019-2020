import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _3_FirstXFibonacciNumbersAndAverage {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Insert a number: ");
			int x = Integer.parseInt(in.readLine().trim());
			List<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(1);
			for(int i=0;i<x-2;i++) {
				int ultim = list.get(list.size() - 1);
				int penultim = list.get(list.size() - 2);
				int numarNou = ultim + penultim;
				list.add(numarNou);
			}
		
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i)+" ");
				
			}
			
			int sum=0;
			for(int nr:list) {
				sum+=nr;
			}
			float average=(float)sum/x;
			
			System.out.println("\nAverage: " + average);

		} catch (Exception ex) {
			System.err.append(ex.toString());
		}
	}

}
