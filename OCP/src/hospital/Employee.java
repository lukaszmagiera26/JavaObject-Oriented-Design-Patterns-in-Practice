//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package hospital;

public abstract class Employee {
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    abstract void performDuties();

    public String toString() {
        return "Employee [id=" + this.id + ", name=" + this.name + ", department=" + this.department + ", working=" + this.working + "]";
    }
}
