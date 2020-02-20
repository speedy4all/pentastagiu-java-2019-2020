package com.pentalog.pentastagiu.homework3.game;

public class Scene {
    private static Scene scene;
    private int width;
    private int height;
    private GameObject[][] sceneMap;

    private Scene(int width, int height) {
        if (width < 1 && height < 1) throw new IllegalArgumentException();
        this.width = width;
        this.height = height;
        sceneMap = new GameObject[width][height];
    }

    public static Scene getInstance() {
        if (scene == null) {
            scene = new Scene(10, 10);
        }
        return scene;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public GameObject getGameObject(int posX, int posY) {
        return sceneMap[posX][posY] == null ? null : sceneMap[posX][posY];
    }

    public void setGameObject(int posX, int posY, GameObject obj) {
        sceneMap[posX][posY] = obj;
    }

    public void displayScene() {
        System.out.printf("    ");
        for(int k = 0; k < height; k++)
            System.out.printf("%d   ", k);
        System.out.println();
        for (int i = 0; i < width; i++) {
            System.out.printf("%d: ", i);
            for (int j = 0; j < height; j++) {
                if (sceneMap[i][j] == null) System.out.printf("[ ] ");
                else if (sceneMap[i][j] instanceof Artifact) {
                    System.out.printf("[%s] ", String.valueOf(((Artifact) sceneMap[i][j]).getArtifactType()).charAt(0));
                } else if (sceneMap[i][j] instanceof Character) {
                    System.out.printf("[%s] ", String.valueOf(((Character) sceneMap[i][j]).getCharacterType()).charAt(0));
                }

            }
            System.out.println();
        }
        System.out.print("\n \n");
    }
}
