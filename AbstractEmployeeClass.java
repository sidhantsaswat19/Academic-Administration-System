abstract class Employee extends Person {
    Date dateOfAppointment;
    private int salary;

    abstract void setSalary(int sal);
    int getSalary() { return salary; }
    void updateSalary(int sal) { this.salary = sal; }
}
