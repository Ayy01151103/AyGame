package com.yxm.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yxm.exception.JsonFormatException;

import java.io.IOException;


public class JsonUtil {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static String toJson(Object obj) {
        try {
            return MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new JsonFormatException("JSON格式化错误：" + obj.getClass().getSimpleName(), e);
        }
    }

    public static <T> T toObject(String json, Class<T> c) {
        try {
            return MAPPER.readValue(json, c);
        } catch (IOException e) {
            throw new JsonFormatException("JSON格式化错误：" + c.getSimpleName(), e);
        }
    }
}
