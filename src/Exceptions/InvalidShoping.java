package Exceptions;

public class InvalidShoping extends RuntimeException
{
    public InvalidShoping(String message) {
        super("Invalid Shopping Error:  "+message);
    }
}
