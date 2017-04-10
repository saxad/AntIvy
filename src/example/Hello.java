
package example;

import org.apache.commons.lang.WordUtils;

public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));

				int monmax = 0;
				CSVREADER reader = new CSVReader(new FileReader("data.csv"));
				List<String[]> myEntries = reader.readAll();
				//parcourt
				for(int i = 0; i <myEntries.len(); i++)
				{
					System.out.pritln("nombre : " + myEntries.get(i));
					
					if(myEntries.get(i) > monmax)
					{
						monmax = myEntries.get(i);
					}

				}

				System.out.println("Le max est  :" +monmax); 
    }
}
        
