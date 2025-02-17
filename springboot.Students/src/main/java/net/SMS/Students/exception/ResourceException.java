package net.SMS.Students.exception;
import java.lang.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceException extends RuntimeException {

    public ResourceException(String message ){
        super(message) ;
    }
}
