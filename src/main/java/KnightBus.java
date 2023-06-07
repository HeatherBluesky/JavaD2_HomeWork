import java.util.ArrayList;

public class KnightBus {

    private String destination;
    private int capacity;
    private ArrayList<Wizard> wizards;

    public KnightBus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.wizards = new ArrayList<Wizard>();
    }

    public ArrayList<Wizard> getWizards(){
        return wizards;}

    public int wizardCount() {
        return this.wizards.size();
    }

    public void addWizard(Wizard wizard) {
        if(this.wizardCount() < this.capacity){
            this.wizards.add(wizard);
        }
    }
    public void removeWizard(Wizard wizard) {
        this.wizards.remove(wizard);
    }

    public void pickUpWizardFromBusStop(BusStop busStop) {
        if (this.wizardCount() < this.capacity && busStop.queueLength() >0){
            Wizard wizardRemoved = busStop.removeFromBusQueue();
            this.addWizard(wizardRemoved);}
    }


}
