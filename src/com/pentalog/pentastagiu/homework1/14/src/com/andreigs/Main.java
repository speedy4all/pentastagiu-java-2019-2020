package com.andreigs;

import java.util.Scanner;

public class Main {

    public static char[] insert(char[] s, int pos, int sl){
        char[] newarr = new char[sl + 1];

        for(int i=0; i<pos; i++)
            newarr[i]=s[i];

        newarr[pos]='#';

        for(int i=pos+1; i<sl+1; i++)
            newarr[i]=s[i-1];

        return newarr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s=in.nextLine().toCharArray(); int sl=s.length;

        for(int i=0; i<sl-1; i++)
            if(s[i]==s[i+1]){
                s=insert(s, i+1, sl);
                sl++;
            }

        for(int i=0; i<sl; i++)
            System.out.print(s[i]);
    }
}
