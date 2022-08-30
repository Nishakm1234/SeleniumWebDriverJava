
public class ChildEmirates extends ParentAirCraft{

	public static void main(String[] args) {
		ChildEmirates c=new ChildEmirates();
		c.bodyColor();c.engine();
		c.safetyGuidelines();
		
		//Cannot instantiate abstract classes
		//ParentAirCraft p=new ParentAirCraft();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
