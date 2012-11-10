import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;


public class Controller {

	private String className;
	private String controllerType;
	
	public Controller(String name){
		className = name;
		controllerType = Util.CreateTypeFromClassName(name);
	}
	
	public String getClassName(){
		return className;
	}
	public String getControllerType(){
		return controllerType;
	}
	public static void main(String[] args) {
		
		STGroup group = new STGroupDir("templates");
		ST st = group.getInstanceOf("controller");
		st.add("controller",new Controller("CoupleArea"));
		
		//st.add("controllerName",controllerName);
		//st.add("controllerType", Util.CreateTypeFromClassName(controllerName));
		String result = st.render();
		//st.inspect();
		System.out.println(result);
	}
}
