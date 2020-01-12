package com.pentalog.pentastagiu.homework3.Bluetooth;



public class Phone implements BluetoothConnectable {
    private String NameOfPhone;
    private int Storage;
    private int CameraMP;

    public Phone(String nameOfPhone, int storage, int cameraMP) {
        NameOfPhone = nameOfPhone;
        Storage = storage;
        CameraMP = cameraMP;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress "+ NameOfPhone);

    }

    public String getNameOfPhone() {
        return NameOfPhone;
    }

    public void setNameOfPhone(String nameOfPhone) {
        NameOfPhone = nameOfPhone;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int storage) {
        Storage = storage;
    }

    public int getCameraMP() {
        return CameraMP;
    }

    public void setCameraMP(int cameraMP) {
        CameraMP = cameraMP;
    }
}
