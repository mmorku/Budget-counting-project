import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Budget {
    private List<Income> incomes = new ArrayList<>();
    private List<Expense> expenses = new ArrayList<>();

    private int sumOfIncomeList = 0;
    private int sumOfExpensesList = 0;

    public void addIncomeToList(Income income) {
        incomes.add(income);
        System.out.println(incomes.toString());
    }

    public void addExpensesToList(Expense expense) {
        expenses.add(expense);
        System.out.println(expenses.toString());
    }

    public double getSumOfAllIncomes() {
        if (incomes.size() == 0) {
            throw new RuntimeException("Ne");
        } else {
            double sumOfIncome = 0;
            for (Income income : incomes) {
                sumOfIncome += income.getTotalSum();
            }
            System.out.printf("Pajamų suma. VISO: %s Eur \n", sumOfIncome);
            return sumOfIncome;
        }
    }

    public double getSumOfAllExpenses() {
        if (expenses.size() == 0) {
            throw new RuntimeException("Ne");
        } else {
            double sumOfExpenses = 0;
            for (Expense expense : expenses) {
                sumOfExpenses += expense.getTotalSum();
            }
            System.out.printf("Išlaidų suma. VISO: %s Eur\n", sumOfExpenses);
            return sumOfExpenses;
        }
    }

    public double getTotalBalance() {
        if (incomes.size() == 0 || expenses.size() == 0) {
            throw new RuntimeException("Ne");
        } else {
            double totalBalance = getSumOfAllIncomes() - getSumOfAllExpenses();
            System.out.printf("Balanso bendra suma. VISO: %s Eur\n", totalBalance);
            return totalBalance;
        }
    }

    public void printExpenses() {
        for (Expense expense : expenses) {
            String formattedExpense = String.format(
                    "ID: %1$d, TotalSum: %2$d, Date and Time: %3$s, Category: %4$s, Payment type: %5$s, Additional info: %6$s \n",
                    expense.getId(), expense.getTotalSum(), expense.getDate(), expense.getExpenseCategory(), expense.getExpensePaymentType(), expense.getAdditionalInfo());
            System.out.printf(formattedExpense);
        }
    }

    public void printIncomes() {
        for (Income income : incomes) {
            String formattedIncome = String.format(
                    "ID: %1$d, TotalSum: %2$d, Date and Time: %3$s, Category: %4$s, Payment type: %5$s, Additional info: %6$s \n",
                    income.getId(), income.getTotalSum(), income.getDate(), income.getCategory(), income.getPaymentType(), income.getAdditionalInfo());
            System.out.printf(formattedIncome);
        }

    }

    public void deleteExpense(int id) {
        Expense filteredExpense = expenses
                .stream()
                .filter(expense -> expense.getId() == id).findAny().orElse(null);
        expenses.remove(filteredExpense);
    }

    public void deleteIncome(int id) {
        Income filteredIncome = incomes
                .stream()
                .filter(income -> income.getId() == id).findAny().orElse(null);
        incomes.remove(filteredIncome);
    }

    public void editExpensesListItem (int id, int id2) {
        Expense filteredExpense = expenses
                .stream()
                .filter(expense -> expense.getId() == id).findAny().orElse(null);
        filteredExpense.setTotalSum(id2);
        printExpenses();
    }

    public void editIncomesListItem (int id, int id2) {
        Income filteredIncome = incomes
                .stream()
                .filter(income -> income.getId() == id).findAny().orElse(null);
        filteredIncome.setTotalSum(id2);
        printIncomes();
    }
}
