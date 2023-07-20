public class stringReplace {
    private String stateName;
    public stringReplace(){
        stateName = "mississippi";
    }
    public stringReplace(String stateName){
        this.stateName = stateName;
    }
    public String replaceI(){
        String newStateName = stateName.replace("i","ii");
        return newStateName;
    }
    public String replaceI(String stateName){
        String newStateName = stateName.replace("i","ii");
        return newStateName;
    }
    public String replaceSS(){
        String newStateName = stateName.replace("ss","s");
        return newStateName;
    }
    public String replaceSS(String stateName){
        String newStateName = stateName.replace("ss","s");
        return newStateName;
    }
}
