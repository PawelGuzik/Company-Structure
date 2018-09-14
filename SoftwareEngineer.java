public class SoftwareEngineer extends TechnicalEmployee {
    private boolean codeAccess;
    private TechnicalLead manager;
    public SoftwareEngineer(String name){
        super(name);
        codeAccess = false;
        succesfulCheckIns = 0;
    }

    public boolean getCodeAccess(){
        return this.codeAccess;
    }

    public void setCodeAccess(boolean access){
        this.codeAccess = access;
    }

    public int getSuccessfulCheckIn(){
        return this.succesfulCheckIns;
    }

    public boolean checkInCode(){
        if(manager.approveCheckIn(this)){
            this.succesfulCheckIns++;
            return true;
        }else{
            this.codeAccess = false;
            return false;
        }
    }
}
