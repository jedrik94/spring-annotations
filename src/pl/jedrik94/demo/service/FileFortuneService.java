package pl.jedrik94.demo.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FileFortuneService implements FortuneService {

    private final Random randomNumberGenerator;
    private final List<String> fortunes;

    private String filePath;


    public FileFortuneService() {
        fortunes = new ArrayList<>();
        randomNumberGenerator = new Random();
    }

    @Override
    public String getFortune() {
        int randomIndex = randomNumberGenerator.nextInt(fortunes.size());
        return fortunes.get(randomIndex);
    }

    @PostConstruct
    private void manageOrderOfInitialMethods() {
        resolvePathToTxtFile();
        loadFortunesFromFile();
    }

    private void resolvePathToTxtFile() {
        ClassPathResource resource = new ClassPathResource("fortunes.txt");

        try {
            filePath = resource.getFile().getPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFortunesFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.lines().forEach(fortunes::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
