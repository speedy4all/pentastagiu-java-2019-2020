package com.pentalog.pentastagiu.homework3.game;

public class Artifact extends GameObject {
    private int posX;
    private int posY;
    private int value;
    private ArtifactType artifactType;

    public Artifact(int posX, int posY, ArtifactType artifactType, int value) {
        super(posX, posY);
        this.artifactType = artifactType;
        if (value <= 0) throw new IllegalArgumentException();
        this.value = value;
        Scene.getInstance().setGameObject(posX, posY, this);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", value=" + value +
                ", artifactType=" + artifactType +
                ", active=" + active +
                '}';
    }

    public ArtifactType getArtifactType() {
        return artifactType;
    }

}
