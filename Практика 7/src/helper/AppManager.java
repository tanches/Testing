package helper;

import java.io.IOException;

import org.xml.sax.SAXException;

public class AppManager {
	
	private static ThreadLocal<AppManager> app = new ThreadLocal<AppManager>();

	private WebDriverHelper webDriverHelper;
    private SearchRailwayStationHelper searchRailwayStationHelper;
    private SearchResortBaseHelper searchResortBaseHelper;
	private SearchTrainHelper searchTrainHelper;
	
	public AppManager() throws SAXException, IOException
	{	
		webDriverHelper = new WebDriverHelper();		
		searchRailwayStationHelper = new SearchRailwayStationHelper(this);
    	searchResortBaseHelper = new SearchResortBaseHelper(this);
		setSearchTrainHelper(new SearchTrainHelper(this));
	}

    public static AppManager getInstance() throws SAXException, IOException
    {
        if (app.get() == null)
        {
            AppManager newInstanse = new AppManager();
            newInstanse.getSearchRailwayStationHelper().openHomePage();
            app.set(newInstanse);
        }
        return app.get();
    }
    
/*	public void stop()
	{
		webDriverHelper.stop();		
	}	*/
	
	public WebDriverHelper getWebDriverHelper() 
	{
		return webDriverHelper;
	}
	
    public SearchRailwayStationHelper getSearchRailwayStationHelper() 
	{
		return searchRailwayStationHelper;
	}

	public SearchResortBaseHelper getSearchResortBaseHelper() {
		return searchResortBaseHelper;
	}

	public void setSearchResortBaseHelper(SearchResortBaseHelper searchResortBaseHelper) {
		this.searchResortBaseHelper = searchResortBaseHelper;
	}

	public SearchTrainHelper getSearchTrainHelper() {
		return searchTrainHelper;
	}

	public void setSearchTrainHelper(SearchTrainHelper searchTrainHelper) {
		this.searchTrainHelper = searchTrainHelper;
	}

	
}
