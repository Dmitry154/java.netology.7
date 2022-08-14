public class StatisticsService {

    public long sum(long[] sales) {
        int ans = 0;
        for (long sale : sales) {
            ans += sale;
        }
        return ans;
    }

    public long average(long[] sales) {
        long sum = sum(sales);
        return sum / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int aboveAverage(long[] sales) {
        int count = 0;
        long average = average(sales);
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

    public int belowAverage(long[] sales) {
        int count = 0;
        long average = average(sales);
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }
}
