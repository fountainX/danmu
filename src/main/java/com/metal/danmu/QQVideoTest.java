package com.metal.danmu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QQVideoTest {

private static Logger log = LoggerFactory.getLogger(QQVideoTest.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    
	    log.info("starting driver");

	    driver.get("http://film.qq.com/cover/a/aoc0f4wxx0lagzg.html");
	    
	    while(true) {
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
//	    log.info("ok");
	    
//	    Actions action = new Actions(driver);
//	    
//	    WebElement ele = driver.findElement(By.id("t00209u67as")).findElement(By.xpath(".."));
//	    
//	    action.moveToElement(ele);
//	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
//	    action.click();
//	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
//	    action.moveToElement(driver.findElement(By.id("tenvideo_flash_player_1467731167432")));
//	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
//	    action.click();
	    
//	    driver.findElement(By.id("mod_player")).click();
//	    
//	    WebElement player = driver.findElement(By.className("tenvideo_player"));
	    
//	    WebElement player = driver.findElement(By.id("mod_player"));
//	    
//	    action.moveToElement(player).build().perform();
//	    action.click();
	    
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    
//	    log.info("end");
//	    driver.quit();
	}
}
