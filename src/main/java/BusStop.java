import java.util.ArrayList;

public class BusStop {

    private String name;

    private ArrayList<Wizard> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Wizard>();
    }

    public int queueLength(){
        return this.queue.size();
    }

    public void add(Wizard wizard){
        this.queue.add(wizard);
    }

    public Wizard removeFromBusQueue() {
        Wizard wizardRemoved = null;
        if(this.queueLength() > 0){
            wizardRemoved = this.queue.remove(0);
        }
        return wizardRemoved;
    }
}
