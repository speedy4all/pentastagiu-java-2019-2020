package com.pentalog.pentastagiu.homework3.exercise4;

public class Artifact {
    private int x;
    private int y;
    private ArtifactType type;
    private boolean isUsed = false;
    private int bonusValue;

    public Artifact(int x, int y, ArtifactType type, int bonusValue) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.bonusValue = bonusValue;
    }

    public int use() {
        if(!isUsed) {
            isUsed = true;
            return bonusValue;
        }

        return 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ArtifactType getType() {
        return type;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public int getBonusValue() {
        return bonusValue;
    }
}
