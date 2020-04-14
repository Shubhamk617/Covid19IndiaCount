package Driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import configurations.OpenCloseBrowser;
import configurations.ReadConfig;

public class ProgramDriverCovid19 extends OpenCloseBrowser {
	ReadConfig rc = new ReadConfig();

	@Test
	public void covid19IndiaCount() throws Exception {
		// TODO Auto-generated method stub
		driver.navigate().to(rc.getApplicationUrl());
		wait.until(ExpectedConditions.titleIs("COVID-19 Tracker | India"));
		Thread.sleep(6000);
		System.out.println("Current Status Of Covid19 Cases in India: ");
		System.out.println(
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[1]/div/div[1]/h1")).getText());
		System.out.println("===========================================================");
		System.out.println("Last Updated At::");
		Reporter.log(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[1]/div/div[2]/h6[2]"))
				.getText(), true);
		Reporter.log(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[1]/div/div[2]/h6[3]"))
				.getText(), true);
		System.out.println("===========================================================");
		Thread.sleep(3000);
		System.out.println("Total Confirmed Cases:");
		System.out.println("Todays Increment :"
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[1]/h4")).getText());
		System.out.println("Total Conirmed :"
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[1]/h1")).getText());
		System.out.println("Total Active Cases :"
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[2]/h1")).getText());

		System.out.println("Total Recovered Cases:");
		System.out.println("Todays Increment :"
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[3]/h4")).getText());
		System.out.println("Total Recovered :"
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[3]/h1")).getText());

		System.out.println("Total Deceased Cases:");
		System.out.println("Todays Increment :"
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[4]/h4")).getText());
		System.out.println("Total Deceased :"
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[4]/h1")).getText());

		System.out.println("CONFIRMED \t\t ACTIVE \t\t RECOVERED \t\t DECEASED");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[1]/h4"))
				.getText() + "\t\t\t\t\t\t   "
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[3]/h4")).getText()
				+ "\t\t"
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[4]/h4")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[1]/h1"))
				.getText() + "\t\t\t "
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[2]/h1")).getText()
				+ "\t\t\t    "
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[3]/h1")).getText()
				+ "\t\t\t    "
				+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[4]/h1")).getText());

		List<WebElement> states = driver
				.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr"));

		int stateNum, distCount = 0;
		for (int i = 0; i <= states.size(); i++) {
			if (states.get(i).getAttribute("class").equalsIgnoreCase("state")) {
				stateNum = i + 1;
				System.out.println("===========================================================");
				System.out.println("State Name :" + driver.findElement(By
						.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr[" + stateNum + "]/td[1]/div"))
						.getText());
				System.out.println("Confirmed Cases :" + driver.findElement(By.xpath(
						"//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr[" + stateNum + "]/td[2]/span[2]"))
						.getText());
				System.out.println("Active Cases :" + driver
						.findElement(By.xpath(
								"//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr[" + stateNum + "]/td[3]"))
						.getText());
				System.out.println("Recovered Cases :" + driver.findElement(By.xpath(
						"//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr[" + stateNum + "]/td[4]/span[2]"))
						.getText());
				System.out.println("Deceased Cases :" + driver.findElement(By.xpath(
						"//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr[" + stateNum + "]/td[5]/span[2]"))
						.getText());
				driver.findElement(By
						.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr[" + stateNum + "]/td[1]/div"))
						.click();
				System.out.println("Total Number of Tests Performed Till Date :" + driver
						.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[2]/div[1]/div[2]/div[5]/div/h1"))
						.getText());
			} else if (states.get(i).getAttribute("class").equalsIgnoreCase("district")) {
				stateNum = i + 1;
				Thread.sleep(500);
				System.out.println("------------------------------------------------------------");
				System.out.println("District Name :" + driver
						.findElement(By.xpath(
								"//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr[" + stateNum + "]/td[1]"))
						.getText());
				System.out.println("Confirmed Cases :" + driver.findElement(By.xpath(
						"//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr[" + stateNum + "]/td[2]/span[2]"))
						.getText());
				System.out.println("------------------------------------------------------------");
			} else {
				continue;
			}
		}
		Thread.sleep(5000);
	}

}
