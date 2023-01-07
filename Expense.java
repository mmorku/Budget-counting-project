import java.util.Objects;

public class Expense extends Account {

    private String date;
    private String expenseCategory;
    private String expensePaymentType;

    public Expense(int id, int totalSum, String additionalInfo, String date, String expenseCategory, String expensePaymentType) {
        super(id, totalSum, additionalInfo);
        this.date = date;
        this.expenseCategory = expenseCategory;
        this.expensePaymentType = expensePaymentType;
    }

    public String getDate() {
        return date;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public String getExpensePaymentType() {
        return expensePaymentType;
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

    public String getCsvValue(){
        return String.format("%s, %s, %s, %s, %s, %s", this.getId(), this.getTotalSum(), this.getAdditionalInfo(), this.date, this.expenseCategory, this.expensePaymentType);
    }
}
