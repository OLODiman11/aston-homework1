package olodiman11.aston.homework1.characters.enemies;

import olodiman11.aston.homework1.characters.Character;

public class Snake extends Enemy {
    private double poisonChance;

    public Snake(int maxHealth, int baseDamage, double poisonChance) {
        super(maxHealth, baseDamage);
        this.poisonChance = poisonChance;
        this.fullName = "Змея";
    }

    @Override
    public void attack(Character character) {
        super.attack(character);
        if (checkChance(poisonChance)) {
            character.setPoisoned(true);
        }
    }
}
