package tests;
import helper.TestBase;
import org.junit.Test;

public class SearchRailwayStation extends TestBase{

  @Test
  public void searchRailwayStation() throws Exception {
    app.getSearchRailwayStationHelper().openHomePage();
    app.getSearchRailwayStationHelper().clickLink("�������");
    app.getSearchRailwayStationHelper().selectType("���");
    app.getSearchRailwayStationHelper().selectCountry("������");
    app.getSearchRailwayStationHelper().selectRegion("���������� ��������� (���������)");
    app.getSearchRailwayStationHelper().find();
    app.getSearchRailwayStationHelper().clickLink("������ ������ ������");
  }

}
