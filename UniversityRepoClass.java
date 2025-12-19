class UniversityRepository {
    private List<Person> peopleDB = new ArrayList<>();
    private final String DB_FILE = "university_data.dat";

    public void enrollPerson(Person p) {
        peopleDB.add(p);
    }

    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DB_FILE))) {
            oos.writeObject(peopleDB);
            System.out.println(">> Database saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadData() {
        File file = new File(DB_FILE);
        if(!file.exists()) return;
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            peopleDB = (List<Person>) ois.readObject();
            System.out.println(">> Database loaded. Records found: " + peopleDB.size());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
    }

    public void printAllRecords() {
        System.out.println("--- UNIVERSITY RECORDS ---");
        for (Person p : peopleDB) {
            p.getDetails();
        }
    }
}
