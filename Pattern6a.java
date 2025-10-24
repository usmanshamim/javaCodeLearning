
public class Pattern6a {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    } }
/* 
    1                 
    12            	
    123              
    1234            
   b.*                  
	**                 
	***                
	****               
     c. 1
      	01
     	101
    	0101
        */