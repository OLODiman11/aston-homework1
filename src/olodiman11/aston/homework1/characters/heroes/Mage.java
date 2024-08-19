package olodiman11.aston.homework1.characters.heroes;

import olodiman11.aston.homework1.characters.Character;

public class Mage extends Hero {
    private boolean isInvisible;
    private double invisChance;

    public Mage(String name, int maxHealth, int baseDamage, double invisChance) {
        super(name, maxHealth, baseDamage);
        this.invisChance = invisChance;
        this.fullName = "Маг " + name;
    }

    @Override
    public void attack(Character character) {
        super.attack(character);
        if (checkChance(invisChance)) {
            System.out.println(fullName + " становится невидимым.");
            isInvisible = true;
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isInvisible) {
            isInvisible = false;
            System.out.println(fullName + " уклоняется от атаки.");
            return;
        }
        super.takeDamage(damage);
    }

    public boolean isInvisible() {
        return isInvisible;
    }
}
