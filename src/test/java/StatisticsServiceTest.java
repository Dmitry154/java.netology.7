import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    public void shouldSum() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAverage() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMax() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMounthBelowAverage() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.belowAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shoulFindMounthAboveAverage() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.aboveAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }
}

