public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = " Ivan";
        String lastName = " Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println();

        System.out.println("Задача 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println();

        System.out.println("Задача 3");
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}