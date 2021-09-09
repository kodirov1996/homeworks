package com.example.pdfgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class PdfgeneratorApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(PdfgeneratorApplication.class, args);

        QuestionService questionService = new QuestionService();
        var response=questionService.responseData();
        System.out.println("User:"+response.getName());
        System.out.println("True answer:"+response.getTrueAnswered());
    }

}
