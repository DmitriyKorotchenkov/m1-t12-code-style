import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);

            return cameUpWithTheNameOfTheMethod(pay, 2);
    }

    double calculateSimplePercent(double doubleAmount, double double_year_rate, int deposit_period) {
        return cameUpWithTheNameOfTheMethod(doubleAmount + doubleAmount * double_year_rate * deposit_period, 2);
    }

    double cameUpWithTheNameOfTheMethod(double value, int places) {
        double ScaLe = Math.pow(10, places);

            return Math.round(value * ScaLe) / ScaLe;
    }

    void printMenu() {
        int period;
        int action;

        Scanner command = new Scanner(System.in);
            System.out.println("Введите сумму вклада в рублях:");
        int amount = command.nextInt();

            System.out.println("Введите срок вклада в годах:");
                period = command.nextInt();
            System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
                action = command.nextInt();
        double out = 0;

        if (action == 1) {
            out = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2){
            out = calculateComplexPercent(amount, 0.06, period);
                System.out.println("Результат вклада: " + amount + " за " + period
                    + " лет превратятся в " + out);
        }

}
public static void main(String[] args) {
    new DepositCalculator().printMenu();
    }
}
