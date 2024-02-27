import java.util.*;

import java.util.Scanner;


public class Quiz {
	

	    int count;
	    int counts;
		Scanner sc=new Scanner(System.in);
		public void logic () {
			Questions q1=new Questions("Q1) which statement is true??","A.java is fully object oriented","B.java is not fully object orinted","C.java is not a programming language","D.none of the above");
			Questions q2=new Questions("Q2) which of the statement is correct","A.java is platform independent language ","B.java is not platform independent","C.java is only runs in windows","D.none of the above");
		    Questions q3=new Questions("Q3) what type of inputs int keyword can accept","A.integer type","B.Float type","C.String type","D.Boolean type");
			Questions q4=new Questions("Q4) what type of keyword decimal value can accept","A.integer type","B.Float type","C.String type","D.Boolean type");
		
			Map<Questions,Character> m=new HashMap<>();
			m.put(q1,'B');
			m.put(q2,'A');
			m.put(q3,'A');
			m.put(q4,'B');
			
			for(Map.Entry<Questions,Character> map:m.entrySet()) {
				System.out.println(map.getKey().getQuestion());
				System.out.println(map.getKey().getOption1());
				System.out.println(map.getKey().getOption2());
				System.out.println(map.getKey().getOption3());
				System.out.println(map.getKey().getOption4());
				System.out.println("enter the answers");
				Character ans =sc.next().charAt(0);
				int cans =Character.compare(ans,map.getValue());
				if(cans==0) {
					System.out.println("correct");
					count++;
				}
				else {
					System.out.println("wrong");
					counts++;
				}
						
			}
			System.out.println(" ");
			System.out.println("TOTAL SCORE : "+count+'\n'+"CORRECT ANSWERS : "+count+'\n'+"WRONG ANSWERS : "+counts);
		}  
	


	public static void main(String[] args) {
		Quiz Q=new Quiz();
		Q.logic();

	}

}
