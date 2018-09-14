public class Accountant extends BusinessEmployee {
    private double bonusBudget;
    private TechnicalLead techLeaderSupported;
    private Employee manager;
    public Accountant(String name){
        super(name);
        bonusBudget = 0;
    }

    public TechnicalLead getTeamsupported(){
        return techLeaderSupported;
    }

    public void supportTeam(TechnicalLead lead){
        this.techLeaderSupported = lead;
        for (int i = 0; i<= lead.getDirectReports().length; i++){
            if(lead.getDirectReports()[i] != null){
                this.bonusBudget =+ lead.getDirectReports()[i].getBaseSalary()*1.1;
            }
        }

    }

    public boolean approveBonus(double bonus){
        if(techLeaderSupported == null || bonus > bonusBudget){
            return false;
        }else{
            return true;
        }

    }

    public String employeeStatus(){
        String result;
        result = this.getEmployeeID() + " " +
                this.getName() + " with a budget of " + this.bonusBudget;
        if(techLeaderSupported != null){
            result = result  + " is supporting " +
             techLeaderSupported.getName();
        }
        return result;
    }
}
