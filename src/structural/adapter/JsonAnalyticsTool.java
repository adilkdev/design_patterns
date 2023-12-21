package structural.adapter;

public class JsonAnalyticsTool implements AnalyticsTool {

    public void analyzeData(String data) {
        if (data.contains("json")) {
            System.out.println("Analyzing JSON Data - " + data);
        } else {
            System.out.println("Not in the correct format. Can't analyze!");
        }
    }
}