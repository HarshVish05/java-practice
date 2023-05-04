package ColectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Student{
    int rollNo;
    String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }
    

}


public class CollectionsDemo {
    public static void main(String[] args) {


        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student o1,Student o2){
                if (o1.rollNo>o2.rollNo){
                    return 1;
                }else{
                    return -1;
                }

            }
        }; 

        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Harsh"));
        list.add(new Student(2,"Subham"));
        list.add(new Student(3,"Krrish"));
        list.add(new Student(4,"John"));


        Collections.sort(list,comp);

        for (Student s: list){

            System.out.println(s);
        }






        /* 
        Map<String,Integer> dict = new HashMap<>();
        dict.put("s1", 11);
        dict.put("s2", 12);
        dict.put("s3", 13);
        dict.put("s4", 14);
        
        for(String student: dict.keySet()){
            System.out.printf("student %s roll no is %d \n",student,dict.get(student));
        }
        */



        // Set<Integer> set = new HashSet<>(); // unordered
        // Set<Integer> set = new TreeSet<>(); // oredered (in ascending)
        /* 
        set.add(1);
        set.add(20);
        set.add(34);
        set.add(3);
        set.add(4);
        System.out.println(set);
        */

        /* 
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(65);
        list.add(7);
        System.out.println(list.get(2));
        // System.out.println(Collections.sort(list));
        */


    }
    
}
