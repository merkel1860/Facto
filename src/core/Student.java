package core;

public class Student extends Person{
    private String studentID;

    public Student() {
    }

    public Student(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public int getSocialSecurityNumber() {
        return super.socialSecurityNumber;
    }

    @Override
    public void setSocialSecurityNumber(int socialSecurityNumber) {
        super.socialSecurityNumber = socialSecurityNumber;
    }
}
