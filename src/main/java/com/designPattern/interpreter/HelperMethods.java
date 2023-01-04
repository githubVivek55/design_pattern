package com.designPattern.interpreter;

import java.util.Arrays;
import java.util.List;

public class HelperMethods {
    public static String noRepeatedWord(String context){
        List<String> list = Arrays.asList(context.split(" "));
        int size = list.size()-1;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<size;i++){
            String word = list.get(i);
            if(!word.equals(list.get(i+1))){
                stringBuilder.append(word).append(" ");
            }
        }
        stringBuilder.append(list.get(size));
        context = stringBuilder.toString();
        return context;
    }

    public static String endsWithPeriod(String context){
        if(!context.endsWith(".")){
            context=context+".";
        }
        return context;
    }
}
