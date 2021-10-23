public class Person {
    String name;
    String position;
    String email;
    String phone_number;
    int zarplata;
    int age;

    // конструктор
    public Person(String name, String position, String email, String phone_number, int zarplata, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.zarplata = zarplata;
        this.age = age;
    }

    @Override  // переопределяем метод
    public String toString(){
        return String.format("имя: %s | должность: %s | e-mail: %s | тел: %s | зарплата: %d | возраст: %d",
                name, position, email, phone_number, zarplata, age);}

    public void print() {
        System.out.println(this);
    }
}

