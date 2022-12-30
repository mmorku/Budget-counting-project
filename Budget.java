import java.util.ArrayList;
import java.util.Arrays;

public class Budget {
    private Income[] incomes = new Income[100];
    private Expense[] expenses = new Expense[100];

//    ArrayList<Income> incomeListArray = new ArrayList<>();
//    ArrayList<Expense> expenseListArray = new ArrayList<>();

    private int sumOfIncomeList = 0;
    private int sumOfExpensesList = 0;


//    public void addIncomeToArrayList(ArrayList arrayList) {
//        if (sumOfIncomeList == income.length) {
//            throw new ArrayIndexOutOfBoundsException("Pajamų sąrašas pilnas, pašalinkite dalį sąrašo ir kartokite iš naujo.");
//        }
//    }


    public void addIncomeToList(Income income) {
        if (sumOfIncomeList == this.incomes.length) {
            throw new ArrayIndexOutOfBoundsException("Pajamų sąrašas pilnas, pašalinkite dalį sąrašo ir kartokite iš naujo.");
        }
        this.incomes[sumOfIncomeList] = income;
        sumOfIncomeList++;
        System.out.println(Arrays.toString(this.incomes));
    }

    public void addExpensesToList(Expense expense) {
        if (sumOfExpensesList == this.expenses.length) {
            throw new ArrayIndexOutOfBoundsException("Išlaidų sąrašas pilnas, pašalinkite dalį sąrašo ir kartokite iš naujo.");
        }
        this.expenses[sumOfExpensesList] = expense;
        sumOfExpensesList++;
        System.out.println(Arrays.toString(this.expenses));
    }

    public void getFullIncomeList() {
        if (sumOfIncomeList == 0) {
            throw new NullPointerException("Pajamų sąrašas tuščias.");
        }
        double sumOfIncome = 0;
        for (Income income : incomes) {
            if (income != null) {
//                System.out.printf("Pajamų sąrašas: %s \n", income);
                sumOfIncome += income.getTotalSum();
            }
        }
        System.out.printf("Pajamų suma. VISO: %s Eur \n", sumOfIncome);
    }

    public void getFullExpensesList() {
        if (sumOfExpensesList == 0) {
            throw new ArrayIndexOutOfBoundsException("Išlaidų sąrašas tuščias.");
        }
        double sumOfExpenses = 0;
        for (Expense expense : expenses) {
            if (expense != null) {
//                System.out.printf("Išlaidų sąrašas: %s \n", expenses);
                sumOfExpenses += expense.getTotalSum();
            }
        }
        System.out.printf("Išlaidų suma. VISO: %s Eur\n", sumOfExpenses);
    }

    public double getBalance() {
//        return balance == null || balance.isEmpty() ? Double.NaN : Double.parseDouble(balance = String.valueOf(sumOfIncome - sumOfExpenses));

//        double balance = Double.parseDouble(String.valueOf(sumOfIncome)) - Double.parseDouble(String.valueOf(sumOfExpenses));
//        System.out.printf("Balanso suma. VISO: %d Eur\n", balance);

//        if (balance != null) {
//            System.out.printf("Balanso suma. VISO: %d Eur\n", balance);
//        } else {
//            throw new ArrayIndexOutOfBoundsException("Balansas yra 0 Eur");
//
//       }
        return 0;
    }
}
