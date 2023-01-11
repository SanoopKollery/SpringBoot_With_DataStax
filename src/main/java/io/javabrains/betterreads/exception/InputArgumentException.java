package io.javabrains.betterreads.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class InputArgumentException extends RuntimeException {

    String message;

    public InputArgumentException(String message) {
       // super(message);
        this.message = message;
    }
}
