package olodiman11.aston.homework1;

import olodiman11.aston.homework1.characters.enemies.*;
import olodiman11.aston.homework1.characters.heroes.*;

public class TrainingGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Володя", 200, 15, 5);
        Archer archer = new Archer("Виталик", 80, 50, 0.15);
        Mage mage = new Mage("Гриша", 120, 30, 0.3);

        Skeleton skeleton = new Skeleton(100, 10);
        Vampire vampire = new Vampire(150, 20);
        Snake snake = new Snake(70, 5, 0.8);

        warrior.attack(skeleton);
        archer.attack(vampire);
        mage.attack(snake);

        skeleton.attack(warrior);
        vampire.attack(archer);
        snake.attack(mage);
    }
}
