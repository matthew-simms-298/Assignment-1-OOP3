package exceptions;

public class InvalidFileSelection extends Exception{

    public String InvalidFileSelection(String message){
        return message;
    }

    public InvalidFileSelection(){
        super("Error: File Not Found / Does not Exist");
    }
}

