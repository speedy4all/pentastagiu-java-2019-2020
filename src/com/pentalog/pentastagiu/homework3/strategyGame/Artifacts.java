package com.pentalog.pentastagiu.homework3.strategyGame;

public class Artifacts {

    private Integer extraPoints=0;
    private Integer xPositionOnTheMap;
    private Integer yPositionOnTheMap;

    public Artifacts(Integer xPositionOnTheMap, Integer yPositionOnTheMap) {
        super();
        this.xPositionOnTheMap = xPositionOnTheMap;
        this.yPositionOnTheMap = yPositionOnTheMap;
    }

    public Integer getExtraPoints() {
        return extraPoints;
    }

    public void setExtraPoints(Integer extraPoints) {
        this.extraPoints = extraPoints;
    }

    public Integer getxPositionOnTheMap() {
        return xPositionOnTheMap;
    }

    public void setxPositionOnTheMap(Integer xPositionOnTheMap) {
        this.xPositionOnTheMap = xPositionOnTheMap;
    }

    public Integer getyPositionOnTheMap() {
        return yPositionOnTheMap;
    }

    public void setyPositionOnTheMap(Integer yPositionOnTheMap) {
        this.yPositionOnTheMap = yPositionOnTheMap;
    }
}
