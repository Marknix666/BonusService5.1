import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();


        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 5000;
        boolean registered = false;
        long expected = 50;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateUnregisteredAndOverLimit() {
        BonusService service = new BonusService();


        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}

