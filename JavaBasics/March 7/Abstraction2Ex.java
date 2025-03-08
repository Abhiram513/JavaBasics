abstract class Database{
    abstract void connecting();
    void disconnect(){
        System.out.println("the system is going to disconnect");
    }
}

class MyData extends Database{
    void connecting(){
        System.out.println("the system is connecting");
    }
}

public class Abstraction2Ex {
    public static void main(String[] args) 
    {
        MyData md = new MyData();
        md.connecting();
        md.disconnect();

    }
}