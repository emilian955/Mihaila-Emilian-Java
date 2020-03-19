package com.emi;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Document implements Serializable {
    public String id;
    private String name;
    private String location; //file name or Web page
     public Document(String id_,String name_, String location_) {
         this.id=id_;
         this.name=name_;
         this.location=location_;
     }
    private Map<String, Object> tags = new HashMap<>();
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }



    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    public void setId(String id)
    {
        this.id = id;
    }

    public void addTag(String key, Object obj)
    {
        tags.put(key, obj);
    }

    public void setName(String name)
    {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", tags=" + tags +
                '}';
    }


    public void setTags(Map<String, Object> tags)
    {
        this.tags = tags;
    }
    public Map<String, Object> getTags()
    {
        return tags;
    }
}
