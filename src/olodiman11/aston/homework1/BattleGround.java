package olodiman11.aston.homework1;

import olodiman11.aston.homework1.characters.enemies.*;
import olodiman11.aston.homework1.characters.heroes.*;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Володя", 200, 15, 5);
        Archer archer = new Archer("Виталик", 80, 50, 0.15);
        Mage mage = new Mage("Гриша", 120, 30, 0.3);

        Skeleton skeleton = new Skeleton(100, 10);
        Vampire vampire = new Vampire(150, 20);
        Snake snake = new Snake(70, 5, 0.8);

        warrior.attack(vampire);
        System.out.println();
        archer.attack(vampire);
        System.out.println();
        mage.attack(snake);
        System.out.println();
        skeleton.attack(archer);
        System.out.println();
        vampire.attack(archer);
        System.out.println();
        snake.attack(warrior);
        System.out.println();
        warrior.attack(skeleton);
        System.out.println();
        archer.attack(vampire);
        System.out.println();
        mage.attack(snake);
        System.out.println();
        skeleton.attack(warrior);
        System.out.println();
        vampire.attack(archer);
        System.out.println();
        snake.attack(mage);
        System.out.println();
        warrior.attack(skeleton);
        System.out.println();
        archer.attack(vampire);
        System.out.println();
        mage.attack(snake);
        System.out.println();
        skeleton.attack(warrior);
        System.out.println();
        vampire.attack(archer);
        System.out.println();
        snake.attack(mage);
    }
}
