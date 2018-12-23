import java.util.Scanner;

/**
 * 
 */

/**
 * @author mustafayucadag
 *
 */
public class If_Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		    
	 		int NotSayi;
	 		
	 			System.out.println("Notu giriniz");
	 			NotSayi=input.nextInt();
	 			
	 			if(NotSayi>80)
	 			{
	 				System.out.println("A");
	 			}
	 			else if(NotSayi>60)
	 			{
	 				System.out.println("B");
	 			}
	 			else if (NotSayi>40)
	 			{
	 				System.out.println("C");
	 			}
	 			else if (NotSayi>20)
	 			{
	 				System.out.println("D");
	 			}
	 			else 
	 			{
	 				System.out.println("E");
	 			}
	 			
	 
	}

}
