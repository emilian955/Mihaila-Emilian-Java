package com.emi;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Document implements Serializable {
    private String id;
    private String name;
    private String location; //file name or Web page
     public Document(String id_,String name_, String location_) {
         this.id=id_;
         this.name=name_;
         this.location=location_;
     }
    private Map<String, Object> tags = new HashMap<>();
    //…
    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }
//…
}
}