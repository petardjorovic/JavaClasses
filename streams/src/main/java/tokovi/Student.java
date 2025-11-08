package tokovi;

public class Student {
    private String forename, surname, index;

    public Student(){}

    public Student(String forename, String surname, String index){
        this.setForename(forename);
        this.setSurname(surname);
        this.setIndex(index);
    }

    public final void setForename(String forename){
        this.forename = forename;
    }

    public final String getForename(){
        return forename;
    }

    public final void setSurname(String surname){
        this.surname = surname;
    }

    public final String getSurname(){
        return surname;
    }

    public final void setIndex(String index){
        this.index = index;
    }

    public final String getIndex(){
        return index;
    }

    @Override
    public String toString() {
        return "Student [forename=" + forename + ", surname=" + surname + ", index=" + index + "]";
    }
}
