package ru.mirea.task15.task2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }

    public void setFIO(String FIO){
        model.setFIO(FIO)   ;
    }
    public void setMoney(int money){
        model.setMoney(money);   ;
    }
    public void setYearWork(int yearWork){
        model.setYearWork(yearWork);   ;
    }
    public String getFIO(String FIO){
        return model.getFIO();
    }
    public int getMoney(int money){
        return model.getMoney();
    }
    public int getYearWork(int yearWork){
        return model.getYearWork() ;
    }
    public void updateView(){
        view.printEmployeeDetails(model.getFIO(), (int) ((model.getMoney() + model.getMoney() * (model.getYearWork()* 0.03)) - model.getMoney() * (0.13)), model.getYearWork() );
    }
}
