package com.pentalog.pentastagiu.homework3.game;

public abstract class GameObject {
    private int posX;
    private int posY;
    boolean active;

    public GameObject(int posX, int posY) {
        if (Scene.getInstance() == null) throw new NullPointerException();
        if (posX < 0 || posY < 0 || posX > Scene.getInstance().getWidth() - 1 || posY > Scene.getInstance().getHeight() - 1)
            throw new IllegalArgumentException();
        this.posX = posX;
        this.posY = posY;
        this.active = true;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
