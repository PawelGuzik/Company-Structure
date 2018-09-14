public abstract class TechnicalEmployee extends Employee {
    int succesfulCheckIns;
    public TechnicalEmployee(String name){
        super(name,75000);
    }

    public String employeeStatus(){
        String result;
        result = super.employeeStatus();
        result = result + " has " + succesfulCheckIns + " successful check ins";
        return result;
    }
}
