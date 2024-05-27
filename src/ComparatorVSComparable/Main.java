package ComparatorVSComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//class Student implements Comparable<Student>{
//    int age;
//    String name;
//
//    public Student(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//
//    @Override
//    public int compareTo(Student that) {
//        if(this.age > that.age ){
//            return 1;
////            int temp = A[i];
////            A[i] = A[j];
////            A[j] = temp;
//        }
//        //-1 means no swapping
//        return -1;
//    }
//}


public class Main {
    public static void main(String[] args) {


        /**
         * This is functional interface
         * We have defined the comaparator method , and it is an anonymous class
         * We use functional interface when we want to use lambda function
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10){
                    return 1;
                }
                return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();

        nums.add(31);
        nums.add(14);
        nums.add(25);
        nums.add(49);
        nums.add(62);
        nums.add(57);

        Collections.sort(nums , comparator);

        System.out.println(nums);



//        List<Student> studs = new ArrayList<>();
//        studs.add(new Student(27 , "Sunny"));
//        studs.add(new Student(21 , "Ketan"));
//        studs.add(new Student(43 , "Jyoti"));
//        studs.add(new Student(49 , "Prakash"));
//        studs.add(new Student(04 , "Leo"));
//
//        Collections.sort(studs);
//        for(Student s: studs){
//            System.out.println(s);
//        }
    }
}
