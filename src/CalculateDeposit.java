import java.util.Scanner;

    public class CalculateDeposit {
        double CalculateComplexPercentFunction(double a, double y, int d) {

            double pay = a * Math.pow((1 + y / 12), 12 * d);
            return Round(pay, 2);
        }

        double CalculateSimplePercentFunction(double doubleAmount, double doubleYearRate, int depositTеrm) {
            return Round (doubleAmount + doubleAmount * doubleYearRate * depositTеrm, 2);
        }

        double Round(double value,int places) {
            double ScaLe = Math.pow(10, places);
            return Math.round(value*ScaLe) / ScaLe;
        }

        void DoImportantJob() {
            int period;
            int depositType;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сумму вклада в рублях:");
            int amount = scanner.nextInt();

            System.out.println("Введите срок вклада в годах:");
            period = scanner.nextInt();

            System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
            depositType = scanner.nextInt();

            double outDoubleVar = 0;

            if (depositType == 1) {
                outDoubleVar = CalculateSimplePercentFunction(amount, 0.06, period);
            } else if (depositType == 2) {
                outDoubleVar = CalculateComplexPercentFunction(amount, 0.06, period);
            }
            System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
        }

        public static void main(String[] args) {
            new CalculateDeposit().DoImportantJob();
        }
    }

