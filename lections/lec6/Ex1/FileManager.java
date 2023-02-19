package OOP_all.lections.lec6.Ex1;

public class FileManager extends DataManagerSPR{

    private boolean check(String filenameOfConnect){
        return true;
    }

    public void saveAllText(PlannerSPR planner,String path) {
        /// ошибки связанные с...
        if(check(path));///
    }

    public void save(PlannerSPR planner, String path){
        this.saveAllText(planner, path);
    }
    
}
