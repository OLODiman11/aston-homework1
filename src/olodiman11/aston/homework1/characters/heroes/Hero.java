package olodiman11.aston.homework1.characters.heroes;

import olodiman11.aston.homework1.characters.Character;

public abstract class Hero extends Character {
    private final String name;

    public Hero(String name, int maxHealth, int baseDamage){
        super(maxHealth, baseDamage);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
