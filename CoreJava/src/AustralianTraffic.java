
public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a=new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.flashYellow();
		
		AustralianTraffic at=new AustralianTraffic();
		at.walkOnSymbol();
		
		ContinentalTraffic ct=new AustralianTraffic();
		ct.trainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green go implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red stop implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flash yellow implementation");
	}
	public void walkOnSymbol() {
		System.out.println("Walking");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train symbol implementation");
	}
}
