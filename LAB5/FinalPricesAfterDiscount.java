package LAB5;
public class FinalPricesAfterDiscount{
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = prices[i];
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FinalPricesAfterDiscount solution = new FinalPricesAfterDiscount();

        int[] prices1 = {8, 4, 6, 2, 3};
        int[] result1 = solution.finalPrices(prices1);
        System.out.println("Final prices: " + java.util.Arrays.toString(result1));

        int[] prices2 = {1, 2, 3, 4, 5};
        int[] result2 = solution.finalPrices(prices2);
        System.out.println("Final prices: " + java.util.Arrays.toString(result2));

        int[] prices3 = {10, 1, 1, 6};
        int[] result3 = solution.finalPrices(prices3);
        System.out.println("Final prices: " + java.util.Arrays.toString(result3));
    }
}

