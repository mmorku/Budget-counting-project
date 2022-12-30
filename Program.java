import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Budget budget = new Budget();
        Scanner scanner = new Scanner(System.in);
        boolean runprogram = true;
        while (runprogram) {
            printPossibleOptions();
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> {
                    enterTheIncome(scanner, budget);
                }
                case "2" -> {
                    enterTheExpenses(scanner, budget);
                }
                case "10" -> budget.printIncomes();
                case "20" -> budget.printExpenses();
                case "+" -> budget.getSumOfAllIncomes();
                case "-" -> budget.getSumOfAllExpenses();
                case "3" -> budget.getTotalBalance();
                case "de" -> enterTheId(scanner, budget);
                case "di" -> enterTheId2(scanner, budget);
                case "x" -> runprogram = false;
                default -> System.out.println("Nežinoma komanda");
            }
        }
        System.out.println("Programa baigė darbą");
        scanner.close();
    }

    private static void printPossibleOptions() {
        System.out.println("""
                Pasirinkite:
                [1] - Įvesti pajamas;
                [2] - Įvesti išlaidas;
                [3] - Rodyti bendrą balansą;
                [+] - Rodyti gautų pajamų sumą;
                [-] - Rodyti visų išlaidų sumą;
                
                [10] - Atspausdinti pajamų sąrašą;
                [20] - Atspausdinti išlaidų sąrašą;
                
                [de] - Ištrinti išlaidų įrašą;
                [di] - Ištrinti pajamų įrašą;
                [x] - Baigti;
                """);
    }

    private static void enterTheIncome(Scanner scanner, Budget budget) {
//        System.out.println("Įveskite pajamų kiekį: ");
//        int totalSum = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Įveskite pajamų gavimo datą, formatu (yyyy-MM-dd): ");
//        String dateInput = scanner.nextLine();
//        LocalDate localDate = LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE);
//
//        System.out.println("Įveskite kategorija: ");
//        String category = String.format(scanner.nextLine());
//
//        System.out.println("Įveskite kur gavote pajamas:  i banka pavedimu, ar ne ");
//        String paymentType = String.format(scanner.nextLine());
//
//        System.out.println("Įveskite papildoma info: ");
//        String additionalInfo = String.format(scanner.nextLine());
//
//        budget.addIncomeToList(new Income(totalSum, dateInput, category, paymentType, additionalInfo));


        budget.addIncomeToList(new Income(Counter.getNextIncomeCounterId(),50000, "2022-01-01", "nAn", "gryni", "no"));
        budget.addIncomeToList(new Income(Counter.getNextIncomeCounterId(), 100, "2022-01-01", "nAn", "gryni", "no"));
    }

    private static void enterTheExpenses(Scanner scanner, Budget budget) {
//        System.out.println("Įveskite išlaidų kiekį: ");
//        Integer totalSum = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Įveskite išlaidų gavimo datą ir laiką, formatu (yyyy-MM-dd  HH:mm): ");
//        String dateAndTime = scanner.nextLine();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime LocalDateTime = java.time.LocalDateTime.parse(dateAndTime, formatter);
//
//        System.out.println("Įveskite kategorija: ");
//        String category = String.format(scanner.nextLine());
//
//        System.out.println("Įveskite koks buvo atsiskaitymo budas:  Kortele, ar grynaisiais");
//        String paymentType = String.format(scanner.nextLine());
//
//        System.out.println("Įveskite papildoma info: ");
//        String additionalInfo = String.format(scanner.nextLine());

//        budget.addExpensesToList(new Expense(totalSum, dateAndTime, category, paymentType, additionalInfo));

        budget.addExpensesToList(new Expense(Counter.getNextExpensesCounterId(), 50, "2022-01-01 12:00", "nAn", "gryni", "no"));
        budget.addExpensesToList(new Expense(Counter.getNextExpensesCounterId(),30, "2022-01-01 12:00", "nAn", "gryni", "no"));
    }

    private static void enterTheId(Scanner scanner, Budget budget) {
        System.out.println("Įveskite id: ");
        int id = Integer.parseInt(scanner.nextLine());
        budget.deleteExpense(id);
    }
    private static void enterTheId2(Scanner scanner, Budget budget) {
        System.out.println("Įveskite id: ");
        int id = Integer.parseInt(scanner.nextLine());
        budget.deleteIncome(id);
    }
}
