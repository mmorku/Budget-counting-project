public class Account {
    private int id;
    private int totalSum;
    private String additionalInfo;

    public Account(int id, int totalSum, String additionalInfo) {
        this.id = id;
        this.totalSum = totalSum;
        this.additionalInfo = additionalInfo;
    }
    public int getId() {
        return id;
    }
    public int getTotalSum() {
        return totalSum;
    }
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", totalSum=" + totalSum +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}
