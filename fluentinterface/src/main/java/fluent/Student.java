package fluent;

public class Student {
    private String forename,lastname,index;

    public Student(){}

    public Student(String forename, String lastname, String index){
        this.forename = forename;
        this.lastname = lastname;
        this.index = index;
    }

    public String getForename() {
        return forename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getIndex() {
        return index;
    }

    public Student setForename(String forename) {
        this.forename = forename;
        return this;
    }

    public Student setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Student setIndex(String index) {
        this.index = index;
        return this;
    }

    @Override
    public String toString() {
        return "Student [forename=" + forename + ", lastname=" + lastname + ", index=" + index + "]";
    }

}
