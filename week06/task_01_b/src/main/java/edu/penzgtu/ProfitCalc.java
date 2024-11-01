package edu.penzgtu;

import java.util.List;

public class ProfitCalc {
    public int maxProfit(List<Integer> prices) {
        if (prices == null || prices.size() < 2) {
            return 0;
        }

        int minPrice = prices.get(0);
        int maxProfit = 0;

        for (int i = 1; i < prices.size(); i++) {
            // Обновляем минимальную цену, если нашли более низкую
            minPrice = Math.min(minPrice, prices.get(i));

            // Вычисляем потенциальную прибыль и обновляем максимальную прибыль
            int profit = prices.get(i) - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

}
