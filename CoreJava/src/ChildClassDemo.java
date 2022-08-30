
public class ChildClassDemo extends ParentClassDemo {
	
	public void audioSystem() {
		System.out.println("New audio");
	}
	public void engine() {
		System.out.println("New engine");
	}
	
	public void color() {
		System.out.println(color);
	}
	
	public static void main(String[] args) {
		ChildClassDemo c=new ChildClassDemo();
		c.color();
		c.brakes();
		c.audioSystem();
	}

}
