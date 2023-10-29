package ru.mirea.task10;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Кирилл", "Кучеренко", "ИВТ", 2, "КВБО-04-22", 4.7);
        Student s2 = new Student("Андрей", "Сидорин", "ИВТ", 2, "КВБО-04-22", 3.5);
        Student s3 = new Student("Татьяна", "Ульянова", "ИВТ", 2, "КВБО-04-22", 5);
        SortingStudentsByGPA group1 = new SortingStudentsByGPA(s1, s2, s3);

        System.out.println("------- Группа 1 ------- \n");
        group1.outArray();
        group1.addArray(new Student("Алиса", "Бышенко", "ИВТ", 2, "КВБО-04-22", 4));
        System.out.println("------- После добавления студента -------\n");
        group1.outArray();

        Student s4 = new Student("Влад", "Индовский", "ИВТ", 2, "КВБО-05-22", 3.75);
        Student s5 = new Student("Андрей", "Рейзер", "ИВТ", 2, "КВБО-05-22", 4.1);
        Student s6 = new Student("Диана", "Рахматулина", "ИВТ", 2, "КВБО-05-22", 5);
        SortingStudentsByGPA group2 = new SortingStudentsByGPA(s4, s5, s6);

        System.out.println("------- Группа 2 -------- \n");
        group2.outArray();

        System.out.println("------- В группу 1 добавили группу 2 -------\n");
        group1.merge(group2);
        group1.outArray();

        System.out.println("------- Создали группу из двух -------\n ");
        SortingStudentsByGPA group3 = new SortingStudentsByGPA(group1, group2);
        group3.outArray();


    }
}
