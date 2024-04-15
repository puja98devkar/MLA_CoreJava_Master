package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

@Component
public class Cashier {
    @Value("${checkout.log.fileName}")
    private String fileName;

    @Value("${checkout.log.path}")
    private String path;

    private BufferedWriter writer;

    @PostConstruct
    public void openFile() throws IOException {
        File targetDir = new File(path);
        if (!targetDir.exists()) {
            targetDir.mkdir();
        }
        File checkoutFile = new File(path, fileName + ".txt");
        if (!checkoutFile.exists()) {
            checkoutFile.createNewFile();
        }
        writer = new BufferedWriter(new FileWriter(checkoutFile, true));
    }

    public void checkout(ShoppingCart cart) throws IOException {
        writer.write(new Date() + "\t" + cart.getItems() + "\r\n");
        writer.flush();
    }

    @PreDestroy
    public void closeFile() throws IOException {
        writer.close();
    }
}
