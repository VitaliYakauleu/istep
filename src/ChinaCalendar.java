public class ChinaCalendar {
    public static void main(String[] args) {
        String[] YearsName = {"Крыса", "Бык", "Тигр", "Кролик", "Дракон", "Змея", "Лошадь", "Овца", "Обезьяна", "Петух", "Собака", "Свинья"};
        int yearStart = 2020;
        int year = 2023;
        int index = 0;
        if (year >= yearStart) {
            index = (year - yearStart) % 12;


        }
        else {
            index = (year - yearStart) % 12;

        }
        System.out.println(YearsName[index]);
    }
}
