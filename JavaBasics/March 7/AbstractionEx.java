abstract class Trainer
{
    abstract void Teach();
}

class Student extends Trainer 
{
   void Teach()
   {
       System.out.println("the trainer is teaching the students");
   }
} 

public class AbstractionEx 
{
   public static void main(String[] args) 
   {
       Student obj = new Student();
       obj.Teach();


    }
}