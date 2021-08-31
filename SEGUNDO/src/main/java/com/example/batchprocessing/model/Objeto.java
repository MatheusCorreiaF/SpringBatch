package com.example.batchprocessing.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Objeto {

    @JsonProperty("serial")
    private String serial;
    @JsonProperty("failCount")
    private String failCount;

    public Objeto() {
    }

    public Objeto(String serial, String failCount) {
        this.serial = serial;
        this.failCount = failCount;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getFailCount() {
        return failCount;
    }

    public void setFailCount(String failCount) {
        this.failCount = failCount;
    }
}
