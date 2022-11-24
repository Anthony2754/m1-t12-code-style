import java.util.Scanner;

    public class CalculateDeposit {
        double calculateComplexPercentFunction(double amount, double yearRate, int depositTеrm) {

            double pay = amount * Math.pow((1 + yearRate / 12), 12 * depositTеrm);
            return round(pay, 2);
        }

        double calculateSimplePercentFunction(double doubleAmount, double yearRate, int depositTеrm) {
            return round (doubleAmount + doubleAmount * yearRate * depositTеrm, 2);
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

