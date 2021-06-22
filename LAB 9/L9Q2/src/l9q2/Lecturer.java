package l9q2;

public class Lecturer extends PersonProfile{
    
    private String[] courseName;
    private String[] courseCode;
    private String[] semester;
    private double[] session;
    private int[] numofStudents;
    private String fileName;

    public Lecturer(String fileName, String name, String gender, String birthdate) {
        super(name, gender, birthdate);
        this.fileName = fileName;
    }
    
    
}
