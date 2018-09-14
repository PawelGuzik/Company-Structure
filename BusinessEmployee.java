public abstract class BusinessEmployee extends Employee {
    double bonusBudget;
    TechnicalLead teamSupported;
    public BusinessEmployee(String name){
        super(name, 50000);
    }

    public double getBonusBudget(){
        return bonusBudget;
    }

    public String employeeStatus(){
        String result = super.employeeStatus();
        result = result + " with a budget of " + bonusBudget;
        return result;
    }
}
