import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

        BusStop busStop;
        Wizard wizard;

        @Before
        public void before() {
            busStop = new BusStop("Leaky Cauldron");
            wizard = new Wizard();
        }

        @Test
        public void canAddToQueue() {
            busStop.add(wizard);
            assertEquals(1, busStop.queueLength());
        }

        @Test
        public void canRemoveFromQueue() {
            busStop.add(wizard);
            busStop.removeFromBusQueue();
            assertEquals(0, busStop.queueLength());
        }
    }


