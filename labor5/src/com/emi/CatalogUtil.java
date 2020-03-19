package com.emi;

import com.emi.Catalog;
import com.emi.Document;
import com.sun.org.apache.bcel.internal.generic.NEW;
import jdk.nashorn.internal.ir.CallNode;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CatalogUtil {
    public static void save(Catalog catalog)
            throws IOException {
        try (var oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }

    public static Catalog load(String path)
            throws InvalidCatalogException {
        try (var oos ObjectOutputStream(new FileOutputStream(path)))
        {
            return oos;
        }
    }

    public static void view(Document doc) {
        Desktop desktop = Desktop.getDesktop();
        File file = new File(doc.getLocation());
        if (Desktop.isDesktopSupported()) desktop = Desktop.getDesktop();

        try {
            desktop.open(file);
        } catch (IllegalArgumentException | IOException e) {
            System.out.print("Path invalid");
        }
    }

    private static class InvalidCatalogException extends Exception {
    }
}