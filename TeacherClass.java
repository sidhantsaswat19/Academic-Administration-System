class Teacher extends Employee {
    String subject, qualification;

    Teacher(String name, Date dob, Date doa, String subject, String qual) {
        this.name = name; this.dob = dob; this.dateOfAppointment = doa;
        this.subject = subject; this.qualification = qual;
    }

    @Override
    void setSalary(int sal) { super.updateSalary(sal); }

    @Override
    void getDetails() {
        System.out.println("\n[TEACHER] " + name + " | Subject: " + subject + " | Salary: $" + getSalary());
    }
}
