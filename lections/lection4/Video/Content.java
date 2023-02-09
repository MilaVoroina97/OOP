package OOP_all.lections.lection4.Video;

public abstract class Content {

    private String name;
    protected Content(String name){
        this.name = name;
    }

    protected Content(){
        this.name ="-_-";
    }

    @Override
    public String toString(){
        return name;
    }




    
}
