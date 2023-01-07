import java.io.*;

public class Failas {

    public static String getDataFromFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder result = new StringBuilder();
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String id = values[0];
                String totalSum = values[1];
                String additionalInfo = values[2];
                String date = values[3];
                String category = values[4];
                String paymentType = values[5];
                result.append(line);
            }
            return result.toString();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void saveToFile(Budget budget) throws IOException {
        File file = new File("data.csv");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            for (Income income : budget.getIncomes()) {
                bw.write(income.getCsvValue() + "\n");
            }
            for (Expense expense : budget.getExpenses()) {
                bw.write(expense.getCsvValue() + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
