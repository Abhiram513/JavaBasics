interface Student 
{
    
    void speak();
}

class Trainer implements Student { 
    @Override
    public void speak() 
    {
        System.out.println("Students are learning.");
    }
}

public class InterfaceEx1 {
    public static void main(String[] args) 
    {
        Student obj = new Trainer();
        obj.speak();

    }
}