package Phone;

public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	@Override
    public String ring() {
        return "IPhone " + this.getVersionNumber() + " says " + this.getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        // your code here
    	String content = "IPhone " + this.getVersionNumber() + " from " + this.getCarrier();
    	System.out.println(content);
    }
}
