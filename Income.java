import java.util.Objects;

public class Income extends List {

    private String date;
    private String incomeCategory;
    private String incomePaymentType;

    public Income(int id, int totalSum, String additionalInfo, String date, String incomeCategory, String incomePaymentType) {
        super(id, totalSum, additionalInfo);
        this.date = date;
        this.incomeCategory = incomeCategory;
        this.incomePaymentType = incomePaymentType;
    }

    public Income(String date, String incomeCategory, String incomePaymentType) {
        this.date = date;
        this.incomeCategory = incomeCategory;
        this.incomePaymentType = incomePaymentType;
    }

    public Income(int id, int totalSum, String additionalInfo) {
        super(id, totalSum, additionalInfo);
    }

    public Income() {
    }

    public Object getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return incomeCategory;
    }

    public void setCategory(String incomeCategory) {
        this.incomeCategory = incomeCategory;
    }

    public String getPaymentType() {
        return incomePaymentType;
    }

    public void setPaymentType(String incomePaymentType) {
        this.incomePaymentType = incomePaymentType;
    }

    @Override
    public String toString() {
        return "Income{" +
                "dateAndTime='" + date + '\'' +
                ", category='" + incomeCategory + '\'' +
                ", paymentType='" + incomePaymentType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Income income)) return false;
        return Objects.equals(date, income.date) && Objects.equals(incomeCategory, income.incomeCategory) && Objects.equals(incomePaymentType, income.incomePaymentType);
    }

}
