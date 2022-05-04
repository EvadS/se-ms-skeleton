package com.se.sample.common.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.springframework.validation.ObjectError;

import java.io.IOException;

/**
 * Handles deserialization of the ObjectError class used in validation exceptions.  This is needed because
 * of the lack of a default constructor in a vendor based class
 */
public class ObjectErrorDeserializer extends StdDeserializer<ObjectError> {

    public ObjectErrorDeserializer() {
        super(ObjectError.class);
    }

    @Override
    public ObjectError deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);
        String objectName = node.get("object_name").asText();
        String defaultMessage = node.get("default_message").asText();
        return new ObjectError(objectName, defaultMessage);
    }
}
