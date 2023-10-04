package com.example.jennkin.jennkinproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyPumaApplication {

	public static void main(String[] args) throws InterruptedException {
	
			FirefoxDriver dr=new FirefoxDriver();
			dr.get("https://www.giva.co/account/login");
			dr.manage().window().maximize();
			Actions actions=new Actions(dr);
			Thread.sleep(3000);
			
			WebElement email=dr.findElement(By.xpath("//*[@id=\"CustomerEmail\"]"));
			email.sendKeys("shamikanaik28@gmail.com");
			WebElement pass=dr.findElement(By.xpath("//*[@id=\"CustomerPassword\"]"));
			pass.sendKeys("Shamika@28");
			dr.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[2]/form/div/input")).click();
			Thread.sleep(5000);
			dr.findElement(By.xpath("/html/body/div[2]/div/header/div/nav/ul/li[2]/a")).click();
			Thread.sleep(5000);
			dr.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[1]/div[2]/div/div[2]/ul/div[1]/div[2]/a")).click();
			Thread.sleep(5000);
			dr.findElement(By.xpath("//*[@id=\"add_to_cart\"]")).click();
			Thread.sleep(5000);
			dr.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div[2]/div/div[7]/button")).click();
			Thread.sleep(5000);
			WebElement add=dr.findElement(By.xpath("//*[@id=\"checkout_shipping_address_address1\"]"));
			add.sendKeys("Blossom garden");
			WebElement add1=dr.findElement(By.xpath("//*[@id=\"checkout_shipping_address_address2\"]"));
			add1.sendKeys("near passport offc");
			WebElement city=dr.findElement(By.xpath("//*[@id=\"checkout_shipping_address_city\"]"));
			city.sendKeys("Nashik");
			Select s=new Select(dr.findElement(By.xpath("//*[@id=\"checkout_shipping_address_province\"]")));
			s.selectByVisibleText("Maharashtra");
			dr.findElement(By.xpath("//*[@id=\"checkout_shipping_address_zip\"]")).sendKeys("422101");
			dr.findElement(By.xpath("//*[@id=\"checkout_shipping_address_phone\"]")).sendKeys("7891872088");
			dr.findElement(By.xpath("//*[@id=\"continue_button\"]")).click();
	}
		
		//}
	}


