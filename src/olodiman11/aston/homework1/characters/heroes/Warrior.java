package olodiman11.aston.homework1.characters.heroes;

public class Warrior extends Hero {
    private final int armor;

    public Warrior(String name, int maxHealth, int baseDamage, int armor) {
        super(name, maxHealth, baseDamage);
        this.armor = armor;
        this.fullName = "Воин " + name;
    }

    @Override
    public void takeDamage(int damage) {
        int reducedDamage = Math.max(0, damage - armor);
        System.out.println(fullName + " блокирует " + armor + " урона.");
        super.takeDamage(reducedDamage);
    }
}
