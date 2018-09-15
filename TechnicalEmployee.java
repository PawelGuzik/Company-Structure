public abstract class TechnicalEmployee extends Employee {
    int successfulCheckIns;
    public TechnicalEmployee(String name){
        super(name,75000);
    }

    public String employeeStatus(){
        String result;
        result = super.employeeStatus();
        return result;
    }
}
