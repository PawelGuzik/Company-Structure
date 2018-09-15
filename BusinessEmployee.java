public abstract class BusinessEmployee extends Employee {
    double bonusBudget;
    TechnicalLead teamSupported;
    public BusinessEmployee(String name){
        super(name, 50000);
    }

    public double getBonusBudget(){
        double result = bonusBudget*100;
        result = Math.round(result);
        result /= 100;
       return result;
    }

    public String employeeStatus(){
        String result = super.employeeStatus();
        result = result + " with a budget of " + this.getBonusBudget();
        return result;
    }
}
