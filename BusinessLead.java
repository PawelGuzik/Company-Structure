public class BusinessLead extends BusinessEmployee {
    private int headCount;
    private int directReports;
    private double bonusBudget;
    private Employee[] listOfdirectReports = new Employee[10];
    public BusinessLead(String name){
        super(name);
        this.headCount = 10;
        setBaseSalary(2*getBaseSalary());
        this.directReports = 0;
    }

    public boolean hasHeadCount(){
        return this.directReports < this.headCount;
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam){
        if(hasHeadCount()) {
            listOfdirectReports[directReports] = e;
            directReports++;
            this.bonusBudget =+ e.getBaseSalary()*1.1;
            if(hasHeadCount()) {
                listOfdirectReports[directReports] = supportTeam;
                directReports++;
                this.bonusBudget =+ supportTeam.getBaseSalary() * 1.1;
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus){
        if(bonus <= this.bonusBudget) {
            e.setBaseSalary(e.getBaseSalary() + bonus);
            bonusBudget -= bonus;
            return true;
        }else{
            return false;
        }
    }

    public boolean approveBonus(Employee e, double bonus){
        boolean result = false;
        for(int i = 0; i < headCount; i++) {
            Accountant myAccountant = (Accountant) listOfdirectReports[i];
            if( e.getManager().equals(myAccountant.getTeamsupported()) ){
                if( myAccountant.approveBonus(bonus) ){
                    return true;
                }else{
                    result = false;
                    return result;
                }
            }else {
                result = false;
                return result;
            }
        }
        return result;
    }

    public String employeeStatus(){
        return getEmployeeID() + " " +
                getName() + " with a budget of " +
                getBonusBudget();
    }

    public double getBonusBudget(){
        return bonusBudget;
    }
    public Employee getManager(){
        return null;
    }
    public String getTeamStatus() {
        String result;
        result = employeeStatus() + "\n";
        for(int i = 0; i < headCount; i++){
            if (listOfdirectReports[i] != null) {
                result = result + listOfdirectReports[i].employeeStatus() + "\n";
            }
        }
        return result;//END
    }
}
