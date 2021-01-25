import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dataSet {

	public static void main(String[] args) throws Exception{
		
		// Reading in the data from csv file
		
		String strRecord = "";
		Scanner inputFile = new Scanner(new File("/Users/User/Downloads/dataset.csv"));
		inputFile.useDelimiter("[\\n,]");
		
		List<String> records = new ArrayList<String>();
		inputFile.nextLine();
		
		while (inputFile.hasNext()) {
			strRecord = inputFile.next();
			records.add(strRecord);
		}
		inputFile.close();
		
		System.out.println("Total elements in the record array list:" + records.size() + ".\n");
		
		 
		//Question1: Who are the pensioners(aged 56 and above)that are not getting paid pensions?
		
		System.out.println("1. Who are the pensioners(aged 56 and above)that are not getting paid pensions?\n");
		
		int offset = 0 ;
		String name ,age ,pensions ;
		for (int i = 1 ; i <= 24; i ++) {
			
			//Read and display 
			
			name = records.get(offset+1);
			age = records.get(offset+3);
			pensions = records.get(offset+6);
			offset = offset+7;
			
			double pensions1 = Double.parseDouble(pensions);
			int age1 = Integer.parseInt(age);
			
			if (age1 >= 56 && pensions1 == 0) {
				System.out.print(name + "are the pensioners(aged " + age1 + ") that are not getting paid pensions.\n" );
			} 
			else {}
			}				
		
		
		//Question2: Who are the pensioners(aged 56 and above)that are getting paid pensions?
		
		System.out.println("\n2. Who are the pensioners(aged 56 and above)that are getting paid pensions?\n");
		
		int a = 0 ;
		for (int i = 1 ; i <= 24; i ++) {
			
			//Read and display 
			
			name = records.get(a+1);
			age = records.get(a+3);
			pensions = records.get(a+6);
			a = a+7;
			
			double pensions1 = Double.parseDouble(pensions);
			int age1 = Integer.parseInt(age);
			
			if (age1 >= 56 && pensions1 != 0) {
				System.out.print(name + "are the pensioners(aged " + age1 + ") that are getting paid pensions.\n" );
			} else {}
			}
		
		//Question 3: How many people from Selangor have their main income exceeding RM4,500?
		
		System.out.println("\n3. How many people from Selangor have their main income exceeding RM4,500?");	
		
		int b = 0 ;
		String mainincome,state = null;
		for (int i = 1 ; i <= 24; i ++) {
			
			//Read and display
			
			name = records.get(b+1);
			state = records.get(b+2);
			mainincome = records.get(b+4);
			b = b+7;
			
			double mainincome1 = Double.parseDouble(mainincome);
			if (mainincome1 > 4500 && "Selangor".equals(state)) {
				System.out.print(name + "from Selangor have their main income exceeding RM4,500.\n");
			} else {}
		    }
		System.out.print("2 \n");	
		
		
		
		//Question 4: Who has the highest main income of them all and where is he/she from?
		System.out.println("\n4. Who has the highest main income of them all and where is he/she from?");	
		
			int c = 0;
			int max = 0;
			name = null;
			String maxname;
			String maxstate;
			maxname = null;
		    maxstate = null;
			
			for (int i = 1 ; i <=24 ; i ++) {
				
				//Read and display
				
				name = records.get(c+1);
				state = records.get(c+2);
				mainincome = records.get(c+4);
								
				double mainincome3 = Double.parseDouble(mainincome);
				int y = (int)mainincome3;
				if (y > max) {
					max =y;
				    int d = c;
					maxname = records.get(d+1);
					maxstate = records.get(d+2);
				}	
				c = c+7;
				}
				System.out.println(maxname + " from " + maxstate + " has the highest main income which is RM"+ max +".");
			
			//Question 5 :Who has the lowest main income of them all and where is he/she from?
			
			System.out.println("\n5. Who has the lowest overall income of them all and where is he/she from?");	
				
			int e = 0;
			int min = 99999999;
			String minname, minstate,sideincome ;
			int overall;
			minname = null;
		    minstate = null;
		    
		    for (int i = 1 ; i <= 24; i ++) {
				
				//Read and display
				
				name = records.get(e+1);
				state = records.get(e+2);
				mainincome = records.get(e+4);
				sideincome = records.get(e+5);
				pensions = records.get(e+6);
						
				double mainincome4 = Double.parseDouble(mainincome);
			    double sideincome4 = Double.parseDouble(sideincome);
				double pensions4 = Double.parseDouble(pensions);
				int x = (int)mainincome4;
				int y = (int)sideincome4;
				int z = (int)pensions4;
				
				overall = x+y+z;
				if (min > overall) {
					min = overall;
				    int f = e;
					minname = records.get(f+1);
					minstate = records.get(f+2);
				}	
				e = e+7;
				}
				System.out.println(minname + " from " + minstate + " has the lowest overall income which is RM"+ min +".");
	}		
			
}



