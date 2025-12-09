package be.ehb.gebruiker;

import java.io.Serializable;

public class Role implements Serializable {

    private boolean canRead;
    private boolean canWrite;
    private boolean canExecute;

    public Role() {
        this.canRead = true;
        this.canWrite = false;
        this.canExecute = false;
    }

    @Override
    public String toString() {
        return "Role{" +
                "canRead=" + canRead +
                ", canWrite=" + canWrite +
                ", canExecute=" + canExecute +
                '}';
    }
}
