package com.emi;

import com.sun.org.apache.xml.internal.resolver.Catalog;
import com.sun.xml.internal.txw2.Document;


public class Main {
    public static void main(String args[]) {
        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    private void testCreateSave() {
        com.emi.Catalog catalog= new Catalog;
        catalog.setName("Java Resources");
        catalog.setPath("D:/java");
        Document doc;
        doc = new Document("java1", "Java Course 1",
                "https://profs.info.uaic.ro/~acf/java/slides/en/intro_slide_en.pdf");
        doc.addTag("type", "Slides");
        catalog.add(doc);

        CatalogUtil.save(catalog);
    }

    private void testLoadView() {
        Catalog catalog = CatalogUtil.load("d:/java/catalog.ser");
        com.emi.Document doc = catalog.findById("java1");
        CatalogUtil.view(doc);
    }
}
