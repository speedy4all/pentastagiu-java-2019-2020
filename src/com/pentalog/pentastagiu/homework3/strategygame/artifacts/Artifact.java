package com.pentalog.pentastagiu.homework3.strategygame.artifacts;

import com.pentalog.pentastagiu.homework3.exceptions.ArtifactIllegalArgument;
import com.pentalog.pentastagiu.homework3.strategygame.MapPoint;
import com.pentalog.pentastagiu.homework3.strategygame.artifacts.artifacttypes.ArtifactType;

public class Artifact {
    private ArtifactType artifactType;
    private MapPoint mapPoint;
    private int extraPoints;

    public Artifact(ArtifactType artifactType, MapPoint mapPoint, int extraPoints) {
        if (artifactType == null || mapPoint == null || extraPoints <= 0) {
            throw new ArtifactIllegalArgument("The type of artifact and map point can't be null, extra points must be > 0");
        }
        this.artifactType = artifactType;
        this.mapPoint = mapPoint;
        this.extraPoints = extraPoints;
    }

    public ArtifactType getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(ArtifactType artifactType) {
        this.artifactType = artifactType;
    }

    public MapPoint getMapPoint() {
        return mapPoint;
    }

    public void setMapPoint(MapPoint mapPoint) {
        this.mapPoint = mapPoint;
    }

    public int getExtraPoints() {
        return extraPoints;
    }

    public void setExtraPoints(int extraPoints) {
        this.extraPoints = extraPoints;
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "artifactType=" + artifactType +
                ", mapPoint=" + mapPoint +
                ", extraPoints=" + extraPoints +
                '}';
    }
}
