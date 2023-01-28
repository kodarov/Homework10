public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "";
        String lastName = "Ivanov";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        if (firstName.length() == 0 || middleName.length() == 0 || lastName.length() == 0) {
            throw new RuntimeException("Отсутствуют полные данные");
        }
    }
    public static void task2(){
        System.out.println("Задание 2");
    }
    public static void task3(){
        System.out.println("Задание 3");
    }
    public static void task4(){
        System.out.println("Задание 4");
    }
}