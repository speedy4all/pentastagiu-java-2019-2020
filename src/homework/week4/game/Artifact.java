package homework.week4.game;

public enum Artifact {
    HealthArtifact(new Builder("HEALTH").withBonus(75)),
    EnergyArtifact(new Builder("ENERGY").withBonus(75));

    private String type;
    private int bonus;

    @Override
    public String toString() {
        return "Artifact{" +
                "type='" + type + '\'' +
                ", bonus=" + bonus +
                ", location=" + location +
                '}';
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    private Point location;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    Artifact(Builder builder) {
        this.bonus = builder.bonus;
        this.type = builder.type;
    }

    private static class Builder {
        private String type;
        private int bonus;

        public Builder(String type) {
            this.bonus = 75;
            this.type = type;
        }

        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withBonus(int bonus) {
            this.bonus = bonus;
            return this;
        }
    }

} // Artifact
