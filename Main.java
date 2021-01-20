import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
  String [] names = {"Marisol","Gaynelle","Josue","Cletus","Dong","Lucille","Margot","Mai","Vaughn","Sebastian","Petrina","Maxima","Fletcher","Kenda","Doug","Dot","Jeromy","Jerald","Alla","Georgene"};
   
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the number to separate students by");
  int number = input.nextInt();
  
  for (int i = 0; i < 20; i++) {
    if (i%number == 0) {
       System.out.println(names[i]);
    }
  }
    
  
  
        
  }
}
