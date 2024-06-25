public class Student_13 {
    private String nim;
    private String name;
    private String birthDate;

    public Student_13() {
    }

    public Student_13(String nim, String name, String birthDate) {
        this.nim = nim;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return "Student{" +
                "nim='" + nim + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
