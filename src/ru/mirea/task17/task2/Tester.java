package ru.mirea.task17.task2;

public class Tester {

    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        System.out.println("\n\tAfter editing:");
        controller.setEmployeeName("Petr Ivanov");
        controller.setEmployeeTitle("Engineer");
        controller.setEmployeeWage(15);
        controller.setEmployeeWeekHours(50);

        controller.updateView();
    }

    private static Employee retriveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Ivan Petrov");
        employee.setJobTitle("Janitor");
        employee.setWage(7.25);
        employee.setWeekHours(40);
        return employee;
    }
}
