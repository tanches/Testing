package objects;


public class Route {
	
	  public static String CITY_FROM_ID = "name0";
	  public static String CITY_TO_ID = "name1";
	  // ¿«¿Õ‹ œ¿——
	  public static String CITY_FROM_SELECT = "//div[6]/div[2]";
	  //ÃŒ— ¬¿
	  public static String CITY_TO_SELECT = "//div[7]/div";

	private String cityFromId;
	private String cityToId;
	
	private String cityFromSelect;
	private String cityToSelect;
	
	public Route(String cityFromSelect, String cityToSelect) {
		this.setCityFromId();
		this.setCityToId();
		this.setCityFromSelect(cityFromSelect);
		this.setCityToSelect(cityToSelect);
	}

	public String getCityFromId() {
		return cityFromId;
	}

	public void setCityFromId() {
		this.cityFromId = CITY_FROM_ID;
	}

	public String getCityToId() {
		return cityToId;
	}

	public void setCityToId() {
		this.cityToId = CITY_TO_ID;
	}

	public String getCityFromSelect() {
		return cityFromSelect;
	}

	public void setCityFromSelect(String cityFrom) {
		this.cityFromSelect = cityFrom;
	}

	public String getCityToSelect() {
		return cityToSelect;
	}

	public void setCityToSelect(String cityTo) {
		this.cityToSelect = cityTo;
	}
	
}
