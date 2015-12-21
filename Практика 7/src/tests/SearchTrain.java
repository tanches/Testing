package tests;
import helper.TestBase;

import org.junit.Test;

public class SearchTrain extends TestBase {

	@Test
	public void searchTrain() throws Exception {
		app.getSearchTrainHelper().openHomePage();
		app.getSearchTrainHelper().selectCityFrom(" ¿«¿Õ‹");
		app.getSearchTrainHelper().selectCityTo("ÃŒ— ¬¿");
		app.getSearchTrainHelper().find();
		app.getSearchTrainHelper().selectTrain();
		app.getSearchTrainHelper().clickContinue();
		app.getSearchTrainHelper().selectWagon();
		app.getSearchTrainHelper().clickContinue();
	}
}
