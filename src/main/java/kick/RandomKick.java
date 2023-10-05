package kick;

import lotr.Character;
import java.util.Random;

public class RandomKick implements KickStrategy{
    @Override
    public void kick(Character whokick, Character opponent) {
        int minus_power;
        if (opponent.getPower() == 0) {
            opponent.setHp(0);
            minus_power = 0;
        }
        else {
            minus_power = new Random().nextInt(opponent.getPower());
        }
        opponent.setHp(opponent.getHp() - minus_power);
        if (opponent.getHp() == 0) {
            System.out.println(opponent.getClass().getSimpleName() + " is dead!");
        }
        else {
            System.out.println(opponent.getClass().getSimpleName() + " lost " + minus_power + " points of his hp");
        }
    };
}