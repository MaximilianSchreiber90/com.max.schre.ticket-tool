package objects;

import lombok.Getter;

import java.io.File;

@Getter
public class Bug extends AbstractTask {

    String reproductionSteps;
    File logFile;

    public Bug(String summary, String description){
        super(summary, description);
    }
}
