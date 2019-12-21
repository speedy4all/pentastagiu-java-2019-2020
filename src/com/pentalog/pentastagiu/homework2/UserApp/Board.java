package com.pentalog.pentastagiu.homework2.UserApp;


import java.util.ArrayList;
import java.util.List;

public class Board {
    private static int NumberOfMessages;
    private static  List<String> AllMesages = new ArrayList<>();
    Messages messages;

    public void AddMessage(Messages messages){
        AllMesages.add(messages.getDescription());
        AllMesages.add(messages.getAuthor());
        NumberOfMessages++;
    }
    public void DispalyMessages()
    {
        String arr[]= new String[AllMesages.size()];
        for (int i =0; i < AllMesages.size(); i++)
            arr[i] = AllMesages.get(i);
        int j=0;
        while(j<AllMesages.size())
        {
            System.out.println(arr[j]+" wrote by "+ arr[j+1]);
            j+=2;
        }

    }
}
