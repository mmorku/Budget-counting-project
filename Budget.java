import java.util.Arrays;

public class Budget {
    private int sumOfIncome = 0;
    private int sumOfExpenses = 0;

    FullIncomeList[] income = new FullIncomeList[100];
    FullExpensesList[] expenses = new FullExpensesList[100];

    private int sumOfIncomeList = 0;
    private int sumOfExpensesList = 0;

    public void addIncomeToList(FullIncomeList fullIncomeList) {
        if (sumOfIncomeList == income.length) {
            throw new ArrayIndexOutOfBoundsException("Pajamų sąrašas pilnas, pašalinkite dalį sąrašo ir kartokite iš naujo.");
        }
        income[sumOfIncomeList] = fullIncomeList;
        sumOfIncomeList++;
        System.out.println(Arrays.toString(income));
    }

    public void addExpensesToList(FullExpensesList fullExpensesList) {
        if (sumOfExpensesList == expenses.length) {
            throw new ArrayIndexOutOfBoundsException("Išlaidų sąrašas pilnas, pašalinkite dalį sąrašo ir kartokite iš naujo.");
        }
        expenses[sumOfExpensesList] = fullExpensesList;
        sumOfExpensesList++;
        System.out.println(Arrays.toString(expenses));
    }

    public void getFullIncomeList() {
        if (sumOfIncomeList == 0) {
            throw new NullPointerException("Pajamų sąrašas tuščias.");
        }
        for (FullIncomeList FullIncomeList : income) {
            if (FullIncomeList != null) {
                System.out.printf("Pajamų sąrašas: %s \n", income);
                sumOfIncome += FullIncomeList.getTotalSum();
                System.out.printf("Pajamų sąrašo suma: %s \n", sumOfIncome);
            }
        }
    }

    public void getFullExpensesList() {
        if (sumOfExpensesList == 0) {
            throw new ArrayIndexOutOfBoundsException("Išlaidų sąrašas tuščias.");
        }
        for (FullExpensesList FullExpensesList : expenses) {
            if (FullExpensesList != null) {
                System.out.printf("Išlaidų sąrašas: %s \n", expenses);
                sumOfExpenses += FullExpensesList.getTotalSum();
                System.out.printf("Išlaidų sąrašo suma: %s \n", sumOfExpenses);
            }
        }
    }
}
