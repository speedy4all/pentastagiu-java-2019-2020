package homework.week4.game;

import java.util.HashSet;
import java.util.Set;

public class Board {
    private Set<Character> characters;
    private Object[][] matrixBoard;
    private int rows, columns;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this. matrixBoard = new Object[rows][columns];
        this.characters = new HashSet<>();
    }

    public Set<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }

    public Object[][] getMatrixBoard() {
        return matrixBoard;
    }

    public void setMatrixBoard(Object[][] matrixBoard) {
        this.matrixBoard = matrixBoard;
    }

    public void addCharacter(Character character) {
        Point charPoint = character.getPosition();
        if(!(charPoint.getColumn() < 0 || charPoint.getColumn() > 9 || charPoint.getRow() < 0 || charPoint.getRow() > 9)) {
            if (matrixBoard[charPoint.getRow()][charPoint.getColumn()] == null) {
                matrixBoard[charPoint.getRow()][charPoint.getColumn()] = character;
                characters.add(character);
            }else {
                System.out.println("The space is occupied");
            }
        } else {
            System.out.println("Invalid position.");
        }
    }

    public void addArtifact(Artifact artifact) {
        Point artPoint = artifact.getLocation();
        if(!(artPoint.getColumn() < 0 || artPoint.getColumn() > 9 || artPoint.getRow() < 0 || artPoint.getRow() > 9)) {
            if (matrixBoard[artPoint.getRow()][artPoint.getColumn()] == null) {
                matrixBoard[artPoint.getRow()][artPoint.getColumn()] = artifact;
            } else {
                System.out.println("The space is occupied");
            }
        } else {
            System.out.println("Invalid position.");
        }
    }

    public void printMap() {
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j <columns; j++) {
                if (matrixBoard[i][j] instanceof Character) {
                    Character character = (Character) matrixBoard[i][j];
                    switch (character.getType()) {
                        case "HUMAN":
                            System.out.print("HUMAN ");
                            break;
                        case "DRAGON":
                            System.out.print("DRAGON");
                            break;
                        case "ANIMAL":
                            System.out.print("ANIMAL");
                            break;
                    }
                } else if (matrixBoard[i][j] instanceof Artifact) {
                    Artifact artifact = (Artifact) matrixBoard[i][j];
                    switch (artifact.getType()) {
                        case "ENERGY":
                            System.out.print("ENERGY");
                            break;
                        case "HEALTH":
                            System.out.print("HEALTH");
                            break;
                    }
                }
                else if (matrixBoard[i][j] == null){
                    System.out.print("  0   ");
                }
            }
            System.out.println();
        }
    }
}
