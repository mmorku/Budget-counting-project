public class Counter {
    private static int expensesCounterId = 0;
    private static int incomeCounterId = 0;

    public static int getNextExpensesCounterId() {
        return expensesCounterId++;
    }
    public static int getNextIncomeCounterId() {
        return incomeCounterId++;
    }
}
