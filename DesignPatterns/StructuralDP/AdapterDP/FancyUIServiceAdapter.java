public class FancyUIServiceAdapter implements IMultiRestoApp{
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        this.fancyUIService = new FancyUIService();
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData){
        //convert XML data to JSON
        return new JsonData();//just temporarily written to get rid of errors
    }
}
