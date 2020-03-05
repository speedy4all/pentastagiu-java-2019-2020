package com.andreigs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    char[] s=in.nextLine().toCharArray(); int sl=s.length;

	    int ok=1;
	    for(int i=0; i<sl/2; i++)
	        if(s[i]!=s[sl-i-1])
            {
                ok=0;
                System.out.println("FALSE");
                break;
            }
	    if(ok==1)
            System.out.println("TRUE");
    }
}
