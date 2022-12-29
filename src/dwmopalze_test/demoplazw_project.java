package dwmopalze_test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.dockerjava.core.InvocationBuilder;

public class demoplazw_project extends prameter_for_demoplaze {

	// @Test

	// public void check_title() {
	// String actual_titel = driver.getTitle();

	// mysoft.assertEquals(actual_titel, expected_title);

	// mysoft.assertAll();

	// }

	// @Test
	// public void check_if_photo_repet() {

	// List<WebElement> myimg = driver.findElements(By.className("img-fluid"));

	// boolean check_photo_image0 = myimg.get(0).getAttribute("src") ==
	// myimg.get(1).getAttribute("src");
	// boolean check_photo_image1 = myimg.get(0).getAttribute("src") ==
	// myimg.get(0).getAttribute("src");
	// boolean check_photo_image2 = myimg.get(0).getAttribute("src") ==
	// myimg.get(2).getAttribute("src");

	// mysoft.assertEquals(check_photo_image0, false,"check_photo_image0");
	// mysoft.assertEquals(check_photo_image1, false,"check_photo_image1");
	// mysoft.assertEquals(check_photo_image2, false,"check_photo_image2");

	// mysoft.assertAll();

//	}

	// @Test
	// public void check_card_image() {

	// List <WebElement>
	// image_of_card=driver.findElements(By.className("card-img-top"));

	// for(int i=0;i<image_of_card.size();i++) {
	// for(int j=1;j<image_of_card.size();j++) {

	// boolean
	// check_card_iamge=image_of_card.get(i).getAttribute("src")==image_of_card.get(j).getAttribute("src");

	// mysoft.assertEquals(check_card_iamge, false,"imgnumber"+i+"with
	// imgnumber"+j);
	// mysoft.assertAll();
	// }

	// }

	@Test()
	public void check_contact_info() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String emails[] = { "ans@hotmail.com", "mogmail.com", "abd@.com", "mo@yahoo.com" };
		Random r = new Random();
		int randomnumber = r.nextInt(3);

		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(emails[randomnumber]);
		Thread.sleep(3000);

		String v = driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).getAttribute("value");

		System.out.println("*********************");
		System.out.println(v);
		System.out.println("*********************");
		
		String regex= "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	
		Pattern pt =Pattern.compile(regex);
		Matcher mt=pt.matcher(emails[randomnumber]);
		boolean check_if_the_email_is_correct=mt.matches();
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println(v+"-->"+check_if_the_email_is_correct);
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		mysoft.assertEquals(check_if_the_email_is_correct, true);

		mysoft.assertAll();
		
		
	}
}
