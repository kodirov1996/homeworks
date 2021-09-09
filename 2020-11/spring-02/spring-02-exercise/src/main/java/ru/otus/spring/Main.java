package ru.otus.spring;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.otus.spring.domain.Person;
import ru.otus.spring.service.PersonService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args) throws IOException, CsvException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        PersonService service = context.getBean(PersonService.class);

        Person ivan = service.getByName("Ivan");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());

        HashMap map = new HashMap();
        int len = 0;
        String fileName = "c:\\users\\admin\\Desktop\\test.csv";

        String row="";
        BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split("\\?");
            System.out.println(Arrays.toString(data));
            // do something with the data
        }
        csvReader.close();


    }
}