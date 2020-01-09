package a.level.exceptions;

public class ALevelException extends Exception {

    private String aLevelMessage;

    ALevelException(String aLevelMessage) {
        this.aLevelMessage = aLevelMessage;
    }
}
