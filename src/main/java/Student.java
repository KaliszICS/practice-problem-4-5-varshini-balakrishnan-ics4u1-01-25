class Student {
    private String name;
    private int age;
    private int studentNumber;

    public Student(String name, int age, int studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }
    public string getName() {
        return this.name;
    }
    public string getAge() {
        return this.age
    }
    public string getStudentNumber() {
        return this.studentNumber;
    }
    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }
    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        return student.getStudentNumber() == this.studentNumber;
    }
}