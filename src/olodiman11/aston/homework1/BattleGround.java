package olodiman11.aston.homework1;

import olodiman11.aston.homework1.characters.Character;
import olodiman11.aston.homework1.characters.enemies.*;
import olodiman11.aston.homework1.characters.heroes.*;

import java.util.ArrayList;
import java.util.List;


public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Володя", 200, 15, 5);
        Archer archer = new Archer("Виталик", 80, 50, 0.15);
        Mage mage = new Mage("Гриша", 120, 30, 0.3);

        Skeleton skeleton = new Skeleton(100, 10);
        Vampire vampire = new Vampire(150, 20);
        Snake snake = new Snake(70, 5, 0.8);

        List<Hero> heroes = new ArrayList<Hero>();
        List<Enemy> enemies = new ArrayList<Enemy>();
        heroes.add(warrior);
        heroes.add(archer);
        heroes.add(mage);
        enemies.add(skeleton);
        enemies.add(vampire);
        enemies.add(snake);

        // Math min чтобы избежать выхода за пределы массива.
        for (int i = 0; i < Math.min(heroes.size(),enemies.size()); i++) {
            heroes.get(i).attack(enemies.get(i));
            System.out.println();
            enemies.get(i).attack(heroes.get(i));
            System.out.println();
        }

    }
}
