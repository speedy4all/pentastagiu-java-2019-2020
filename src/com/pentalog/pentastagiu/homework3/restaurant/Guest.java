package com.pentalog.pentastagiu.homework3.restaurant;
public class Guest {

    private Integer currentNumberOGuests;
    private Boolean addNewGuest=true;
    private  Integer totalNumberOfGuests;


    public Integer calculateTotalNumberOfGuests() {
        if(addNewGuest) {
            totalNumberOfGuests=currentNumberOGuests++;
        }
        return totalNumberOfGuests;
    }

    public Boolean getAddNewGuest() {
        return addNewGuest;
    }

    public void setAddNewGuest(Boolean addNewGuest) {
        currentNumberOGuests++;
        this.addNewGuest = addNewGuest;
    }


    public Integer getCurrentNumberOGuests() {
        return currentNumberOGuests;
    }

    public void setCurrentNumberOGuests(Integer currentNumberOGuests) {
        this.currentNumberOGuests = currentNumberOGuests;
    }

    public Integer getTotalNumberOfGuests() {
        return totalNumberOfGuests;
    }

    public void setTotalNumberOfGuests(Integer totalNumberOfGuests) {
        this.totalNumberOfGuests = totalNumberOfGuests;
    }

}
