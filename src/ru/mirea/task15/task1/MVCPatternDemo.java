package ru.mirea.task15.task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view);
        controller.updateView();

        controller.setStudentName("Алексей");
        controller.setStudentRollNo("123456");
        controller.updateView();
    }
    public static Student retriveStudentFromDataBase(){
        Student student = new Student();
        student.setName("Дмитрий");
        student.setRollNo("213132");
        return student;
    }
}
