public class SoftwareEngineer extends TechnicalEmployee {
    private boolean codeAccess;
    private TechnicalLead manager;
    public SoftwareEngineer(String name){
        super(name);
        codeAccess = false;
        successfulCheckIns = 0;
    }

    public boolean getCodeAccess(){
        return this.codeAccess;
    }

    public void setCodeAccess(boolean access){
        this.codeAccess = access;
    }

    public int getSuccessfulCheckIn(){
        return this.successfulCheckIns;
    }

    public boolean checkInCode(){
        if(manager.approveCheckIn(this)){
            this.successfulCheckIns++;
            return true;
        }else{
            setCodeAccess(false);
            return false;
        }
    }

    public String employeeStatus(){
        String result = super.employeeStatus();
        result += " has " + getSuccessfulCheckIn() + " successful check ins.";
        return result;
    }
}
