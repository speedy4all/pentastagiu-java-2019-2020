//Create a console application from the following requirements:
//We plan to create a strategy game: in this game we will have characters and artifacts
//Each artifact will have a position on the map(x and y) and a number of extra points. We will have 2 types of artifacts: health artifact and energy artifact
//Each character can be a human, a monster or an animal; each one will have a name, a number of health points, a number of energy points and a position on the
// map (x and y); for each one we will have the method that gives us the position on the map and also a method that will receive as parameter an artifact and
// will increase the number of health points or energy points of the character with the number of extra points given by the artifact, depending on the type of artifact that is passed as parameter
//Some of the characters will have the ability of attacking other characters:
//Humans can attack: in which case they will waste 5 energy points and the character that is attacked will lose 10 health points
//Monsters can attack: in which case they will lose 3 energy points and the character that is attacked will lose 15
//Use a scenario in which you create few artifacts, few characters(one of each type), play with the objects from the game and display at the end the status for each characters
//For extra functionality, you can add validation logic(for example if someone attacks a character that doesn’t have enough health points a message is displayed that the character attacked is
// already dead) or logic related to the position on the map(you will consider a 10 per 10 map and when attacking a character, verify first the distance of the current character to the attacker
// it’s smaller than 5 and only in that case initiate the attack)


package com.pentalog.pentastagiu.homework3.strategyGame;


import static com.pentalog.pentastagiu.homework3.strategyGame.Character.attack;

public class MainApp {


    public static void main(String[] args) {
        Humans h1 = new Humans(5,5,"human1",19,20);
        Monster m1 = new Monster(4, 5, "monster1", 12,20);
        HealthArtifact healthArtifact = new HealthArtifact(2, 3, 25);
        EnergyArtifact energyArtifact = new EnergyArtifact(4, 2, 12);


        h1.curentStatus();
        h1.acquireArtifact(healthArtifact);
        h1.curentStatus();
        h1.acquireArtifact(energyArtifact);
        h1.curentStatus();
        m1.curentStatus();
//        Character.calculateDistance(h1, m1);
        attack(h1, m1);
        h1.curentStatus();
        m1.curentStatus();
        attack(m1,h1);
        h1.curentStatus();
        m1.curentStatus();
    }
}
