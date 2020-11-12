package nix.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResourceUtil {
    public static Map<String, String> getResource(String resource) {
          String path = "D:\\Java projects\\NIX\\Homework6\\src\\main\\resources\\application.properties";

        try {
            Stream<String> lines = new BufferedReader(new FileReader(path)).lines();
            return lines.map(line -> line.split("=")).collect(Collectors.toMap(arr -> arr[0], arr -> arr[1]));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден: " + e.getMessage());
        }
    }
}
