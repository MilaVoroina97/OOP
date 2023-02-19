package OOP_all.lections.lec6.Ex1;

public class DbManager extends DataManagerSPR{

    public void saveDb(PlannerSPR planner, String url,String username,String password){

        if(check(url));
        save(planner, new ConnectProvider(url, username, password).getPath());


    }

    private boolean check(String url) {
        return false;
    }
    
}
