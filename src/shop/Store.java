package shop;

public class Store {
    // Сделайте расчет покупки товаров со скидками.
    // Товар А стоит X евро и на него скидка D%,
    // а товар B стоит Y евро и на него скидка С%.
    // Клиент взял N товаров A и M товаров B.
    // Если сумма покупки превысила 100 евро,
    // то полагается дополнительная скидка 5%.
    // Вычислите итоговую стоимость покупки и величину полученной скидки.

    public static void main(String[] args) {

        double productPriceA = 100; // цена товара А
        double productPriceB = 100; // цена товара В
        double discountD = 1; // скидка на товар А в процентах
        double discountC = 5; // скидка на товар B в процентах
        double discountE = 5; // скидка на товар B в процентах


        int quantityN = 2;// количество товаров А
        int quantityM = 5; //количество товаров В

        // расчет суммы скидки для товаров А
        double disSumD = discountSum(quantityN, productPriceA, discountD);
        System.out.println("Total cost product A: " + disSumD);

        // расчет суммы скидки для товаров В
        double disSumC = discountSum(quantityM, productPriceB, discountC);
        System.out.println("Total cost product B: " + disSumC);

        // Расчет общей стоимости покупки
        double totCost = calculateTotalCost(disSumD, disSumC);
        System.out.println("Total cost:" + totCost);

        double finalCost = additionalDiscount(totCost, discountE);

        if (totCost > 100) {
            System.out.println("Total cost with 5% additional discount: " + finalCost + " euro");
        }
    }

    // Расчет суммы скидки для товара
    public static double discountSum(double a, double n, double d) {
        double productPrice = n * a * (1 - d / 100);
        return productPrice;
    }

    // Расчет общей стоимости покупки
    public static double calculateTotalCost(double productPriceA, double productPriceY) {
        double totCost = productPriceA + productPriceY;
        return totCost;

    }

    // Применение дополнительной скидки
    public static double additionalDiscount(double sum, double e) {
        double totCost = sum * (1 - e / 100); // если сумма превышает 100 евро
        return totCost;
    }
}
