package se.addq.java4test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleFileReader {

    public List<String> readNames() throws IOException {
        String filename = this.getClass().getClassLoader().getResource("minanamn.csv").getPath();

        List<String> namnLista = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = bufferedReader.readLine())!=null) {
            String[] names = line.toLowerCase().split(";");
            for (String value : names) {
                namnLista.add(value);
            }
        }
        return namnLista;
    }
}
