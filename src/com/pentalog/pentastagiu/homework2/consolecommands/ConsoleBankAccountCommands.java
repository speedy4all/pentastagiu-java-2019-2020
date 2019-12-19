package com.pentalog.pentastagiu.homework2.consolecommands;

public enum ConsoleBankAccountCommands {
    WITHDRAW, DEPOSIT, ESCAPE;

    public static void showAllCommands(){
        System.out.println(WITHDRAW.toString() + ": "+ WITHDRAW.ordinal());
        System.out.println(DEPOSIT.toString() + ": "+ DEPOSIT.ordinal());
        System.out.println(ESCAPE.toString() + ": "+ ESCAPE.ordinal());
    }
}
