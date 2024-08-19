package olodiman11.aston.homework1.characters.heroes;

import olodiman11.aston.homework1.characters.Character;

public class Archer extends Hero {
    private final double critChance;

    public Archer(String name, int maxHealth, int baseDamage, double critChance) {
        super(name, maxHealth, baseDamage);
        this.critChance = critChance;
        this.fullName = "Лучник " + name;
    }

    @Override
    public void attack(Character character) {
        super.attack(character);
        if(checkChance(critChance)) {
            System.out.println(fullName + " атакует второй раз.");
            super.attack(character);
        }
    }
}