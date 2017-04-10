
package example;

import org.apache.commons.lang.WordUtils;

public class Hello {
    public static void main(String[] args) {
					int monmax = 0;
					CSVREADER reader = new CSVReader(new FileReader("../../data.csv"));
					List<String[]> myEntries = reader.readAll();
					for (int = 1 = 0; i < myEntries.size(); i++){
						String[] strings = myEntries.get(i);
						for (int j = 0; j < strings.length; j++){
							if( strings[j] > monmax ){
								monmax = strings[j];
							}
							System.out.println(strings[j]);
						}
						System.out.println("le maximum est : " + monmax)
					}
//        String  message = "hello ivy !";
//        System.out.println("standard message : " + message);
//        System.out.println("capitalized by " + WordUtils.class.getName() 
//                                + " : " + WordUtils.capitalizeFully(message));
    }
}
        
