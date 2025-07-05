package dev.bhargav.urlShortener.mapper;

import dev.bhargav.urlShortener.dto.response.DecodedResponse;
import dev.bhargav.urlShortener.dto.response.EncodedResponse;
import org.mapstruct.Mapper;

/**
 * Mapper interface for converting between URL DTOs and responses.
 */
@Mapper(componentModel = "spring")
public interface UrlMapper {

    /**
     * Converts an encoded URL to an EncodedResponse DTO.
     *
     * @param encoded The encoded URL.
     * @return The EncodedResponse DTO.
     */
    EncodedResponse toEncodedResponse(String encoded);

    /**
     * Converts a URL to a DecodedResponse DTO.
     *
     * @param url The original URL.
     * @return The DecodedResponse DTO.
     */
    DecodedResponse toDecodedResponse(String url);
}