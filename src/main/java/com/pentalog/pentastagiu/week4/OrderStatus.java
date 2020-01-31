package com.pentalog.pentastagiu.week4;

public enum OrderStatus {
    IS_INITIALIZED(10),
    IN_PROGRESS(5),
    READY(2);

    private int maxNumberOfDaysTillDelivery;

    OrderStatus(int maxNumberOfDaysTillDelivery) {
        this.maxNumberOfDaysTillDelivery = maxNumberOfDaysTillDelivery;
    }

    public int getMaxNumberOfDaysTillDelivery() {
        return maxNumberOfDaysTillDelivery;
    }

    public void setMaxNumberOfDaysTillDelivery(int maxNumberOfDaysTillDelivery) {
        this.maxNumberOfDaysTillDelivery = maxNumberOfDaysTillDelivery;
    }
}
