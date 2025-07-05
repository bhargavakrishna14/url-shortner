package dev.bhargav.urlShortener.exception;


public class EncodedUrlNotFoundException extends RuntimeException {

    /**
     * Constructs an EncodedUrlNotFoundException with the specified error message.
     *
     * @param message The error message to be associated with the exception.
     */

    public EncodedUrlNotFoundException(String message) {
        super(message);
    }
}
