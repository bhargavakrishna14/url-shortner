package dev.bhargav.urlShortener.exception;

public class UrlEncodingException extends RuntimeException {

    /**
     * Constructs a UrlEncodingException with the specified error message.
     *
     * @param message The error message to be associated with the exception.
     */

    public UrlEncodingException(String message) {
        super(message);
    }
}
