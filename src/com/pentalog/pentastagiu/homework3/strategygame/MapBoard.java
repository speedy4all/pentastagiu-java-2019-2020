package com.pentalog.pentastagiu.homework3.strategygame;

import com.pentalog.pentastagiu.homework3.exceptions.BoardIllegalPosition;
import com.pentalog.pentastagiu.homework3.strategygame.artifacts.Artifact;
import com.pentalog.pentastagiu.homework3.strategygame.warriors.Warrior;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MapBoard {
    private Set<Warrior> warriors;
    private Object[][] matrixBoard;

    public MapBoard() {
        this.warriors = new HashSet<>();
        this.matrixBoard = new Object[10][10];
    }

    public void addWarrior(Warrior warrior) {
        MapPoint mapPoint = warrior.getMapPoint();
        if (mapPoint.getLinePosition() < 0 || mapPoint.getLinePosition() > 9 || mapPoint.getColumnPosition() < 0 || mapPoint.getColumnPosition() > 9) {
            throw new BoardIllegalPosition("The warrior must be placed in a 10x10 matrix, illegal position");
        }
        if (matrixBoard[mapPoint.getLinePosition()][mapPoint.getLinePosition()] != null) {
            throw new BoardIllegalPosition("In that position is already something");
        }
        matrixBoard[mapPoint.getLinePosition()][mapPoint.getLinePosition()] = warrior;
        warriors.add(warrior);
    }

    public void addArtifact(Artifact artifact) {
        MapPoint mapPoint = artifact.getMapPoint();
        if (mapPoint.getLinePosition() < 0 || mapPoint.getLinePosition() > 9 || mapPoint.getColumnPosition() < 0 || mapPoint.getColumnPosition() > 9) {
            throw new BoardIllegalPosition("The artifact must be placed in a 10x10 matrix, illegal position");
        }
        if (matrixBoard[mapPoint.getLinePosition()][mapPoint.getLinePosition()] != null) {
            throw new BoardIllegalPosition("In that position is already something");
        }
        matrixBoard[mapPoint.getLinePosition()][mapPoint.getLinePosition()] = artifact;
    }

    public Set<Warrior> getWarriors() {
        return warriors;
    }

    public void setWarriors(Set<Warrior> warriors) {
        this.warriors = warriors;
    }

    public Object[][] getMatrixBoard() {
        return matrixBoard;
    }

    public void setMatrixBoard(Object[][] matrixBoard) {
        this.matrixBoard = matrixBoard;
    }

    @Override
    public String toString() {
        return "MapBoard{" +
                "warriors=" + warriors +
                ", matrixBoard=" + Arrays.toString(matrixBoard) +
                '}';
    }
}
