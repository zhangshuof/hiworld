package exception.exercise;

public class OverDraftException extends Exception {
    private double deficit;
    public OverDraftException(){}

    public OverDraftException(String msg,double deficit){
        super(msg);
        this.deficit = deficit;
    }

    public double getDeficit(){
        return deficit;
    }
}
