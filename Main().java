public class Main {
    public static void main(String[] args){
        date dobOfStudent = new date(1,1,2005);
        date dobOfTeacher = new date(10,10,1995);
        date dobOfAppointment = new date(1,4,2024);
        Teacher teacher = new Teacher("Madhavan",dobOfTeacher,dobOfAppointment,"MTech","Electronics");
        Student student = new Student("Belinda",dobOfStudent,teacher,"Electronics");
        teacher.setSalary(50000);
        teacher.getDetails();
        student.getDetails();
    }
}
