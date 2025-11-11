class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Student{name=" + name + ", marks=" + marks + "}";
    }
}