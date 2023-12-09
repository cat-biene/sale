package shop;
// Сделайте расчет покупки товаров со скидками.
// Товар А стоит X евро и на него скидка D%,
// а товар B стоит Y евро и на него скидка С%.
// Клиент взял N товаров A и M товаров B.
// Если сумма покупки превысила 100 евро,
// то полагается дополнительная скидка 5%.
// Вычислите итоговую стоимость покупки и величину полученной скидки.

public class Sale {

    public static void main(String[] args) {
        double a = 10;
        double b = 10;
        double d = 0.01;
        double c = 0.05;
        double e = 0.05;
        int n = 2;
        int m = 5;

        double result = totalCost(a, b, d, c, n, m, e);
        System.out.println("Total cost: " + result);

    }

    private static double totalCost(double a, double b, double d, double c, int n, int m, double e) {

        double res = (n * (a - a * d)) + (m * (b - b * c));
        if (res > 100) {
            return res - (res * e);
        }
        return res;
    }
}
