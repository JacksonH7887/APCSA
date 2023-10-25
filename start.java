public class start {
    public static void main(String[] arg){
        try{
            IntVector test = new IntVector();

            System.out.println("Size: " + test.size());
    
            for(int i = 0; i < test.size(); i++){
                test.add(i * 2);
            }
        }catch(IllegalArgumentException ex){
            System.out.println("That's Illegal");
        }catch(ArithmeticException ex){
            System.out.println("Bad Math");
        }catch(Exception ex){
            System.out.println("Generic Exception");
        }
}
}