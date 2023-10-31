package pro.sky;

public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        book.printEmployeeBook();
        book.removeEmployee("Petrov", "Petr");
        book.addEmployee("alexanrdov", "alexandr", 5, 45000);
        System.out.println();
        book.printEmployeeBook();
    }
}