package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        boolean whoFights = true;
        int rount = 1;
        if (c1.getClass() == c2.getClass()) {
            System.out.println("Two equal characters can`t fight");
        }
        else {
            while (c1.isAlive() && c2.isAlive()) {
                System.out.println("Round " + rount);
                if (whoFights == true) {
                    System.out.println(c1.getClass().getSimpleName() + " kicks " + c2.getClass().getSimpleName());
                    c1.kick(c2);
                    whoFights = false;
                } else {
                    System.out.println(c2.getClass().getSimpleName() + " kicks " + c1.getClass().getSimpleName());
                    c2.kick(c1);
                    whoFights = true;
                }
                System.out.println("-------------------------------------------");
                rount += 1;
            }
            if (c1.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " lost the fight");
            } else {
                System.out.println(c1.getClass().getSimpleName() + " lost the fight");
            }
            System.out.println("GAME OVER");
        }
    }
}