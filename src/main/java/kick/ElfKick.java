package kick;
import lotr.Character;
public class ElfKick implements KickStrategy{
    @Override
    public void kick(Character whokick, Character opponent) {
        if (whokick.getPower() > opponent.getPower()) {
            opponent.setHp(0);
            System.out.println(opponent.getClass().getSimpleName() + " is dead!");
        }
        else {
            whokick.setPower(whokick.getPower() - 1);
            System.out.println(opponent.getClass().getSimpleName() + " is still alive");
            System.out.println(whokick.getClass().getSimpleName() + " lost 1 point of his power");
        }
    };
}