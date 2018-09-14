public class TechnicalLead extends TechnicalEmployee {
    private int headCount;
    private int numberOfDirectReports;
    private SoftwareEngineer[] listOfDirectReports = new SoftwareEngineer[4];
    private BusinessLead manager;
    public TechnicalLead(String name){
        super(name);
        setBaseSalary(1.3*getBaseSalary());
        headCount = 4;
        numberOfDirectReports = 0;
    }

    public boolean hasHeadCount(){
        if (numberOfDirectReports < headCount){
            return true;
        }else{
            return false;
        }
    }

    public boolean addReport(SoftwareEngineer e){
        if(hasHeadCount()){
            listOfDirectReports[numberOfDirectReports] = e;
            numberOfDirectReports++;
            return true;
        }else {
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer e){
          return e.getCodeAccess() && e.equals(listOfDirectReports);
    }

    public boolean requestBonus(Employee e, double bonus){
        if( manager.approveBonus(e,bonus) ) {
            e.setBaseSalary(e.getBaseSalary() + bonus);
            return true;
        }else{
            return false;
            }
        }

    public String getTeamStatus() {
        String result;
        result = employeeStatus() + "\n";
        if(numberOfDirectReports > 0) {
            for (int i = 0; i < headCount; i++) {
                if (listOfDirectReports[i] != null) {
                    result = result + listOfDirectReports[i].employeeStatus() + "\n";
                }
            }
        }else{
            result = result + " and no direct reports yet";
        }
        return result;
    }

    public SoftwareEngineer[] getDirectReports(){
        return listOfDirectReports;
    }

}
