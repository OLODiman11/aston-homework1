package olodiman11.aston.homework1.characters;

import olodiman11.aston.homework1.Mortal;

import java.util.Random;

public abstract class Character implements Mortal {
    protected final int maxHealth;
    protected final int baseDamage;
    protected int health;
    protected boolean isPoisoned;
    protected String fullName;
    private final Random random;

    public Character(int maxHealth, int baseDamage) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.baseDamage = baseDamage;
        this.random = new Random();
    }

    public void takeDamage(int damage) {
        damage = Math.max(0, damage);
        System.out.println(fullName + " получает " + damage +  " урона.");
        setHealth(health - damage);
    }

    public void attack(Character character) {
        if (isPoisoned) {
            System.out.println("На " + fullName + " действует яд.");
            takeDamage(10);
            isPoisoned = false;
        }
        System.out.println(fullName + " атакует " + character.fullName + ".");
        character.takeDamage(baseDamage);
        System.out.println("У " + character.fullName + " осталось " + character.health + " здоровья.");
    }

    protected boolean checkChance(double chance) {
        return random.nextFloat() < chance;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.clamp(health, 0, maxHealth);
        if(!isAlive()) {
            System.out.println(fullName + " погиб.");
        }
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public boolean isPoisoned() {
        return isPoisoned;
    }

    public void setPoisoned(boolean poisoned) {
        isPoisoned = poisoned;
        if(poisoned){
            System.out.println(fullName + " отравлен.");
        }
    }
}
