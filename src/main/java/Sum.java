public class Sum {
    public static void main(String[] args) {
        double totalSum = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                double val = Double.parseDouble(args[i]);
                totalSum += val;
                System.out.println("Аргумент " + i + " (" + args[i] + ") принят как число.");
            } catch (NumberFormatException e) {
                System.out.println("Аргумент " + i + " (" + args[i] + ") не является числом, считаем за 0.");
            }
        }
        System.out.println("\nИтоговый результат: " + totalSum);
    }
}
