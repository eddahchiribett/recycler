package com.eddah.recyclerviewproject;

public class ListItem {
    private String head;

    public ListItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    private  String desc;

}
