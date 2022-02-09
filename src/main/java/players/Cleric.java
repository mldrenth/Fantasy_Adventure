package players;

import interfaces.IHeal;

public class Cleric extends Player{

    private IHeal tool;

    public Cleric(String name, IHeal tool) {
        super(name);
        this.sethP(80);
        this.tool = tool;
    }

    public IHeal getTool() {
        return tool;
    }

    public void setTool(IHeal tool) {
        this.tool = tool;
    }

    public void useTool(Player player){
        this.tool.heal(player);
    }
}
