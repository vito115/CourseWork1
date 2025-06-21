public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 85600);
        employees[1] = new Employee("Данилов", "Андрей", "Сергеевич", 2, 78500);
        employees[2] = new Employee("Петров", "Юрий", "Михайлович", 5, 94200);
        employees[3] = new Employee("Ушаков", "Андрей", "Павлович", 4, 83500);
        employees[4] = new Employee("Дибров", "Виктор", "Матвеевич", 5, 91700);
        employees[5] = new Employee("Филлипов", "Сергей", "Максимович", 4, 101300);
        employees[6] = new Employee("Дуров", "Петр", "Михайлович", 3, 87500);
        employees[7] = new Employee("Симонов", "Павел", "Александрович", 2, 74800);
        employees[8] = new Employee("Воронин", "Илья", "Дмитриевич", 3, 99000);
        employees[9] = new Employee("Сафин", "Евгений", "Русланович", 1, 112100);


        for (Employee employee : employees) {
            System.out.println(employee);
        }

        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
        }
        System.out.println("Общая сумма затрат: " + totalSalary + " руб.");

        Employee minSalaryEmployee = employees[0];
        Employee maxSalaryEmployee = employees[0];

        for (Employee emp : employees) {
            if (emp.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = emp;
            }
            if (emp.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = emp;
            }
        }
        System.out.println("Минимальная зарплата = " + minSalaryEmployee);
        System.out.println("Максимальная зарплата = " + maxSalaryEmployee);

        double averageSalary = totalSalary / employees.length;
        System.out.println("Средняя зарплата равна " + averageSalary + " руб.");

        System.out.println("Список сотрудников:");
        for (Employee emp : employees) {
            System.out.println(emp.getLastName() + " " + emp.getFirstName() + " " + emp.getMiddleName());
        }
    }
}