/* NumberFormatException */
class NFE 
{
    public static void main(String[] args) {
        
        String str="abhi";
        
        try
        {
            int a=Integer.parseInt(str);
            System.out.println(a);
        }    
        catch(ArithmeticException n)  /* ERROR WILL COME */
        {
            System.out.println("String "+str+" can't be Converted to Integer");
        }   
        System.out.println("Main method ended"); 
    }
}
