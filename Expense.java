public class Expense {

    private int id;
    private int totalSum;
    private String dateAndTime;
    private String category;
    private String paymentType;
    private String additionalInfo;

    public Expense(int id, int totalSum, String dateAndTime, String category, String paymentType, String additionalInfo) {
        this.id = id;
        this.totalSum = totalSum;
        this.dateAndTime = dateAndTime;
        this.category = category;
        this.paymentType = paymentType;
        this.additionalInfo = additionalInfo;
    }

    public int getId() {
        return id;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public String toString() {
        return "Expense{" +
                ", id=" + id +
                ", totalSum=" + totalSum +
                ", dateAndTime='" + dateAndTime + '\'' +
                ", category='" + category + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}
