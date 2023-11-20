import LinearStructures.ArrayList;
import java.util.LinkedList;

public class start {
    public static void main(String[] arg){
        LinearStructures.ArrayList<String> strings = new LinearStructures.ArrayList<>();

        java.util.ArrayList<Integer> nums = new java.util.ArrayList<Integer>();

        strings.add("Cat");
        strings.add("Dog");
        strings.add("Mouse");

        nums.add(1);
        nums.add(3);
        nums.add(4);

        System.out.println(strings);
        System.out.println(nums);

        for(String s : strings){
            System.out.println(s);
        }
}   
}