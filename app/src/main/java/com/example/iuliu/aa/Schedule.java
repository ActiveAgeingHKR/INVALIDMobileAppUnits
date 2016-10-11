package com.example.iuliu.aa;

/**
 * Created by Iuliu on 2016-09-24.
 */
import java.util.ArrayList;
import java.util.List;

public class Schedule {

    public String string;
    public final List<String> children = new ArrayList<String>();

    public Schedule(String string) {
        this.string = string;
    }

}
