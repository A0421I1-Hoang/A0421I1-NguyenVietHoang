package b5_accessModifier.Student;

public class Student {
    private String name;
    private String classes;

    Student(String name,String classes){
        this.name=name;
        this.classes=classes;
    }

    public String getClasses() {
        return classes;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }
    void display(){
        System.out.println("Ten hoc sinh la "+this.name+" hoc lop "+this.classes);
    }
}
