package players;

import Room.Enemy;
import interfaces.IFight;

public class Dwarf extends Warrior{

    public Dwarf(String name, IFight weapon) {
        super(name, weapon);
        this.sethP(400);
    }

}
