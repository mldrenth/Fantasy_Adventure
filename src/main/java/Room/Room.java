package Room;

import interfaces.IObjective;

public class Room {

    private IObjective objective;

    public Room(IObjective objective) {
        this.objective = objective;
    }

    public IObjective getObjective() {
        return this.objective;
    }

    public void setObjective(IObjective objective) {
        this.objective = objective;
    }
}
