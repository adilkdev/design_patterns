package structural.adapter;

public class Main {
    public static void main(String[] ar) {
        String jsonData = "this is json data";
        String xmlData = "this is xml data";
        AnalyticsTool analyticsTool = new JsonAnalyticsTool();
        analyticsTool.analyzeData(jsonData);

        analyticsTool = new XmlToJsonAdapter();
        analyticsTool.analyzeData(xmlData);
    }
}
