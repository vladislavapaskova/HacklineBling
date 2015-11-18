package com.example.vladislavapaskova.hacklineblinghh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vladislavapaskova on 11/11/15.
 */
public class Reader {
    ArrayList<String> alist;
    public Reader(File file) throws IOException {
        alist = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = br.readLine()) != null) {
            alist.add(line.replaceAll("\t", "    "));
        }

    }
}
