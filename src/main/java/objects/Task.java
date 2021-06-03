package objects;

import lombok.Getter;

@Getter
public class Task extends AbstractTask {

    public Task(String summary, String description){
        super(summary, description);
    }
}
