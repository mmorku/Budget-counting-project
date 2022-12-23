import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
                case "+" -> budget.getFullIncomeList();
                case "-" -> budget.getFullExpensesList();
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
                [+] - Rodyti visas gautas pajamas;
                [-] - Rodyti visas išlaidas;
                [x] - Baigti;
                """);
    }

    private static void enterTheIncome(Scanner scanner, Budget budget) {
        System.out.println("Įveskite pajamų kiekį: ");
        int totalSum = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite pajamų gavimo datą, formatu (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("Įveskite kategorija: ");
        String category = String.format(scanner.nextLine());

        System.out.println("Įveskite kur gavote pajamas:  i banka pavedimu, ar ne ");
        String paymentType = String.format(scanner.nextLine());

        System.out.println("Įveskite papildoma info: ");
        String additionalInfo = String.format(scanner.nextLine());

        budget.addIncomeToList(new FullIncomeList(totalSum, dateInput, category, paymentType, additionalInfo));
    }

    private static void enterTheExpenses(Scanner scanner, Budget budget) {
        System.out.println("Įveskite išlaidų kiekį: ");
        Integer totalSum = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite išlaidų gavimo datą ir laiką, formatu (yyyy-MM-dd  HH:mm): ");
        String dateAndTime = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime LocalDateTime = java.time.LocalDateTime.parse(dateAndTime, formatter);

        System.out.println("Įveskite kategorija: ");
        String category = String.format(scanner.nextLine());

        System.out.println("Įveskite koks buvo atsiskaitymo budas:  Kortele, ar grynaisiais");
        String paymentType = String.format(scanner.nextLine());

        System.out.println("Įveskite papildoma info: ");
        String additionalInfo = String.format(scanner.nextLine());

        budget.addExpensesToList(new FullExpensesList(totalSum, dateAndTime, category, paymentType, additionalInfo));
    }
}
