import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public Program() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        Budget budget = new Budget();
        Scanner scanner = new Scanner(System.in);
        boolean runprogram = true;
        while (runprogram) {
            printPossibleOptions();
            String input = scanner.nextLine();
            switch (input) {
                case "0" -> {
                    addSomethingToList(scanner, budget);
                }
                case "10" -> budget.printIncomes();
                case "20" -> budget.printExpenses();
                case "+" -> budget.getSumOfAllIncomes();
                case "-" -> budget.getSumOfAllExpenses();
                case "3" -> budget.getTotalBalance();
                case "de" -> enterTheId(scanner, budget);
                case "di" -> enterTheId2(scanner, budget);
                case "5" -> Failas.saveToFileBufferedWriter(budget.toString(), budget.toString());
                case "6" -> Failas.getDataFromFileBufferedReader(new File(budget.toString()));
                case "edit" -> editSomethingInTheList(scanner, budget);
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
                [0] - Įvesti biudzeto duomenis;
                [3] - Rodyti bendrą balansą;
                [+] - Rodyti gautų pajamų sumą;
                [-] - Rodyti visų išlaidų sumą;
                                
                [10] - Atspausdinti pajamų sąrašą;
                [20] - Atspausdinti išlaidų sąrašą;
                [de] - Ištrinti išlaidų įrašą;
                [di] - Ištrinti pajamų įrašą;
                [5] - Išsaugoti duomenis į failą;
                [6] - Gauti duomenis iš failo;
                [edit] - Redaguoti įrašą;
                [x] - Baigti;
                """);
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

    public static void addSomethingToList(Scanner scanner, Budget budget) {
        System.out.println("""
                Pasirinkite:
                [1] - Įvesti pajamas;
                [2] - Įvesti išlaidas;
                """);
        int id = Integer.parseInt(scanner.nextLine());

        if (id == 1) {
//            Program.enterTheIncome(scanner, budget);


//            System.out.println("Įveskite pajamų kiekį: ");
//        int totalSum = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Įveskite papildoma info: ");
//        String additionalInfo = String.format(scanner.nextLine());

//        System.out.println("Įveskite pajamų gavimo datą, formatu (yyyy-MM-dd): ");
//        String dateInput = scanner.nextLine();
//        LocalDate localDate = LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE);
//
//        System.out.println("Įveskite kategorija: ");
//        String category = String.format(scanner.nextLine());
//
//        System.out.println("Įveskite mokejimo tipa:  pavedimu / grynaisiais");
//        String paymentType = String.format(scanner.nextLine());
//
//        budget.addIncomeToList(new Income(totalSum, additionalInfo, dateInput, category, paymentType));


            budget.addIncomeToList(new Income(Counter.getNextIncomeCounterId(), 50000, "no", "2022-01-01", "gryni", "no"));
            budget.addIncomeToList(new Income(Counter.getNextIncomeCounterId(), 100, "no", "2022-01-01", "gryni", "no"));
        } else if (id == 2) {
//            System.out.println("Įveskite išlaidų kiekį: ");
//        Integer totalSum = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Įveskite papildoma info: ");
//        String additionalInfo = String.format(scanner.nextLine());

//        System.out.println("Įveskite išlaidų gavimo datą ir laiką, formatu (yyyy-MM-dd HH:mm): ");
//        String dateAndTime = scanner.nextLine();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime LocalDateTime = java.time.LocalDateTime.parse(dateAndTime, formatter);
//
//        System.out.println("Įveskite kategorija: ");
//        String category = String.format(scanner.nextLine());
//
//        System.out.println("Įveskite koks buvo atsiskaitymo budas:  Kortele, ar grynaisiais");
//        String paymentType = String.format(scanner.nextLine());

//        budget.addExpensesToList(new Expense(totalSum, dateAndTime, category, paymentType, additionalInfo));

            budget.addExpensesToList(new Expense(Counter.getNextExpensesCounterId(), 50, "nAn", "2022-01-01 12:00", "gryni", "no"));
            budget.addExpensesToList(new Expense(Counter.getNextExpensesCounterId(), 30, "nAn", "2022-01-01 12:00", "gryni", "no"));


//            enterTheExpenses(scanner, budget);
        } else System.out.println("Nežinoma komanda");
    }

    public static void editSomethingInTheList(Scanner scanner, Budget budget) {
        System.out.println("""
                Pasirinkite:
                [00] - Redaguoti pajamas;
                [11] - Redaguoti išlaidas;
                """);
        int editOption = Integer.parseInt(scanner.nextLine());
        if (editOption == 00) {
            budget.printIncomes();
            System.out.println("Įveskite id: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Įveskite nauja suma: ");
            int id2 = Integer.parseInt(scanner.nextLine());

            budget.editIncomesListItem(id, id2);

        } else if (editOption == 11) {
            budget.printExpenses();
            System.out.println("Įveskite id: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Įveskite nauja suma: ");
            int id2 = Integer.parseInt(scanner.nextLine());

            budget.editExpensesListItem(id, id2);

        } else System.out.println("Nežinoma komanda");
    }
}
