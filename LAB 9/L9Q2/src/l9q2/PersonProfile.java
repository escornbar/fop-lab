package l9q2;

public class PersonProfile {
    protected String name, gender, birthdate;

    public PersonProfile(String name, String gender, String birthdate) {
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public void display(){
        System.out.println("Name: "+this.name+"\nGender: "+this.gender+"\nBirthdate: "+this.birthdate);
    }
}
