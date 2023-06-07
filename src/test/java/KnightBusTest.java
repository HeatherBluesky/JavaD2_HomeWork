import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class KnightBusTest {

        KnightBus knightbus;
        Wizard wizard;
        Wizard harry;
        Wizard hermione;
        Wizard ron;
        Wizard neville;
        BusStop busStop;

        @Before
        public void before () {
            knightbus = new KnightBus("Diagon Alley", 5);
            harry = new Wizard();
            hermione = new Wizard();
            ron = new Wizard();
            neville = new Wizard();
            busStop = new BusStop("Diagon Alley");
            busStop.add(wizard);
        }

        @Test
        public void passengerCountStartsAt0() {
            assertEquals(0, knightbus.wizardCount());
        }

        @Test
        public void canAddWizards() {
            knightbus.addWizard(wizard);
            assertEquals(1, knightbus.wizardCount());
        }

        @Test
        public void canRemoveWizard() {
            knightbus.addWizard(wizard);
            knightbus.removeWizard(wizard);
            assertFalse(knightbus.getWizards().contains(wizard));
            assertEquals(0, knightbus.wizardCount());
        }

        @Test
        public void canPickUpFromBusStop() {
            knightbus.pickUpWizardFromBusStop(busStop);
            assertEquals(1, knightbus.wizardCount());
            assertEquals(0, busStop.queueLength());
        }

        @Test
        public void cannotRemoveFromEmptyBusStop(){
            busStop.removeFromBusQueue();
            knightbus.pickUpWizardFromBusStop(busStop);
            assertEquals(0, knightbus.wizardCount());
        }
    }

