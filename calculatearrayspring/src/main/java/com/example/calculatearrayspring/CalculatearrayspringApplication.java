package com.example.calculatearrayspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class CalculatearrayspringApplication {

    public static void main(String[] args) {
       SpringApplication.run(CalculatearrayspringApplication.class, args);
//        ArrayList<Long> arrayList= new ArrayList<Long>();
//
//        BigInteger res =  BigInteger.valueOf(1);
//      for (int i = 0; i <210000000; i++) {
//            arrayList.add(Math.round(1 + Math.random()*(10-1)));
//            res=res.add(BigInteger.valueOf(arrayList.get(i)));
//       }
//        System.out.println(res);

/**
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Math.round(1 + Math.random() * (10 + 1 - 1));
            res=res+arr[i];
        }
        System.out.println(res);
 */
    }

}
