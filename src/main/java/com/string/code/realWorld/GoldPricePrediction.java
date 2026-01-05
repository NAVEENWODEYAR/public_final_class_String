package com.string.code.realWorld;

/**
 * @author Naveen K Wodeyar
 * @date 05-Jan-2026
 */

class GoldPricePrediction {

    // Method to predict next gold price using linear regression
    public static double predictNextPrice(double[] prices) {
        int n = prices.length;

        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        // x = time (0,1,2,3...)
        for (int i = 0; i < n; i++) {
            sumX += i;
            sumY += prices[i];
            sumXY += i * prices[i];
            sumX2 += i * i;
        }

        // Calculate slope (m) and intercept (c)
        double m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double c = (sumY - m * sumX) / n;

        // Predict next price (x = n)
        return m * n + c;
    }

    public static void main(String[] args) {

        // Example historical gold prices (per gram or ounce)
        double[] goldPrices = {
            6200, 6230, 6250, 6280, 6300, 6330, 6350
        };

        double predictedPrice = predictNextPrice(goldPrices);

        System.out.println("Predicted next gold price: " + predictedPrice);
        System.out.println("Expected variation: " +
                (predictedPrice - goldPrices[goldPrices.length - 1]));
    }
}
