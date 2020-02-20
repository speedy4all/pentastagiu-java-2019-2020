package com.pentalog.pentastagiu.homework3.game;

public abstract class Character extends GameObject {
    private String name;
    private int posX;
    private int posY;
    private int healthPoints;
    private int energyPoints;
    private CharacterType characterType;

    public Character(CharacterType characterType, String name, int posX, int posY) {
        super(posX, posY);
        this.name = name;
        this.characterType = characterType;
        Scene.getInstance().setGameObject(posX, posY, this);
    }

    public String getName() {
        return name;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setHealthPoints(int healthPoints) {
        if (this.healthPoints > 0 && healthPoints <= 0) {
            this.setActive(false);
            this.healthPoints = 0;
        } else if (this.healthPoints == 0 && healthPoints <= 0) throw new IllegalArgumentException();
        else
            this.healthPoints = healthPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        if (energyPoints <= 0) throw new IllegalArgumentException();
        this.energyPoints = energyPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    private void checkArtifact(int posX, int posY) {
        if (Scene.getInstance().getGameObject(posX, posY) instanceof Artifact == true) {
            Artifact artifact;
            if ((artifact = ((Artifact) Scene.getInstance().getGameObject(posX, posY))).getArtifactType() == ArtifactType.ENERGY) {
                setEnergyPoints(energyPoints + artifact.getValue());
            } else {
                setHealthPoints(healthPoints + artifact.getValue());
            }
            artifact.setActive(false);
        }
    }

    public void moveTo(int newPosX, int newPosY, double distance) {
        if (newPosX < 0 || newPosX > Scene.getInstance().getWidth() - 1 || newPosY < 0 || newPosX > Scene.getInstance().getHeight() - 1)
            return;
        double xDistanceSquared = Math.pow(getPosX() - newPosX, 2);
        double yDistanceSquared = Math.pow(getPosY() - newPosY, 2);
        if (Math.sqrt(xDistanceSquared + yDistanceSquared) <= distance && Scene.getInstance().getGameObject(newPosX, newPosY) instanceof Character == false) {
            setPosX(newPosX);
            setPosY(newPosY);
            checkArtifact(newPosX, newPosY);
            Scene.getInstance().setGameObject(newPosX, newPosY, this);
            Scene.getInstance().setGameObject(posX, posY, null);
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", posX=" + posX +
                ", posY=" + posY +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                ", characterType=" + characterType +
                ", active=" + active +
                '}';
    }
}
