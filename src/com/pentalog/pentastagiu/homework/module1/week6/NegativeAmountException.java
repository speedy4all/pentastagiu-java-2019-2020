package com.pentalog.pentastagiu.homework.module1.week6;

public class NegativeAmountException extends RuntimeException {
    boolean isDepositing;

    public NegativeAmountException(boolean isDepositing)
    {
        this.isDepositing = isDepositing;
    }

    @Override
    public String getMessage() {
        if(isDepositing)
            return "Cannot deposit negative amounts, try retrieving funds";
        else
            return "Cannot retrieve negative amounts, try depositing funds";
    }
}
