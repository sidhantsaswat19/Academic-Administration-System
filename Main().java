public class Main {
    public static void main(String[] args) {
        UniversityRepository cmrUniversity = new UniversityRepository();

        cmrUniversity.loadData();

        Date dobTeacher = new Date(10, 10, 1990);
        Date doa = new Date(1, 4, 2020);
        Teacher t1 = new Teacher("Prof. Madhavan", dobTeacher, doa, "Cloud Computing", "M.Tech");
        t1.setSalary(120000);

        Date dobStudent = new Date(1, 1, 2005);
        Student s1 = new Student("Alex", dobStudent, t1, "DevOps Engineering");

        cmrUniversity.enrollPerson(t1);
        cmrUniversity.enrollPerson(s1);

        cmrUniversity.printAllRecords();

        cmrUniversity.saveData();
    }
}
