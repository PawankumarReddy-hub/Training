package com.org.day13;

import java.util.ArrayList;
import java.util.List;

public class CheckedExceptionHandlingInJavaStreams {
    public static String throwingMethod(String source) throws Exception {
        throw new Exception(source);
    }

    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("sample");

        try {
           test
             .stream()
             .map(s -> {
                 try {
                    return throwingMethod(s);
                 } catch (Exception e) {
                    // Here we would have to:
                    // a) Return some value to filter out, log exception
                    // b) Wrap and rethrow an exception
                    throw new RuntimeException(e);
                }
             })
            .forEach(s -> {
                try {
                    throwingMethod(s);
                } catch (Exception e) {
                    // Here we would have to:
                    // a) Suppress and log exception
                    // b) Wrap and rethrow an exception
                   throw new RuntimeException(e);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



