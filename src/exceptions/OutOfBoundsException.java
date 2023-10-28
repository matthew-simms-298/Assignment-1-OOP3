package exceptions;

public class OutOfBoundsException extends Exception{
    public OutOfBoundsException(String message){
        return message;
    }
    public OutOfBoundsException(){
        super("Out of Bounds Exception");
    }
}
