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
    //…
    public void add(Document doc) {
        documents.add(doc);
    }
    public Document findById(String id) {
        return Document;
    }
}
