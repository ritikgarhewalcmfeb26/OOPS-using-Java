 /*Write a Java program to declare variables of all primitive data types and print their
values.*/

class Question_1{
    public static void main (String [] args){
        
        //Integer types - byte short int long
        byte by = 123;
        short sh = 12345;
        int in = 123456789;
        long lg = 12345678910L;
        
        //Floating types - double float
        double de = 99.99;
        float ft = 12.3f;
        
        //Character type - char
        char ch = 'R';
        // Boolean type - boolean
        boolean bool = true;
        
        // Printing the values to the console
        System.out.println("--- Integer Types ---");
        System.out.println("byte value: " +by);
        System.out.println("short value: " +sh);
        System.out.println("int value: " +in);
        System.out.println("long value: " +lg);

        System.out.println("\n--- Floating-Point Types ---");
        System.out.println("float value: " +ft);
        System.out.println("double value: " +de);

        System.out.println("\n--- Other Types ---");
        System.out.println("char value: " +ch);
        System.out.println("boolean value: " +bool);
    }
}
        