abstract class Employee extends Person{
    date dateOfAppointment;
    int salary;
    abstract void setSalary(int sal);
    abstract int getSalary();
}
