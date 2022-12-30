public class Income {

    private static int id;
    private int totalSum;
    private String date;
    private String category;
    private String paymentType;
    private String additionalInfo;

    public Income(int totalSum, String date, String category, String paymentType, String additionalInfo) {
        this.totalSum = totalSum;
        this.date = date;
        this.category = category;
        this.paymentType = paymentType;
        this.additionalInfo = additionalInfo;
    }

    public static int getId() {
        return id;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
}
