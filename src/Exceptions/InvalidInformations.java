package Exceptions;

public class InvalidInformations extends RuntimeException
{

    public InvalidInformations(String message) {
        super("Invalid Information error :  "+message);
    }
}
