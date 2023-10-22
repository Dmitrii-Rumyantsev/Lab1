package ru.mirea.task15.task2;

public class MVCPatternDemo{
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDataBase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model,view);
        controller.updateView();

        controller.setFIO("Ястребов Алексей Сергеевич");
        controller.setMoney(90_000);
        controller.setYearWork(1);

        controller.updateView();
    }
    public static Employee retriveEmployeeFromDataBase(){
        Employee employee = new Employee();
        employee.setFIO("Румянцев Дмитрий Дмитриевич");
        employee.setYearWork(10);
        employee.setMoney(100_000);
        return employee;
    }
}
