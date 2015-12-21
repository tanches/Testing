package tests;
import helper.TestBase;
import org.junit.Test;

public class SearchRailwayStation extends TestBase{

  @Test
  public void searchRailwayStation() throws Exception {
    app.getSearchRailwayStationHelper().openHomePage();
    app.getSearchRailwayStationHelper().clickLink("Филиалы");
    app.getSearchRailwayStationHelper().selectType("все");
    app.getSearchRailwayStationHelper().selectCountry("Россия");
    app.getSearchRailwayStationHelper().selectRegion("Республика Татарстан (Татарстан)");
    app.getSearchRailwayStationHelper().find();
    app.getSearchRailwayStationHelper().clickLink("Вокзал города Казань");
  }

}
