
class Person {

    private String name;
    private int age;

    // Metode setter untuk atribut name
    public void setName(String name) {
        this.name = name;
    }

    // Metode setter untuk atribut age
    public void setAge(int age) {
        this.age = age;
    }

    // Metode getter untuk atribut name
    public String getName() {
        return name;
    }

    // Metode getter untuk atribut age
    public int getAge() {
        return age;
    }
}

public class main {

    public static void main(String[] args) {
        Person person = new Person();

        // Menggunakan metode setter untuk mengatur nilai atribut
        person.setName("Wannn Sion");
        person.setAge(25);

        // Menggunakan metode getter untuk mendapatkan nilai atribut
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
