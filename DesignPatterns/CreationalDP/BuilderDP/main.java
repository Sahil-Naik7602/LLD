package BuilderDP;

public class main {
    public static void main(String args[]){
        DesktopBuilder hpBuilder = new hpDesktopBuilder();
        ChiefEngineer engineer1 = new ChiefEngineer(hpBuilder);
        engineer1.constructDesktop();
        engineer1.DeliverDesktop();
        
        DesktopBuilder dellBuilder = new dellDesktopBuilder();
        ChiefEngineer engineer2 = new ChiefEngineer(dellBuilder);
        engineer2.constructDesktop();
        engineer2.DeliverDesktop();
    }
    
}
