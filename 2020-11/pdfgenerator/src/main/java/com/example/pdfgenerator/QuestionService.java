package com.example.pdfgenerator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

@RequiredArgsConstructor
@Service
public class QuestionService {


    public HashMap readFromCsv() throws IOException {

        HashMap hashMap = new HashMap();
        BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\test.csv"));
        String row = "";

        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split("\\?");
            hashMap.put(data[0], data[1]);
        }
        csvReader.close();
        return hashMap;
    }

    public AnswerDto responseData() throws IOException {
        AnswerDto answerDto = new AnswerDto();
        HashMap hashMap = readFromCsv();
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        answerDto.setName(in.nextLine());


        for (int i = 0; i < hashMap.size(); i++) {
            Object strQuestion = hashMap.keySet().toArray()[i];
            System.out.println(strQuestion);
            String strAnswer = in.nextLine();
            Object strCorrect = hashMap.get(strQuestion);
            if (strAnswer.equals(strCorrect)) {
                count++;
            }
        }
        answerDto.setTrueAnswered(count);
        return answerDto;
    }

}
