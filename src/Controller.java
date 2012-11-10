import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;


public class Controller {

	private String className;
	
	public Controller(String name){
		className = name;
	}
	public static void main(String[] args) {
		String controllerName = "CoupleArea";
		STGroup group = new STGroupDir("templates");
		ST st = group.getInstanceOf("controller");
		st.add("controllerName",controllerName);
		st.add("controllerType", Util.CreateTypeFromClassName(controllerName));
		String result = st.render();
		//st.inspect();
		System.out.println(result);
	}
}
