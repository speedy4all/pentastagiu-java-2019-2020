package homework.week4.game;

public enum  Character {
    HUMAN(new Builder("HUMAN").withDamage(20).withEnergy(100).withHealth(100)),
    MONSTER(new Builder("DRAGON").withDamage(35).withEnergy(120).withHealth(150)),
    ANIMAL(new Builder("ANIMAL").withDamage(0).withEnergy(90).withHealth(100));

    private String type;

    private String name;
    private int health;
    private int energy;
    private int damage;
    private Point position;

    Character(Builder builder) {
        this.type = builder.type;
        this.name = builder.name;
        this.health = builder.health;
        this.energy = builder.energy;
        this.damage = builder.damage;
        this.position = builder.position;
    }

    public static class Builder {

        private String type;

        private String name;
        private int health;
        private int energy;
        private int damage;
        private Point position;

        public Builder(String type) {
            this.type = type;
        }

        public Builder withHealth(int health) {
            if(health > 0) {
                this.health = health;
            }
            return this;
        }

        public Builder withEnergy(int energy) {
            if(energy > 0) {
                this.energy = energy;
            }
            return this;
        }

        public Builder withDamage(int damage) {
            if(damage > 0) {
                this.damage = damage;
            }
            return this;
        }

        public Builder withPosition(Point position) {
            this.position = position;
            return this;
        }
    }

    public void consumeArtifact(Artifact artifact) {
        if (artifact.getType().equals("HEALTH")) {
            health += artifact.getBonus();
        } else {
            energy += artifact.getBonus();
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void attack(Character character) {
        if (this.type.equals("ANIMAL")) {
            System.out.println("Animals cannot attack");
            return;
        }
        if (Math.abs(position.getRow() - character.getPosition().getRow()) < 5 || Math.abs(position.getColumn() - character.getPosition().getColumn()) < 4) {
            if (character.getHealth() > 0) {
                if (this.getType().equals("HUMAN")) {
                    if (this.getEnergy() - 5 < 0) {
                        System.out.println("Not enough energy to attack");
                    } else {
                        energy -= 5;
                        character.setHealth(character.getHealth() - damage);
                    }
                } else if (this.getType().equals("DRAGON")) {
                    if (this.getEnergy() - 3 < 0) {
                        System.out.println("Not enough energy to attack");
                    } else {
                        energy -= 3;
                        character.setHealth(character.getHealth() - damage);
                    }
                }
            } else {
                System.out.println("Cannot attack a dead enemy");
            }

        } else {
            System.out.println("The enemy is too far");
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", energy=" + energy +
                ", damage=" + damage +
                ", position=" + position +
                '}';
    }

}
