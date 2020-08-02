package com.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends PageInitializer{

	/**
	 * Method that clears and sends keys
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	
	/**
	 * Method checks if radio/checkbox is enabled and clicks it
	 * @param radioOrcheckbox
	 * @param value
	 */
	public static void clickRadioOrCheckbox(List<WebElement> radioOrcheckbox, String value) {
		String actualValue;
		
		for(WebElement el : radioOrcheckbox) {
			actualValue = el.getAttribute("value").trim();
			if(el.isEnabled() && actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}
	
	
	/**
	 * Method that checks if text is there and then selects it
	 * @param element
	 * @param textToSelect
	 */
	public static void selectDdValue(WebElement element, String textToSelect) {
		try {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		
		for(WebElement el : options) {
			if(el.getText().equalsIgnoreCase(textToSelect));
			select.selectByVisibleText(textToSelect);
			break;	
		}
		
		}
		catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method that selects value by index
	 * @param element
	 * @param index
	 */
	public static void selectDdValue(WebElement element, int index) {
		try {
			Select select = new Select(element);
			int indexSize = select.getOptions().size();
			if(indexSize > index) {
				select.selectByIndex(index);
			}
		}
		catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method that accepts Alert
	 */
	public static void acceptAlert() {
		try {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		}
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method that dismiss Alert
	 */
	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method that returns text of the Alert
	 * @return
	 */
	public static String getAlertText() {
		String alertText = null;
		try {
			Alert alert = driver.switchTo().alert();
			alertText = alert.getText();	
		}
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
		return alertText;
	}
	
	/**
	 * Method that sends text to the Alert
	 * @param text
	 */
	public static void sendAlertText(String text) {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);	
		}
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Method that switch to Frame using name or ID
	 * @param nameOrId
	 */
	public static void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		}
		catch(NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Method that switch to Frame using WebElement
	 * @param element
	 */
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		}
		catch(NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Method that switch to Frame using index
	 * @param index
	 */
	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		}
		catch(NoSuchFrameException e) {
			e.printStackTrace();
		}
	}
	
	
	public static WebDriverWait getWaitObject() {
        WebDriverWait wait = new WebDriverWait(driver, 30L);
        return wait;
    }

    public static WebElement waitForClickability(WebElement element) {
        return (WebElement)getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public static WebElement waitForVisibility(WebElement element) {
    	return getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }
    
    
    public static void click(WebElement element) {
        waitForClickability(element);
        element.click();
    }
    
    
    
    
    public static JavascriptExecutor getJSObject() {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	return js;
    }
    
    public static void jsClick(WebElement element) {
    	getJSObject().executeScript("arguments[0].click();", element);
    }
    
    public static void scrollToElement(WebElement element) {
    	getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);
    }
    
    public static void scrollDown(int pixel) {
    	getJSObject().executeScript("window.scrollBy(0" + pixel + ");");
    }
    
    public static void scrollUp(int pixel) {
    	getJSObject().executeScript("window.scrollBy(0 -" + pixel + ");");
    }

    
    public static void wait(int seconds) {
    	try {
    		Thread.sleep(seconds * 1000);
    	}
    	catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    }
	
	public static void switchToWindow() {
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> it = allWindowHandles.iterator();
			while(it.hasNext()) {
				String handle = it.next();
				if(!handle.equals(parentWindowHandle)) {
					driver.switchTo().window(handle);
					break;
				}
			}
	}	
}			