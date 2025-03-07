

class ConstructorPara{
    String name;
    int age;

    ConstructorPara(){
        name = "Abhiram";
        age = 22;
    }
    public ConstructorPara(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorPara s1 = new ConstructorPara();
        s1.display();
    }
}
