public abstract class Employee {
    private String name;
    private double baseSalary;
    private static int ID;
    private int employeeID;
    private Employee manager;
    public Employee(String name, double baseSalary){
        ID++;
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeID = ID;

    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double base){
        this.baseSalary = base;
    }

    public String getName(){
        return name;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public boolean equals(Employee other){
        return (this.employeeID == other.employeeID);
    }

    public boolean equals(Employee[] other) {
        boolean result = false;
        for (int i = 0; i <= other.length; i++) {
            if (this.employeeID == other[0].employeeID) {
                return true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public String toString(){
        return employeeID + " " + name;
    }

    public String employeeStatus(){
        return toString();
    }

    public Employee getManager(){
        return manager;
    }

}
