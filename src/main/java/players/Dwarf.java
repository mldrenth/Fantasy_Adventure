package players;

import interfaces.IFight;

public class Dwarf extends Warrior{

    public Dwarf(String name, IFight weapon) {
        super(name, weapon);
        this.sethP(400);
    }
}
