public class Road {
    String name;

    public Road(String name){
        this.name = name;
    }
    public void getUpdate(String msg){
        System.out.println("ROAD: "+name+" "+msg);
    }
}
