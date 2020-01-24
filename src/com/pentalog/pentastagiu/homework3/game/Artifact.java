package com.pentalog.pentastagiu.homework3.game;

public class Artifact {

    private Integer extraPoints=0;
    private Integer xPositionOnTheMap;
    private Integer yPositionOnTheMap;

    public Artifact(Integer xPositionOnTheMap, Integer yPositionOnTheMap) {
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
