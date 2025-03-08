class Encap
{
    private String name;
    void setname(String name)
    {
        this.name = name;
    }

    String getname()
    {
        return name;
    }
}

public class EncapsulationEx
{
    public static void main(String[] args) {
        Encap obj1 = new Encap();
        obj1.setname("Abhi");
        System.out.println("Name: "+obj1.getname());
    }
}