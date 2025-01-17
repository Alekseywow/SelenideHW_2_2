package guru.qa;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Human dima = new Human(
                "Aleksey",
                34,
                true
        );

        List<String> lectures = new ArrayList<>();
        lectures.add("git");
        lectures.add("java");
        lectures.add("files");
        lectures.add("JUnit");

//        List<String> lectures = List.of("git", "java", "files", "JUnit");

        Set<String> lectireSet = Set.of(  // new HashSet
                "git", "java", "files" , "JUnit"
        );

        Map<String, Human> humans = new HashMap<>();
        humans.put("343421122", dima);
        humans.put("343421121", dima);
        humans.put("343421123", dima);
        humans.put("343421124", dima);
        humans.put("343421125", dima);

        for (Map.Entry<String, Human> entry : humans.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        for (String key : humans.keySet()){

        }

        for (Human value : humans.values()) {

        }

        int hours = 12;
        String hello = "Hello";

        dima.printSomeValues(
                hours,
                hello,
                lectures
        );
        System.out.println("Affter method, int: " + hours);
        System.out.println("Affter method, String: " + hello);
        System.out.println("Affter method, List: " + lectures);

        String[] lecturesArray = new String[] {"git","java","files","JUnit"};
        lecturesArray[0] = "git";
        lecturesArray[1] = "java";
        lecturesArray[2] = "files";
        lecturesArray[3] = "jUnit";

        int[] intArray0 = new int[] {1, 2, 3};
        int[] intArray1 = new int[] {1, 2, 3};

        int[][] bitArray0 = new int[][] {
                intArray0,
                intArray1
        };
        int[][] bitArray1 = new int[][] {
                intArray0,
                intArray1
        };
        int[][][] thereArray = new int[][][] {
                bitArray0,
                bitArray1
        };

//        for (int i = 0; i < lecturesArray.length ; i++) {
//            System.out.println(lecturesArray[i]);
//        };
//
//        for (int i = lecturesArray.length - 1; i >= 0; i--) {
//            System.out.println(lecturesArray[i]);
//        };

        for (String lectureName : lecturesArray) {
            if (!lectureName.startsWith("j")) {
                continue;
            }
            System.out.println(lectureName);
            return;
        };


//        int i = 0;
//        while (i < lecturesArray.length) {
//            System.out.println(lecturesArray[i]);
//            i++;
//        }
    }
}
