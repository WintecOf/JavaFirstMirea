package ru.mirea.task17.task2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeTitle(String title) {
        model.setJobTitle(title);
    }

    public String getEmployeeTitle() {
        return model.getJobTitle();
    }

    public void setEmployeeWeekHours(int hours) {
        model.setWeekHours(hours);
    }

    public int getEmployeeWeekHours() {
        return model.getWeekHours();
    }

    public void setEmployeeWage(int wage) {
        model.setWage(wage);
    }

    public double getEmployeeWage() {
        return model.getWage();
    }

    public String getEmployeeSalary() {
        return getEmployeeWage()*getEmployeeWeekHours()*48 + " $";
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getJobTitle(), getEmployeeSalary());
    }
}
