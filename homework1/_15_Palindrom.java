import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _15_Palindrom {

	public static void main(String[] args) {
		 try{
	            try(BufferedReader in=new BufferedReader(new InputStreamReader(System.in))){
	            	System.out.print("Insert a string: ");
	                String string=in.readLine();
	                
	                StringBuilder sb=new StringBuilder();
	                int nr=string.length();
	                for(int i=nr-1;i>=0;i--) {
	                	sb.append(string.charAt(i));
	                }
	                if(sb.toString().equals(string.toString())) {
	                	System.out.println("TRUE");
	                }
	                else {
	                	System.out.println("FALSE");
	                }
	                
	            }            
	        }
	        catch(Exception ex){
	            System.err.append(ex.toString());
	        }

	}

}
