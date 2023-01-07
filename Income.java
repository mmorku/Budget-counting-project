import java.util.Objects;

public class Income extends Account {

    private String date;
    private String incomeCategory;
    private String incomePaymentType;

    public Income(int id, int totalSum, String additionalInfo, String date, String incomeCategory, String incomePaymentType) {
        super(id, totalSum, additionalInfo);
        this.date = date;
        this.incomeCategory = incomeCategory;
        this.incomePaymentType = incomePaymentType;
    }

    public Object getDate() {
        return date;
    }

    public String getCategory() {
        return incomeCategory;
    }

    public String getPaymentType() {
        return incomePaymentType;
    }

    @Override
    public String toString() {
        return "Income{" +
                "date='" + date + '\'' +
                ", incomeCategory='" + incomeCategory + '\'' +
                ", incomePaymentType='" + incomePaymentType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Income income)) return false;
        return Objects.equals(date, income.date) && Objects.equals(incomeCategory, income.incomeCategory) && Objects.equals(incomePaymentType, income.incomePaymentType);
    }

    public String getCsvValue(){
        return String.format("%s, %s, %s, %s, %s, %s", this.getId(), this.getTotalSum(), this.getAdditionalInfo(), this.date, this.incomeCategory, this.incomePaymentType);
    }
}
