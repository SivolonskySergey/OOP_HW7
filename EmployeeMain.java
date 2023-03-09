public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sergey", "Popov", "HR", (double) 10000);
        Employee emp2 = new Employee("Sergey", "Popov", "HR", (double) 20000);
        Employee emp3 = new Employee("Ksenya", "Kass", "IT", (double) 15000);

        System.out.println(
                "emp1: " + emp1 + "\nemp2: " + emp2 + "\nрезультат сравнения:" + emp1.equals(emp2) + "\n");
        System.out.println(
                "emp2: " + emp2 + "\nemp3: " + emp3 + "\nрезультат сравнения:" + emp2.equals(emp3) + "\n");

        System.out.println(emp1.hashCode() == emp2.hashCode());
        System.out.println(emp2.hashCode() == emp3.hashCode());
    }
}
