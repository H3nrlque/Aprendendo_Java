package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }


    public double IncreaseSalary(double salary, double percentage) {
        return this.salary += salary * (percentage / 100);

    }

    @Override
    public String toString() {
        return id
               +", "
               +name
               +", "
               +String.format("%.2f",salary);
    }
}
