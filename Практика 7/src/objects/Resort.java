package objects;

public class Resort {

	private String type;
	private String activityType;
	private String region;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public Resort(String type, String activityType, String region) {
		this.setType(type);
		this.setActivityType(activityType);
		this.setRegion(region);
	}
	
	public Resort() {
		
	}
	
}
