package GenericsPKG;

import java.util.HashSet;

class employee{
    int id;
    String name,dept;
    private double salary;
    HashSet <employee> set = new HashSet<>();

    public employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void displaydetails(){
        System.out.println("name:"+this.name);
        System.out.println("dept:"+this.dept);
        System.out.println("id:"+this.id);
        System.out.println(getSalary());
    }
    public <T> void toHash(T object){
        set.add((employee) object);
        System.out.println(set);
    }
    public String toString(){
        return "Employee name:"+this.name;
    }
}
public class employeeHash {
    public static void main(String[] args) {

        employee emp1 = new employee(101,"Rakesh","CSE",20000);
        employee emp2 = new employee(102,"Pritam","IT",10000);
        emp1.toHash(emp1);
        emp2.toHash(emp2);
        emp1.displaydetails();
        emp2.displaydetails();
    }
}
