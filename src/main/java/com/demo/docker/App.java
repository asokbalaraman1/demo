package com.demo.docker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args ) throws Exception{

        //keepOccupyingmemory();
        readFileFromHostOS();
        for(;;){

        }
    }

    public static void keepOccupyingmemory() throws Exception {
        List<String> arrayList = new ArrayList<>();
        for (; ; ) {
            System.out.println("HI There");
            arrayList.add("I repeat one more time ");
            Thread.currentThread().sleep(10);
        }
    }

         public static void readFileFromHostOS() throws Exception {
            for(;;) {
                try (Stream<String> stream = Files.lines(Paths.get("/app/tmp/tobeRead.txt"))) {
                    stream.forEach(System.out::println);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Thread.currentThread().sleep(1000);
            }
        }

    }

