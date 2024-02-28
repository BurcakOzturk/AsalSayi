import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		        
        System.out.print("Bir Sayi girin : ");
		        int Sayi = scanner.nextInt();
		        
		        
		    if(isAsal(Sayi,Sayi/2)) {   
		    	
		    	System.out.println("bir asal sayıdır:"+Sayi);
		    	
		    }
		    	
		    else {
		    
		    	System.out.println("bir asal değildir:"+Sayi);
		    	
}  	
		    	
	}	    	
		    public static boolean isAsal(int sayi,int i) {
		    	
		    	if(i==1)  {
		    		return true;
		    		
		    	}
		    	else {
		    		
		    		if(sayi%i==0)  {
		    			
		    			return false;
		    			
		    		}
		    		else {
		    			return isAsal(sayi,i-1);
		    			
		    		}
		    	}
		    	
		    	
		    }
		    
	
		       
	}


