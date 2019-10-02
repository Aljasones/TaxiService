package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiServiceTest {
    @Test
    public void sumWithoutDiscount() {

        TaxiService service = new TaxiService();
        int sum = service.count(10);

        assertEquals (260, sum);
    }
    @Test
    public void sumWithDiscount() {
        TaxiService service = new TaxiService();
        int sum = service.count(80);

        assertEquals(1577, sum);
    }
    @Test
    public void sumWithMaxDiscount() {
        TaxiService service = new TaxiService();
        int sum = service.count(200);

        assertEquals(3960, sum);

    }
}
