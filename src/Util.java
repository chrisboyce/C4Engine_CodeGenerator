
public class Util {

	public static String CreateTypeFromClassName(String name){

		name = name.replaceAll("[^A-Z]", "");
		
		String output = "";
		for(int i = 0; i < 4; i++){
			if(i > name.length()-1){
				output += " ";
			} else {
				output += name.charAt(i);
			}
		}
		
		return output;
		
	}
}
