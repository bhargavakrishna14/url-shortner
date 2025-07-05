package dev.bhargav.urlShortener.mapper;

import dev.bhargav.urlShortener.dto.response.DecodedResponse;
import dev.bhargav.urlShortener.dto.response.EncodedResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-05T20:44:12+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.7 (Oracle Corporation)"
)
@Component
public class UrlMapperImpl implements UrlMapper {

    @Override
    public EncodedResponse toEncodedResponse(String encoded) {
        if ( encoded == null ) {
            return null;
        }

        String encoded1 = null;

        encoded1 = encoded;

        EncodedResponse encodedResponse = new EncodedResponse( encoded1 );

        return encodedResponse;
    }

    @Override
    public DecodedResponse toDecodedResponse(String url) {
        if ( url == null ) {
            return null;
        }

        String url1 = null;

        url1 = url;

        DecodedResponse decodedResponse = new DecodedResponse( url1 );

        return decodedResponse;
    }
}
