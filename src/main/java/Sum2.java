public class Sum2 {
    public static void main(String[] args) {
        double totalSum = 0;

        for (int i = 0; i < args.length; i++) {
            if (args[i].matches("-?\\d+(\\.\\d+)?")) {
                double val = Double.parseDouble(args[i]);
                totalSum += val;
                System.out.println("Аргумент " + i + " (" + args[i] + ") принят как число.");
            } else {
                System.out.println("Аргумент " + i + " (" + args[i] + ") пропущен (не число).");
            }
        }
        System.out.println("\nИтоговый результат: " + totalSum);
    }
}
