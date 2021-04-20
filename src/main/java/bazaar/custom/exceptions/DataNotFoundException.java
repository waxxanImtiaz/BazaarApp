package bazaar.custom.exceptions;

public class DataNotFoundException extends Exception{
    private final String DATA_NOT_FOUND = "Data Not Found";
    public DataNotFoundException(String message){
        super(message);
    }
    public DataNotFoundException(){
        super();
    }
    public String toString(){
        return DATA_NOT_FOUND;
    }



}
