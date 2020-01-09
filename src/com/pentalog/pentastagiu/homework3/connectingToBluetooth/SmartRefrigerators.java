package com.pentalog.pentastagiu.homework3.connectingToBluetooth;

public class SmartRefrigerators implements ConnectableInterface{

    private Integer productCod;
    private String refrigeratorBrand;
    private String refrigeratorModel;
    private Double netVolumeRefigerator;
    private Double netVolumeFreezer;
    private String energyEfficiencyClass;

    public SmartRefrigerators() {}

    public SmartRefrigerators(Integer productCod, String refrigeratorBrand, String refrigeratorModel,
                              Double netVolumeRefigerator, Double netVolumeFreezer, String energyEfficiencyClass) {
        super();
        this.productCod = productCod;
        this.refrigeratorBrand = refrigeratorBrand;
        this.refrigeratorModel = refrigeratorModel;
        this.netVolumeRefigerator = netVolumeRefigerator;
        this.netVolumeFreezer = netVolumeFreezer;
        this.energyEfficiencyClass = energyEfficiencyClass;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress for " + refrigeratorBrand+ " " + refrigeratorModel);
    }


    //getters and setters
    public Integer getProductCod() {
        return productCod;
    }
    public void setProductCod(Integer productCod) {
        this.productCod = productCod;
    }
    public String getRefrigeratorBrand() {
        return refrigeratorBrand;
    }
    public void setRefrigeratorBrand(String refrigeratorBrand) {
        this.refrigeratorBrand = refrigeratorBrand;
    }
    public String getRefrigeratorModel() {
        return refrigeratorModel;
    }
    public void setRefrigeratorModel(String refrigeratorModel) {
        this.refrigeratorModel = refrigeratorModel;
    }
    public Double getNetVolumeRefigerator() {
        return netVolumeRefigerator;
    }
    public void setNetVolumeRefigerator(Double netVolumeRefigerator) {
        this.netVolumeRefigerator = netVolumeRefigerator;
    }
    public Double getNetVolumeFreezer() {
        return netVolumeFreezer;
    }
    public void setNetVolumeFreezer(Double netVolumeFreezer) {
        this.netVolumeFreezer = netVolumeFreezer;
    }
    public String getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }
    public void setEnergyEfficiencyClass(String energyEfficiencyClass) {
        this.energyEfficiencyClass = energyEfficiencyClass;
    }


}