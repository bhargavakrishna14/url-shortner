package dev.bhargav.urlShortener.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ErrorResponse(
        Integer code,
        String message,
        LocalDateTime timestamp
) {
}
