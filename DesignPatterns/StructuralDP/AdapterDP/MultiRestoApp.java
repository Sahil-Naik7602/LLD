public class MultiRestoApp implements IMultiRestoApp{
    @Override
    public void displayMenus(XmlData xmlData) {
        System.out.println("Displaying menus in XML format");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("Displaying recommendations in XML format");
    }
}
