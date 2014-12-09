package com.springapp.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alobunets on 12/9/2014.
 */
public class Blog {
    private List<Record> records;


    public List<Record> getRecords() {
        return records;
    }

    public void setRecords() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record){
        records.add(record);
    }

}
