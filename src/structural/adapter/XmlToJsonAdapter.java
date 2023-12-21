package structural.adapter;

class XmlToJsonAdapter implements AnalyticsTool {

    @Override
    public void analyzeData(String xmlData) {
        System.out.println("Converting the XML Data '" + xmlData + "' to JSON Data!");
        String newData = xmlData + " in json";
        JsonAnalyticsTool jsonAnalyticsTool = new JsonAnalyticsTool();
        jsonAnalyticsTool.analyzeData(newData);
    }
}
