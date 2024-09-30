package com.github.anoopgarlapati.samples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            String output = mapper.writeValueAsString(new int[]{1, 2, 3});
            System.out.println("Output: " + output);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
    }
}
