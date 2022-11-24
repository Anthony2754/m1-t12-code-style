import java.util.Scanner;

    public class CalculateDeposit {
        double calculateComplexPercentFunction(double a, double y, int d) {

            double pay = a * Math.pow((1 + y / 12), 12 * d);
            return round(pay, 2);
        }

        double calculateSimplePercentFunction(double doubleAmount, double doubleYearRate, int depositTеrm) {
            return round (doubleAmount + doubleAmount * doubleYearRate * depositTеrm, 2);
        }

        double round(double value,int places) {
            double ScaLe = Math.pow(10, places);
            return Math.round(value*ScaLe) / ScaLe;
        }

        void doImportantJob() {
            int period;
            int depositType;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сумму вклада в рублях:");
            int amount = scanner.nextInt();

            System.out.println("Введите срок вклада в годах:");
            period = scanner.nextInt();

            System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
            depositType = scanner.nextInt();

            double depositAmount = 0;

            if (depositType == 1) {
                depositAmount = calculateSimplePercentFunction(amount, 0.06, period);
            } else if (depositType == 2) {
                depositAmount = calculateComplexPercentFunction(amount, 0.06, period);
            }
            System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + depositAmount);
        }

        public static void main(String[] args) {
            new CalculateDeposit().doImportantJob();
        }
    }

