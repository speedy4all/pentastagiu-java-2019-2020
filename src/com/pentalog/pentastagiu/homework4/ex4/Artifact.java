package com.pentalog.pentastagiu.homework4.ex4;

public class Artifact {
    private ArtifactType type;
    private Position mapPosition;

    public Artifact(ArtifactType type, Position mapPosition) {
        this.type = type;
        this.mapPosition = mapPosition;
    }

    public ArtifactType getType() {
        return type;
    }

    public void setType(ArtifactType type) {
        this.type = type;
    }

    public Position getMapPosition() {
        return mapPosition;
    }

    public void setMapPosition(Position mapPosition) {
        this.mapPosition = mapPosition;
    }



}

