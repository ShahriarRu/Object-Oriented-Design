public class Animal {

	private String name;

	public IFlys flyingType;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public String tryToFly() {
		return flyingType.fly();
	}

	public void setFlyingAbility(IFlys newFlyType) {
		flyingType = newFlyType;
	}
}
