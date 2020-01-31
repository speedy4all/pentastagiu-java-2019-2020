package com.pentalog.pentastagiu.homework3.game.strategy.application;

public class Artifact {

    private Integer positionX;
    private Integer positionY;
    private Integer points;
    private String type;

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Artifact(Integer positionX, Integer positionY, Integer points, String type) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.points = points;
        this.type = type;
    }
}
