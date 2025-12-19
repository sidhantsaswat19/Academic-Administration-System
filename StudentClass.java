class Student extends Person {
    String subject;
    Teacher teacher;

    Student(String name, Date dob, Teacher teacher, String subject) {
        this.name = name; this.dob = dob; this.teacher = teacher; this.subject = subject;
    }

    @Override
    void getDetails() {
        System.out.println("\n[STUDENT] " + name + " | Course: " + subject + " | Mentor: " + teacher.name);
    }
}
