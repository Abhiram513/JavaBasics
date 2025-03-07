public class ConstructorEx {
    String name;
    long num;

    ConstructorEx() {
        name = "Abhiram";
        num = 6303655266L;
    }

    void show() {
        System.out.println(name + " " + num);
    }

    public static void main(String[] args) {
        ConstructorEx obj = new ConstructorEx();
        obj.show();
    }
}
