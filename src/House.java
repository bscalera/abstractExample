
public class House extends BuildingAbstract{

	int walls;
	int angle;
	int doors;
	int windows;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		return "has " + walls + " walls, ";
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