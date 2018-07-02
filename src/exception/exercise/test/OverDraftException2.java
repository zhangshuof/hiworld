package exception.exercise.test;

import exception.exercise.OverDraftException;

public class OverDraftException2 extends Exception {
    private double deficit;


    public OverDraftException2(String msg,double deficit){
        super(msg);
        this.deficit = deficit;
    }

    public double getDeficit(){
        return deficit;
    }
}
