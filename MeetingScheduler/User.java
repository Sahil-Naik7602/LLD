public class User {
    String name;

    public User(String name){
        this.name = name;
    }

    public void updateUser(String msg){
        System.out.println("Hey "+name+" msg: "+msg);
    }
}
