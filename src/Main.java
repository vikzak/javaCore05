public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "info1@qqq.com", "+7(903)321-21-31", 30000, 30);
        persArray[1] = new Person("Petrov Vasya", "Director", "info2@qqq.com", "+7(903)321-21-32", 70000, 50);
        persArray[2] = new Person("Kirillov Alexey", "IT Administrator", "info3@qqq.com", "++7(903)321-21-33", 40000, 44);
        persArray[3] = new Person("Sidorov Vova", "anykey", "info4@qqq.com", "+7(903)321-21-34", 10000, 20);
        persArray[4] = new Person("Vasilyev Pavel", "Operator", "info5@qqq.com", "+7(903)321-21-35", 20000, 33);
        System.out.printf("Сотрудники старше 40 лет:\n");
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].print();
        }
    }
}