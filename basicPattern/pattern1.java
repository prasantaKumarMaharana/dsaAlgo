package dsaAlgo.basicPattern;

public class pattern1 {
  
        public void pattern1(int n) {
            
          
            for (int i = 0; i < n; i++) {
                
               
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
              
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int N = 4;
    
            
            pattern1 sol = new pattern1();
    
            sol.pattern1(N);
        }
    }
    
    

