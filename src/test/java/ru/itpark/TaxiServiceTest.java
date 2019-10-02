package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiServiceTest {
    @Test
    public void sumWithoutDiscont() {

        TaxiService service = new TaxiService();
        int sum = service.count(10);

        assertEquals (260, sum);
    }
    @Test
    public void sumWithDiscont() {
        TaxiService service = new TaxiService();
        int sum = service.count(80);

        assertEquals(1577, sum);
    }
    @Test
    public void sumWithMaxDiscont() {
        TaxiService service = new TaxiService();
        int sum = service.count(200);

        assertEquals(3960, sum);

    }
}
