public class List {
    private int id;
    private int totalSum;
    private String additionalInfo;

    public List(int id, int totalSum, String additionalInfo) {
        this.id = id;
        this.totalSum = totalSum;
        this.additionalInfo = additionalInfo;
    }

    public List() {

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

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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
