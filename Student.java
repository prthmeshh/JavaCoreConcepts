import java.util.Objects;

public class Student implements Comparable<Student> {

    public Student(int studId, String studName, int studAge, char studGrade) {
        this.studId = studId;
        this.studName = studName;
        this.studAge = studAge;
        this.studGrade = studGrade;
    }

    private int studId;
    private String studName;
    private int studAge;
    private char studGrade;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStudAge() {
        return studAge;
    }

    public void setStudAge(int studAge) {
        this.studAge = studAge;
    }

    public char getStudGrade() {
        return studGrade;
    }

    public void setStudGrade(char studGrade) {
        this.studGrade = studGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studId == student.studId && studAge == student.studAge && studGrade == student.studGrade && Objects.equals(studName, student.studName);
    }

    @Override
    public int hashCode() {
        return this.studId;
    }

    @Override
    public int compareTo(Student o) {
        return this.getStudName().compareTo(o.studName);
    }
}
