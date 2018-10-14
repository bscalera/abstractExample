
public class House extends BuildingAbstract{

	int walls;
	int angle;
	int doors;
	int windows;
	
	/*
	House()
	{
		walls = 11;
		angle = 45;
		doors = 4;
		windows = 7;
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		House exampleHouse = new House();
		System.out.print(exampleHouse.buildingType());
		System.out.print(exampleHouse.wallsNumber(walls));
		System.out.print(exampleHouse.roofAngle(angle));
		System.out.print(exampleHouse.doorNumber(doors));
		System.out.println(exampleHouse.windowNumber(windows));
		*/
	}
	
	public String stringBuilder()
	{
		return this.buildingType()
				+ this.wallsNumber(walls)
				+ this.roofAngle(angle)
				+ this.doorNumber(doors)
				+ this.windowNumber(windows);
	}

	@Override
	protected String buildingType() {
		// TODO Auto-generated method stub
		return "A house ";
	}

	@Override
	String wallsNumber(int walls) {
		// TODO Auto-generated method stub
		return "with " + walls + " walls, ";
	}

	@Override
	String roofAngle(int angle) {
		// TODO Auto-generated method stub
		return "a " + angle + " degree angle roof, ";
	}
	
	@Override
	String doorNumber(int doors) {
		// TODO Auto-generated method stub
		return doors + " doors, ";
	}
	
	private String windowNumber(int windows) {
		// TODO Auto-generated method stub
		return "and " + windows + " windows.";
	}

}