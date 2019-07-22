package tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {


    private static Map<String, Map<String, Integer>> eceStudentArrearList = new HashMap<>();
    private static Map<String, Map<String, Integer>> cseStudentArrearList = new HashMap<>();

    static {

        Map<String, Integer> eceStudent = new HashMap();
        eceStudent.put("EA", 2);
        eceStudent.put("EB", 0);
        eceStudent.put("EC", 1);
        eceStudent.put("ED", 0);

        Map<String, Integer> cseStudent = new HashMap();
        cseStudent.put("CA", 0);
        cseStudent.put("CB", 0);
        cseStudent.put("CC", 1);
        cseStudent.put("CD", 1);

        eceStudentArrearList.put("ECE", eceStudent);
        cseStudentArrearList.put("CSE", cseStudent);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deptName");
        String deptName = sc.nextLine();

        /*System.out.println("Student -");
        String studentName = sc.nextLine();
*/
        if (deptName.equalsIgnoreCase("ECE"))
            findNumberOfStudentsWithoutArrear(eceStudentArrearList);
        else if (deptName.equalsIgnoreCase("CSE"))
            findNumberOfStudentsWithoutArrear(cseStudentArrearList);
        else
            System.out.println("Please Enter Valid Department Value");
    }
/*
    private static void findNumberOfStudentsWithoutArrear(Map<String, Map<String, Integer>> studentArrearList, String deptValue) {

       *//* studentArrearList.values().stream().flatMap(innerMapValue ->
                innerMapValue.entrySet().stream().filter()
        });*//*

//        Iterator<Map.Entry<String, Map<String, Integer>>> parent = studentArrearList.entrySet().iterator();
        Iterator<Map.Entry<String, Map<String, Integer>>> parent = studentArrearList.entrySet().iterator();
        while (parent.hasNext()) {
            Map.Entry<String, Map<String, Integer>> parentPair = parent.next();

//            System.out.println("parentPair.getKey() :   " + parentPair.getKey() + " parentPair.getValue()  :  " + parentPair.getValue());

            Iterator<Map.Entry<String, Integer>> child = (parentPair.getValue()).entrySet().iterator();
            while (child.hasNext()) {
                Map.Entry childPair = child.next();
                if (childPair.getValue().equals(0))
                    System.out.println("Student -  " + childPair.getKey());

//                child.remove(); // avoids a ConcurrentModificationException
            }

        }*/

    private static void findNumberOfStudentsWithoutArrear(Map<String, Map<String, Integer>> studentArrearList) {

        Iterator<Map.Entry<String, Map<String, Integer>>> parent = studentArrearList.entrySet().iterator();
        while (parent.hasNext()) {
            Map.Entry<String, Map<String, Integer>> parentPair = parent.next();

            Iterator<Map.Entry<String, Integer>> child = (parentPair.getValue()).entrySet().iterator();
            while (child.hasNext()) {
                Map.Entry childPair = child.next();
                if (childPair.getValue().equals(0))
                    System.out.println("Student -  " + childPair.getKey());
            }
        }


    }
}
