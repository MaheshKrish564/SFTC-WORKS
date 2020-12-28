package SFAutomationWorks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;




public class sfAuroworks {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\New folder\\chrome\\chromefolder\\chromedriver.exe");
		
		
		WebDriver d =new ChromeDriver();
		
		d.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		
		
		//Clicking on submit btn before entering data
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		// to get text of required fields label name in console
		
		String FN=d.findElement(By.xpath("//div/form/div[1]/div[1]/div/label")).getText();
		System.out.println(FN);

		
		String LN=d.findElement(By.xpath("//div/form/div[1]/div[2]/div/label")).getText();
		System.out.println(LN);
		
		String Mail=d.findElement(By.xpath("//div/form/div[2]/div[1]/div/label")).getText();
		System.out.println(Mail);
		
		
		String Curr_company=d.findElement(By.xpath("//div/form/div[2]/div[2]/div/label")).getText();
		System.out.println(Curr_company);
		
		String Mobile=d.findElement(By.xpath("//div/form/div[3]/div[1]/div/label")).getText();
		System.out.println(Mobile);
		
		String DOB=d.findElement(By.xpath("//div/form/div[3]/div[2]/div/label")).getText();
		System.out.println(DOB);
		
		String Pos_applying_for=d.findElement(By.xpath("//div/form/div[4]/div[1]/div/label")).getText();
		System.out.println(Pos_applying_for);
		
		String Portfolio_website=d.findElement(By.xpath("//div/form/div[4]/div[2]/div/label")).getText();
		System.out.println(Portfolio_website);
		
		String Salary_req=d.findElement(By.xpath("//div/form/div[5]/div[1]/div/label")).getText();
		System.out.println(Salary_req);
		
		String WhenStart=d.findElement(By.xpath("//div/form/div[5]/div[2]/div/label")).getText();
		System.out.println(WhenStart);
		
		String Address=d.findElement(By.xpath("//div/form/div[6]/div[1]/div/label")).getText();
		System.out.println(Address);
		
		String Upload_resume=d.findElement(By.xpath("//div/form/div[7]/div[1]/div/label")).getText();
		System.out.println(Upload_resume);
		
		String Relocate=d.findElement(By.xpath("//div/form/div[7]/div[2]/div/label")).getText();
		System.out.println(Relocate);
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		System.out.println("------------------");
		//TC:2 Hard Assert 
		
		/*WebElement FNM=d.findElement(By.xpath("//*[@id='fnameInput']/input"));
		System.out.println("First name field is enabled? " + FNM.isEnabled());
		
		Assert.assertEquals(true, FNM .isEnabled());
		//System.out.println(" First name Input field is enabled-assert passed" );
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
	WebElement LNM=d.findElement(By.xpath("//*[@id='lnameInput']/input"));
		Assert.assertEquals(true, LNM .isEnabled());
	System.out.println(" Last name Input field is enabled?" + LNM.isEnabled());
	
		
	WebElement Mail_id =d.findElement(By.xpath("//div/div[2]/div[1]/following::div/div/div[1]/child::div/input"));
		Assert.assertEquals(true, Mail_id .isEnabled());
		System.out.println(" Mail Input field is enabled?"+ Mail_id.isEnabled());
		
		WebElement Currcompany =d.findElement(By.xpath("//div/div[2]/div[1]/following::div/div[2]/div[1]/div/input"));
		Assert.assertEquals(true, Currcompany .isEnabled());
		System.out.println(" Current company Input field is enabled-assert passed");
		
		

		WebElement Mobileno =d.findElement(By.xpath("//div[2]/div[1]/following::div/div[2]/following::div/div[1]/div/div/input"));
		Assert.assertEquals(true, Mobileno .isEnabled());
		System.out.println("Mobile no Input field is enabled-assert passed");
		
		
		WebElement DOB1 =d.findElement(By.xpath("//div[2]/div[1]/following::div/div[2]/following::div/div[1]/div/div/input"));
		Assert.assertEquals(true, DOB1 .isEnabled());
		System.out.println("Mobile no Input field is enabled-assert passed");

        WebElement Position_applying=d.findElement(By.xpath("//div[@class='form-group']/div/input")	);
        Assert.assertEquals(true, Position_applying.isEnabled());
        System.out.println("Dob Input field is enabled - assert passed");
        
        WebElement Portfoliowebsite=d.findElement(By.xpath("//div[ @id ='portfolioInput']/input"));
        Assert.assertEquals(true, Portfoliowebsite.isEnabled());
		System.out.println("Portfoliowebsite is enabled - assert passed");
		
		WebElement Salinput=d.findElement(By.xpath("//div[ @id ='salaryInput']/input"));
		Assert.assertEquals(true, Salinput.isEnabled());
		System.out.println("Salary input is enabled - assert passed");
		
		WebElement Tostart=d.findElement(By.xpath("//div[ @id ='whenStartInput']/input"));
		Assert.assertEquals(true,Tostart.isEnabled());
		System.out.println("Wnen to stat is enabled - assert passed");
		
		WebElement res =d.findElement(By.xpath("//div[ @id ='resumeInput']/input"));
		Assert.assertEquals(true, res.isEnabled());
		System.out.println("Fileupload is enabled - assert passed");*/
		
		// Soft Assert
		SoftAssert softAssertion= new SoftAssert();
		WebElement FANM=d.findElement(By.xpath("//*[@id='fnameInput']/input"));
		System.out.println(" softassert was started");
		softAssertion.assertEquals(true,FANM.isEnabled());
		System.out.println("softAssert Method for Fnam Executed");
		
		
		
		
		
		WebElement LANM=d.findElement(By.xpath("//*[@id='lnameInput']/input"));
		System.out.println(" softassert was started");
		softAssertion.assertEquals(true,LANM.isEnabled());
		System.out.println("softAssert Method for Lnam Executed");
		
		
		
		
		 WebElement Maild=	d.findElement(By.xpath("//div/div[2]/div[1]/following::div/div/div[1]/child::div/input"));
		   System.out.println(" softassert   mailid started");
			softAssertion.assertEquals(true,Maild.isEnabled());
			System.out.println("softAssert Method for  Mailid Executed");
			
		
		WebElement Curr_comp = d.findElement(By.xpath("//div/div[2]/div[1]/following::div/div[2]/div[1]/div/input"));
			 System.out.println(" softassert  started");
			 softAssertion.assertEquals(true,Curr_comp.isEnabled());
				System.out.println("softAssert Method for curr_comp  Executed");
				
				
			WebElement calendar=d.findElement(By.xpath("//div[@class='input-group-addon']"));
			
			System.out.println(" softassert  started");
			 softAssertion.assertEquals(true,calendar.isEnabled());
				System.out.println("softAssert Method for calendr  Executed");
			
			WebElement QA=	d.findElement(By.xpath("//*[@id='positionInput']/input"));
					System.out.println(" softassert  started");
			 softAssertion.assertEquals(true,QA.isEnabled());
				System.out.println("softAssert Method for QA  Executed");
				
			WebElement Url=	d.findElement(By.xpath("//input[@type='url']"));	
			System.out.println(" softassert  started");
				 softAssertion.assertEquals(true,Url.isEnabled());
					System.out.println("softAssert Method for URL  Executed");
				
			WebElement Sal=d.findElement(By.xpath("//div[5]/div/div/child::div/input")); 	
					System.out.println(" softassert  started");
					 softAssertion.assertEquals(true,Sal.isEnabled());
						System.out.println("softAssert Method for SAL  Executed");
						
						
						WebElement To_start=d.findElement(By.xpath("//div[@id='whenStartInput']/input"));
						System.out.println(" softassert  started");
						 softAssertion.assertEquals(true,To_start.isEnabled());
							System.out.println("softAssert Method for To Start  Executed");
						

					WebElement Addr=d.findElement(By.xpath("//div[@id='addressInput']/textarea"));
						System.out.println(" softassert  started");
						 softAssertion.assertEquals(true,Addr.isEnabled());
							System.out.println("softAssert Method for Address  Executed");
						
						//uploading the file
						WebElement File_upload	=d.findElement(By.xpath("//input[@id='resume' and  @type ='file']"));
							System.out.println(" softassert  started");
							 softAssertion.assertEquals(true,File_upload.isEnabled());
								System.out.println("softAssert Method for FILEUpLoad  Executed");
							

						WebElement radiobtn=d.findElement(By.xpath("//input[@id='yes' and  @type ='radio']"));
		
						System.out.println(" softassert  started");
						 softAssertion.assertEquals(true,radiobtn.isEnabled());
							System.out.println("softAssert Method for Relocate  Executed");
						
				softAssertion.assertAll();
	
		//Using Xpath filling all details in all text box
		
		d.findElement(By.xpath("//*[@id='fnameInput']/input")).sendKeys("Mahesh");
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.findElement(By.xpath("//div/form/div[1]/div[2]/div/div/input")).sendKeys("Shan");
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.findElement(By.xpath("//div/div[2]/div[1]/following::div/div/div[1]/child::div/input")).sendKeys("hai123@gmail.com");
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.findElement(By.xpath("//div/div[2]/div[1]/following::div/div[2]/div[1]/div/input")).sendKeys("abccorp");
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.findElement(By.xpath("//div[2]/div[1]/following::div/div[2]/following::div/div[1]/div/div/input")).sendKeys("9235467711");
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//clicking on calendar box
		d.findElement(By.xpath("//div[@class='input-group-addon']")).click();
		
		// Selecting the month in calendar
		
		String month ="May 2018";
		String Date = "10";
		
		while(true)
		{
			
		String text=d.findElement(By.xpath("//thead/child::tr[2]/th[2]")).getText();
			if(text.contentEquals(month))
			{break;
			}
			else {
				d.findElement(By.xpath("//thead/child::tr[2]/th")).click();
			}
			}
		
		
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// Selecting date in calendar
		
		d.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td[contains(text(),'"+Date+"')]")).click();
		
				d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//*[@id='positionInput']/input")).sendKeys("QA");
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
WebElement URL= d.findElement(By.xpath("//input[@type='url']"));	

StringBuffer sb =new StringBuffer()
						.append("www")
						.append(".")
						.append("acreation.com");
URL.sendKeys(sb);

d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

d.findElement(By.xpath("//div[5]/div/div/child::div/input")).sendKeys("3lacs");

d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	



d.findElement(By.xpath("//div[@id='whenStartInput']/input")).sendKeys("Immediate");


d.findElement(By.xpath("//div[@id='addressInput']/textarea")).sendKeys("1, abc street");

//uploading the file
	d.findElement(By.xpath("//input[@id='resume' and  @type ='file']")).sendKeys("D:\\trial\\test.txt");
	
// To click radio button of relocate option
WebElement radiobtn1=d.findElement(By.xpath("//input[@id='yes' and  @type ='radio']"));
radiobtn1.click();
//To click submit button
d.findElement(By.xpath("//button[ @type ='submit']")).click();

//to reset button

//d.findElement(by.xpath("//button[ @type ='reset']")).click();
	}


	}
		
		
		
	
		
		