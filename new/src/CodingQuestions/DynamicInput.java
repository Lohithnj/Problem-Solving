package CodingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while(sc.hasNext()) {
            list.add(sc.nextInt());break;
        }
        System.out.println(list);
    }
}
