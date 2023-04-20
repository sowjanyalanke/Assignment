package com.Submission;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.support.ui.Select;

public class JobApply {
	
	public static WebDriver driver = null;
	
	@Ignore
	@Test
	public void UploadFileimage() throws AWTException
	{
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowjanya lanke\\OneDrive\\Documents\\Enterprise_PracticeWS\\Assignment\\src\\Driver\\chromedriver.exe");
     
     driver=new ChromeDriver();  
     
     driver.navigate().to("https://www.hardingretail.com/");  
    
     WebDriverWait wait = new WebDriverWait(driver, 10);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Making Every Cruise Better')]")));
     driver.manage().window().maximize();  
     
     WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
     
     Actions actions = new Actions(driver);
     
     actions.moveToElement(career).build().perform();;
       
     WebElement careerOption = driver.findElement(By.xpath("//a[contains(text(),'Landside')]"));
     careerOption.click();
     
     WebElement vacancies = driver.findElement(By.xpath("//h1[contains(text(),'Your adventure starts here')]//following-sibling::a"));
     vacancies.click();
     
     WebElement searchjob = driver.findElement(By.xpath("//input[@id='txtSearchField']"));     
     searchjob.sendKeys("Automated Test Analyst");
     
     WebElement searchbutton = driver.findElement(By.xpath("//input[@id='btnSearch']"));  
     
     searchbutton.click();
     
    WebElement apply = driver.findElement(By.xpath("//a[contains(text(),'Test Analyst')]//following::a[contains(text(),'Apply')][1]"));  
    apply.click();

    JavascriptExecutor js = (JavascriptExecutor) driver; 

  
    WebElement FirstName = driver.findElement(By.xpath("//input[@name='ApplicantFirstName']"));  
    FirstName.sendKeys("Avinash");
    
    WebElement SurName = driver.findElement(By.xpath("//input[@name='ApplicantSurname']"));  
    SurName.sendKeys("Karumanchi");
    
    WebElement Email = driver.findElement(By.xpath("//input[@name='ApplicantEmail']"));  
    Email.sendKeys("avianshk86@gmail.com");
    
    WebElement Mobileno = driver.findElement(By.xpath("//input[@name='ApplicantMobile']"));  
    Mobileno.sendKeys("0737468381");
   
    WebElement resume = driver.findElement(By.xpath("//label[contains(text(),'Address Information')]//preceding::i"));  
    js.executeScript("arguments[0].click();", resume);
    
    Robot rb= new Robot();
    rb.delay(2000);
    
    StringSelection ss=new StringSelection("C:\\Users\\sowjanya lanke\\Downloads\\nature.jpg");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    
    
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    
    WebElement resumenext = driver.findElement(By.xpath("//div[@class='file-entry']//span[1]"));  
        
    String filename=resumenext.getText();
 
    if(filename.contains("jpg"))
    {
    	assertTrue("Jpg file uploaded unsupported format", false);
    }
    
    WebElement City = driver.findElement(By.xpath("//input[@name='ApplicantMunicipality']"));  
    City.sendKeys("Norwich");
    
  
     
	}
	
		@Test
		public void UploadFileword() throws AWTException
		{
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowjanya lanke\\OneDrive\\Documents\\Enterprise_PracticeWS\\Assignment\\src\\Driver\\chromedriver.exe");
	     
	    driver=new ChromeDriver();  
	     
	     driver.navigate().to("https://www.hardingretail.com/");  
	    
	     WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Making Every Cruise Better')]")));
	     driver.manage().window().maximize();  
	     
	     WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
	     
	     Actions actions = new Actions(driver);
	     
	     actions.moveToElement(career).build().perform();;
	       
	     WebElement careerOption = driver.findElement(By.xpath("//a[contains(text(),'Landside')]"));
	     careerOption.click();
	     
	     WebElement vacancies = driver.findElement(By.xpath("//h1[contains(text(),'Your adventure starts here')]//following-sibling::a"));
	     vacancies.click();
	     
	     WebElement searchjob = driver.findElement(By.xpath("//input[@id='txtSearchField']"));     
	     searchjob.sendKeys("Automated Test Analyst");
	     
	     WebElement searchbutton = driver.findElement(By.xpath("//input[@id='btnSearch']"));  
	     
	     searchbutton.click();
	     
        WebElement apply = driver.findElement(By.xpath("//a[contains(text(),'Test Analyst')]//following::a[contains(text(),'Apply')][1]"));  
	    apply.click();
   
	    JavascriptExecutor js = (JavascriptExecutor) driver; 

	  
	    WebElement FirstName = driver.findElement(By.xpath("//input[@name='ApplicantFirstName']"));  
	    FirstName.sendKeys("Avinash");
	    
	    WebElement SurName = driver.findElement(By.xpath("//input[@name='ApplicantSurname']"));  
	    SurName.sendKeys("Karumanchi");
	    
	    WebElement Email = driver.findElement(By.xpath("//input[@name='ApplicantEmail']"));  
	    Email.sendKeys("avianshk86@gmail.com");
	    
	    WebElement Mobileno = driver.findElement(By.xpath("//input[@name='ApplicantMobile']"));  
	    Mobileno.sendKeys("0737468381");
	   
	    WebElement resume = driver.findElement(By.xpath("//label[contains(text(),'Address Information')]//preceding::i"));  
	    js.executeScript("arguments[0].click();", resume);
	    
	    Robot rb= new Robot();
	    rb.delay(2000);
	    
	    StringSelection ss=new StringSelection("C:\\Users\\sowjanya lanke\\Downloads\\resume_012.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    
	    
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    
	    WebElement resumenext = driver.findElement(By.xpath("//div[@class='file-entry']//span[1]"));  
	        
	    String filename=resumenext.getText();
	  
	    
	    if(filename.contains("docx"))
	    {
	    	assertTrue("Successful File upload", true);
	    }
	    
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    
	    WebElement City = driver.findElement(By.xpath("//input[@name='ApplicantMunicipality']"));  
	    City.sendKeys("Norwich");
	       
	    WebElement NextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Next')]")));
	    js.executeScript("arguments[0].click();", NextButton);
	    
	    Select Gender = new Select(driver.findElement(By.xpath("//label[contains(text(),'gender ')]//following::select[1]")));  
	    Gender.selectByVisibleText("Female");
	    
	    Select age = new Select(driver.findElement(By.xpath("//label[contains(text(),'age')]//following::select[1]")));  
	    age.selectByVisibleText("20 - 29 years");
	    
	    Select ethnicity = new Select(driver.findElement(By.xpath("//label[contains(text(),'ethnicity')]//following::select[1]")));  
	    ethnicity.selectByVisibleText("African");
	    
	    Select religion = new Select(driver.findElement(By.xpath("//label[contains(text(),'religion')]//following::select[1]")));  
	    religion.selectByVisibleText("Sikh");
	    
	    Select Disability = new Select(driver.findElement(By.xpath("//label[contains(text(),'religion')]//following::select[2]")));  
	    Disability.selectByVisibleText("No");
	    
	    Select sexuality = new Select(driver.findElement(By.xpath("//label[contains(text(),'sexual orientation')]//following::select[1]")));  
	    sexuality.selectByVisibleText("Prefer not to say");
	    
	    WebElement basicdetails = driver.findElement(By.xpath("//label[contains(text(),'salary')]//following::textarea"));  
	    basicdetails.sendKeys("user details");
	       
		}
	   
	    @After
	    public void clean()
	    {
	    	  driver.quit();
	    }
	
	}


