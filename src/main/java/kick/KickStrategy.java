package kick;

import lotr.Character;

public interface KickStrategy {
    void kick(Character whokick, Character opponent);
}