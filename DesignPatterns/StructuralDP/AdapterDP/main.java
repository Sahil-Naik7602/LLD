public class main {
    public static void main(String[] args) {
        XmlData xmlData = new XmlData();
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(xmlData);

        IMultiRestoApp adapter = new FancyUIServiceAdapter();
        adapter.displayMenus(xmlData);


    }
}
