abstract class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    Date dob;
    
    abstract void getDetails();
}
