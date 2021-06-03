package objects;


public abstract class AbstractTask {

    String summary;
    String description;

    public AbstractTask(String summary, String description){
        this.summary = summary;
        this.description = description;
    }
}