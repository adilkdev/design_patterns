package structural.adapter;

public class Main {
    public static void main(String[] ar) {
        AnalyticsTool analyticsTool = new JsonAnalyticsTool();
        analyticsTool.analyzeData("this is json data");

        analyticsTool = new XmlToJsonAdapter();
        analyticsTool.analyzeData("this is xml data");
    }
}
