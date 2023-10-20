package exceptions;

public class InvalidFileSelection extends Exception{
    public InvalidFileSelection(){
        super("Error: File Not Found / Does not Exist");
    }
}
