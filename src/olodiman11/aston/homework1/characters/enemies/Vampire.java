package olodiman11.aston.homework1.characters.enemies;

import olodiman11.aston.homework1.characters.Character;

public class Vampire extends Enemy {
    public Vampire(int maxHealth, int baseDamage) {
        super(maxHealth, baseDamage);
        this.fullName = "Вампир";
    }

    private void heal(int amount) {
        setHealth(health + amount);
        System.out.println(fullName + " восполняет " + amount + " здоровья.");
    }

    @Override
    public void attack(Character character) {
        super.attack(character);
        heal(baseDamage / 5);
    }
}
