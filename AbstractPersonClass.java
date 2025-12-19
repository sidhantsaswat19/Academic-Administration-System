// 1. ABSTRACT BASE (Implements Serializable for File I/O)
abstract class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Best practice for Serialization
    String name;
    Date dob;
    
    // Abstract method forces children to define their own display logic
    abstract void getDetails();
}
