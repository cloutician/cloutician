package com.cloutician.helloworld;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws IOException {

        Scanner sd = null;
        File data = new File("input.txt");
        sd = new Scanner(data);

        ArrayList<Integer> input = new ArrayList<Integer>();

        while (sd.hasNextInt()) {
            input.add(sd.nextInt());
        }
            int increased = 0;
            for (int i = 0; i < input.size()-3; i++) {

                int num1 = input.get(i);
                int num2 = input.get(i+1);
                int num3 = input.get(i+2);
                int numm1 = num1 +num2 + num3;
                int numdf = num2 + num3 + input.get(i+3);
                if(numdf > numm1) {
                    increased++;
                }else {
                    continue;
                }
            }
       System.out.println(increased);
        }
    }
