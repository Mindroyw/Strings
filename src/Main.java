public class Main {
    public static void main(String[] args) {

        //Первая задача
        String firstName = "Ivan";
        String middleName = " Ivanov";
        String lastName = " Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Вторая задача
        String upper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upper);

        //Третья задача
        fullName = "Семён Семёнов Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — "+ fullName);
    }
}