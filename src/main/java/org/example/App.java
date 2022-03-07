package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws JsonProcessingException {
        Map<String, String> map = null;
        map = new HashMap();
        map.put("key", "value");
        map.put("hh", "ll");
        Map<String, String> what = new HashMap();
        map.put("a", map != null ? (map.get("key") == null ? "c" : map.get("key")) : "c");
//        Optional.ofNullable(map).map(map1 -> map1.get("key")).ifPresent(x -> what = x);
        System.out.println(map);

        Object list = null;
        System.out.println(list instanceof List);

        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.getTypeFactory().constructParametricType(Map.class, String.class, Object.class);
        mapper.readValue("aaa", javaType);
        try{
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println(11);
        }
    }
}