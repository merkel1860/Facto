package core;

public abstract class Person extends Human{
    private String fname;
    private String lname;
    protected int socialSecurityNumber;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public abstract int getSocialSecurityNumber();

    public abstract void setSocialSecurityNumber(int socialSecurityNumber);
}
