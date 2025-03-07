class Inheritance  
{
    void speak()
    {
        System.out.println("Yes, students will speak");
    }
}

class Teacher extends Inheritance  
{
    void teach()
    {
        System.out.println("Yes, they are teachers");
    }
}

class Principal extends Teacher  
{
    void talk()
    {
        System.out.println("Yes, they are principal");
    }

    public static void main(String[] args) 
    {
        Principal obj = new Principal();
        obj.speak();  
        obj.teach();  
        obj.talk() ;   

    }
}
