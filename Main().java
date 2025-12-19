public class Main {
    public static void main(String[] args) {
        UniversityRepository cmrUniversity = new UniversityRepository();

        // 1. Load existing data (Persistence)
        cmrUniversity.loadData();

        // 2. Create Data
        Date dobTeacher = new Date(10, 10, 1990);
        Date doa = new Date(1, 4, 2020);
        Teacher t1 = new Teacher("Prof. Madhavan", dobTeacher, doa, "Cloud Computing", "M.Tech");
        t1.setSalary(120000);

        Date dobStudent = new Date(1, 1, 2005);
        Student s1 = new Student("Alex", dobStudent, t1, "DevOps Engineering");

        // 3. Add to Repository (if list is empty to avoid duplicates for demo)
        // In real app, you'd check IDs
        cmrUniversity.enrollPerson(t1);
        cmrUniversity.enrollPerson(s1);

        // 4. Operations
        cmrUniversity.printAllRecords();

        // 5. Save State (Persistence)
        cmrUniversity.saveData();
    }
}
