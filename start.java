public class start {
    public static void main(String[] arg){
        try{
            IntVector test = new IntVector();

            System.out.println("Size: " + test.size());
    
            for(int i = 0; i < 20; i++){
                test.add(1);
            }
            System.out.println(test);
            test.add(7, 5);
            test.add(3, 5);
            System.out.println(test);
            test.remove(5);
            test.remove(5);
            System.out.println(test);
        }catch(IllegalArgumentException ex){
            System.out.println("That's Illegal");
        }catch(ArithmeticException ex){
            System.out.println("Bad Math");
        }catch(Exception ex){
            System.out.println("Generic Exception");
        }
}
}