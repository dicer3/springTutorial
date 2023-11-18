package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {

    private List<String> freinds;
    private Map<String, Integer> feestructure;

    public List<String> getFreinds() {
        return freinds;
    }

    public void setFreinds(List<String> freinds) {
        this.freinds = freinds;
    }

    public Map<String, Integer> getFeestructure() {
        return feestructure;
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

    @Override
    public String toString() {
        return "Person [freinds=" + freinds + ", feestructure=" + feestructure + "]";
    }

    
}
