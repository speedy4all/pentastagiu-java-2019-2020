package com.pentalog.pentastagiu.homework3.game;

public class CharacterFactory {

    public static Character getCharacter(CharacterType characterType, String name, int posX, int posY) {
        if (characterType == null)
            return null;
        else if (characterType == CharacterType.ANIMAL)
            return new Animal(CharacterType.ANIMAL, name, posX, posY);
        else if (characterType == CharacterType.HUMAN)
            return new Human(CharacterType.HUMAN, name, posX, posY);
        else if (characterType == CharacterType.MONSTER)
            return new Monster(CharacterType.MONSTER, name, posX, posY);
        return null;
    }
}
