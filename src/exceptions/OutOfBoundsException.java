package exceptions;

public class OutOfBoundsException extends Exception{
    public String OutOfBoundsException(String message){
        return message;
    }
    public OutOfBoundsException(){
        super("Out of Bounds Exception");
    }
}
