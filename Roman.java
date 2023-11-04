package shuffling;
import java.util.Scanner;

public class Roman {
	public static int roman(String c) {
		int sum=0;
		for(int i=0;i<c.length();++i) {
			switch(c.charAt(i)) {
			case 'I':{  sum+=1;
						break;}
			case 'V':{
				     if(i!=0 &&c.charAt(i-1)=='I') {
					 sum=sum+3;}
				     else {
				    	 sum+=5;
				     }
				     break;
				     }
		    
	       case 'X':{if(i!=0 && c.charAt(i-1)=='I') {
	    	   			sum=sum+8;
	       				}else {
	    	   			sum+=10; }
	       				break;				
	       				}
					
	       case 'L':{if(i!=0 && c.charAt(i-1)=='X') {
				    	   sum=sum+30;
				       }else {
				    	   sum+=50;
				       }
				       break;
	    	   			}
	       case 'C':{
				    	   if(i!=0&& c.charAt(i-1)=='X') {
				    		   sum+=80;
				    	   }else {sum+=100;
				       }
				    	   break;
						}
	       case 'D':{
	    	   			if(i!=0 && c.charAt(i-1)=='C') {
	    	   				sum+=300;
	    	   				
	    	   			}else {
	    	   				sum+=500;
	    	   			}break;
	       				}
	       case 'M':	{
	    	   				if(i!=0 && c.charAt(i-1)=='C') {
	    	   					sum+=800;
	    	   				}else {
	    	   					sum+=1000;
	    	   				} break;
	       				}
						}
		}
		return sum;
			}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		
		String c=sc.nextLine();
		System.out.println(roman(c));
		
		
	}

}
