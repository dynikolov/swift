



public class Task3a_PrintSquare {
    public static void main(String []args){
        
        int numX = 5;
        int numY = 5; 
        for ( int i = 0 ; i < numX ; i++){
        System.out.print("*");
        }
        //___________________________________
        System.out.println();  
        
        for (int u = 0 ; u < numX-2 ; u++){
        System.out.print("*");
        
            for (int i=0 ; i < numY-2 ; i++){
                System.out.print("1"); 
            }
            System.out.println("*");
        }
        
        //____________________________________
           for ( int i = 0 ; i < numX ; i++){
        System.out.print("*");
        }  
    }
    
}
