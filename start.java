import LinearStructures.ArrayList;

public class start {
    public static void main(String[] arg){
        LinearStructures.ArrayList<Integer> mine = new LinearStructures.ArrayList<Integer>();

        java.util.ArrayList<String> theirs = new java.util.ArrayList<String>();

        System.out.println(mine);
        mine.add(0, 1);
        System.out.println(mine);
        mine.add(50);
        System.out.println(mine);
        System.out.println(theirs);
        theirs.add(0, "hi");
        System.out.println(theirs);
        theirs.add("hello");
        System.out.println(theirs);
}   
}