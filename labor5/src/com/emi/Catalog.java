package com.emi;

import com.emi.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    private String name;
    private String path;
    private List<Document> documents = new ArrayList<>();
    public Catalog(String name_,String path_) {
        this.name=name_;
        this.path=path_;
    }

    public String getPath()
    {
        return path;
    }
    public String getName()
    {
        return name;
    }
    public void setPath(String path)
    {
        this.path = path;
    }
    public void setName(String name)
    {
        this.name = name;
    }



    public void setDocuments(List<Document> documents)
    {
        this.documents = documents;
    }
    public void add(Document doc)
    {
        documents.add(doc);
    }

    public List<Document> getDocuments()
    {
        return documents;
    }


    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", documents=" + documents +
                '}';
    }

    public Document findById(String id_) {
        for (Document doc : documents) {
            if (doc.id==id_){
                return doc;
            }
            }
        return null;
    }
}
