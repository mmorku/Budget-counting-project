import java.util.Objects;

public class Expense extends List {

    private String date;
    private String expenseCategory;
    private String expensePaymentType;

    public Expense(int id, int totalSum, String additionalInfo, String date, String expenseCategory, String expensePaymentType) {
        super(id, totalSum, additionalInfo);
        this.date = date;
        this.expenseCategory = expenseCategory;
        this.expensePaymentType = expensePaymentType;
    }

    public Expense(String date, String expenseCategory, String expensePaymentType) {
        this.date = date;
        this.expenseCategory = expenseCategory;
        this.expensePaymentType = expensePaymentType;
    }

    public Expense(int id, int totalSum, String additionalInfo) {
        super(id, totalSum, additionalInfo);
    }

    public Expense() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public String getExpensePaymentType() {
        return expensePaymentType;
    }

    public void setExpensePaymentType(String expensePaymentType) {
        this.expensePaymentType = expensePaymentType;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "date='" + date + '\'' +
                ", category='" + expenseCategory + '\'' +
                ", paymentType='" + expensePaymentType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Expense expense)) return false;
        return Objects.equals(date, expense.date) && Objects.equals(expenseCategory, expense.expenseCategory) && Objects.equals(expensePaymentType, expense.expensePaymentType);
    }

}
