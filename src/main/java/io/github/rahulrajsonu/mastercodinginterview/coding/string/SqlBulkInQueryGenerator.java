package io.github.rahulrajsonu.mastercodinginterview.coding.string;

import com.google.common.collect.Lists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class SqlBulkInQueryGenerator {

    private static final String QUERY = "select * from table where inactivetimestamp is null and ( %s );";
    private static final int loadFactor = 1000;
    public static void main(String[] args) {
        try {
            String file = "file.txt";
            Path path = Paths.get(file);
            String fileName = path.getFileName().toString();
            String outputFileName = path.getParent().toString()
                    .concat("/")
                    .concat(fileName.substring(0,fileName.lastIndexOf('.')).concat("_query.sql"));
            List<String> params = Files.readAllLines(path);
            String query = generate(params);
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            writer.write(query);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generate(List<String> params) {
        StringBuffer sb = new StringBuffer(QUERY);
        String inTemplate = " id IN ( %s ) ";
        StringBuffer qs = new StringBuffer();
        List<String> paramsPartition = paramPartition(params);
        for (int p = 0; p < paramsPartition.size(); p++) {
            String q;
            if(p < paramsPartition.size()-1) {
                qs.append(String.format(inTemplate, paramsPartition.get(p)).concat(" OR"));
            }else {
                qs.append(String.format(inTemplate, paramsPartition.get(p)));
            }
        }

        return String.format(String.valueOf(sb),qs);
    }

    private static List<String> paramPartition(List<String> params) {
        List<List<String>> parts = Lists.partition(params,loadFactor);
        List<String> format = new LinkedList<>();
        for (List<String> part : parts) {
            String join = String.join(",", part);
            format.add(join);
        }
        return format;
    }
}
