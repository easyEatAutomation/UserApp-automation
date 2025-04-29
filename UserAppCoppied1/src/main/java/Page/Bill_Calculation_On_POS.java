package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebBase.WebBase;

public class Bill_Calculation_On_POS extends WebBase{
	double discountValue_POS;
	double item_total_POS = 0;
	double sst_POS =0;
	double sc_POS =0;
	double pc_POS =0;
	double sstValue_POS =0;
	double serviceChargeValue_POS = 0;
	double packagingChargeValue_POS =0;
	static double total_bill_POS =0;
	Double final_bill_sys_POS;
	
	// billing calculation after add more item
	
	public void itemTotal_sst_pc_sc_discount_POS_afterAddmore_item() throws InterruptedException{ 
		
		          System.out.println("work above");
		          WebDriverWait wait = new WebDriverWait(driver, 10);
	        	  WebElement discount =  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[2]/div[2]")));
	        	  System.out.println("work below");
	              String text = discount.getText();
	              String convertedText = text.replaceAll("[^0-9.]", "");
	              discountValue_POS = Double.parseDouble(convertedText);  
	
	  		
	  		 WebElement total_item_ele = driver.findElement(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[1]/div[2]"));
             String text_total_item = total_item_ele.getText();
             String convertedText_total_item = text_total_item.replaceAll("[^0-9.]", "");
             item_total_POS = Double.parseDouble(convertedText_total_item);  
	  		
	          sst_POS = 0.1*item_total_POS;
	          pc_POS = 0.1*item_total_POS;
	          sc_POS = 0.1*item_total_POS;
	          System.out.println("item_total   " + item_total_POS);
	          System.out.println("SST   " + sst_POS);
	          System.out.println("PC   " + pc_POS);
	          System.out.println("SC   " + sc_POS);
	}
	
	
	
	public void sst_validation_after_addMoreItem() throws InterruptedException {
	    WebElement sstPath = null;
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, 10);
	    	sstPath = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[3]/div[2]")));

//	        sstPath = driver.findElement(By.xpath(""));
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        System.out.println("Element not found: " + e.getMessage());
	    }

	    if (sstPath != null) {
	        String text = sstPath.getText();
	        String convertedText = text.replaceAll("[^0-9.]", "");
	        double sstValue_POS = Double.parseDouble(convertedText);

	        if (sstValue_POS == sst_POS) {
	            System.out.println("SST validated");
	        } else {
	            System.out.println("SST value does not match expected value");
	        }
	    } else {
	        System.out.println("There is no SST element on the page");
	    }
	}

	
	
	public void sc_validation_after_addMoreItem() throws InterruptedException{
        WebElement serviceChargePath = null;
        try {
        	serviceChargePath = driver.findElement(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[4]/div[2]"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
        	System.out.println("no elements found 9999999999999999999");
         }

        if (serviceChargePath != null) {
        	  WebElement serviceCharge = driver.findElement(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[4]/div[2]"));
              String text = serviceCharge.getText();
              String convertedText = text.replaceAll("[^0-9.]", "");
              serviceChargeValue_POS = Double.parseDouble(convertedText);
              
              if(serviceChargeValue_POS == sc_POS) {
            	  System.out.println("SC validated");
              }
        } else {
        	serviceChargeValue_POS = 0.0;
        } 
	}
	
	
	public void pc_validation_after_addMoreItem() throws InterruptedException{
        WebElement packagingChargePath = null;
        try {
        	packagingChargePath = driver.findElement(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[5]/div[2]"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
        	System.out.println("no elements found 9999999999999999999");
        	
        }

        if (packagingChargePath != null) {
        	  WebElement packagingCharge = driver.findElement(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[5]/div[2]"));
              String text = packagingCharge.getText();
              String convertedText = text.replaceAll("[^0-9.]", "");
              packagingChargeValue_POS = Double.parseDouble(convertedText);
              
              if(packagingChargeValue_POS == pc_POS) {
            	  System.out.println("PC validated");
              }
        } else {
        	packagingChargeValue_POS = 0.0;
        }
        
	}
	
	
public void bill_calculation_and_validation_after_addMoreItem() throws InterruptedException{
		
		String total_bill_calaculated_POS;
		
			
			total_bill_POS = item_total_POS - discountValue_POS + sst_POS + sc_POS + pc_POS;
		     total_bill_calaculated_POS = String.format("%.2f", total_bill_POS);
		    total_bill_POS = Double.parseDouble(total_bill_calaculated_POS);
	
		    
		    WebElement sys_bill = driver.findElement(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[10]/div"));
	        String text = sys_bill.getText();
	        String convertedText = text.replaceAll("[^0-9.]", "");
	        final_bill_sys_POS = Double.parseDouble(convertedText);
	        
	        if(final_bill_sys_POS == total_bill_POS) {
	        	System.out.println("Bill validated");
	        	 System.out.println("Total bill is " + total_bill_POS);
	        }else {
	        	System.out.println("Bill was mismatched by the diffrence of " + (final_bill_sys_POS - total_bill_POS));
	        	System.out.println("Final bill system " + final_bill_sys_POS);
	        	System.out.println("Tital Bill calculated" + total_bill_POS);
	        }
	}


// billing calculation after void item

public void itemTotal_sst_pc_sc_discount_POS_after_voidItem() throws InterruptedException{ 
	
    System.out.println("work above");
    WebDriverWait wait = new WebDriverWait(driver, 10);
	  WebElement discount =  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[6]/div[2]/div[2]")));
	  System.out.println("work below");
    String text = discount.getText();
    String convertedText = text.replaceAll("[^0-9.]", "");
    discountValue_POS = Double.parseDouble(convertedText);  


 WebElement total_item_ele = driver.findElement(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[6]/div[1]/div[2]"));
String text_total_item = total_item_ele.getText();
String convertedText_total_item = text_total_item.replaceAll("[^0-9.]", "");
item_total_POS = Double.parseDouble(convertedText_total_item);  

sst_POS = 0.1*item_total_POS;
pc_POS = 0.1*item_total_POS;
sc_POS = 0.1*item_total_POS;
System.out.println("item_total   " + item_total_POS);
System.out.println("SST   " + sst_POS);
System.out.println("PC   " + pc_POS);
System.out.println("SC   " + sc_POS);
}

public void sst_validation_after_voidItem() throws InterruptedException {
    WebElement sstPath = null;
    try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	sstPath = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[6]/div[3]/div[2]")));

//        sstPath = driver.findElement(By.xpath(""));
    } catch (org.openqa.selenium.NoSuchElementException e) {
        System.out.println("Element not found: " + e.getMessage());
    }

    if (sstPath != null) {
        String text = sstPath.getText();
        String convertedText = text.replaceAll("[^0-9.]", "");
        double sstValue_POS = Double.parseDouble(convertedText);

        if (sstValue_POS == sst_POS) {
            System.out.println("SST validated");
        } else {
            System.out.println("SST value does not match expected value");
        }
    } else {
        System.out.println("There is no SST element on the page");
    }
}



public void sc_validation_after_voidItem() throws InterruptedException{
    WebElement serviceChargePath = null;
    try {
    	serviceChargePath = driver.findElement(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[6]/div[4]/div[2]"));
    } catch (org.openqa.selenium.NoSuchElementException e) {
    	System.out.println("no elements found 9999999999999999999");
     }

    if (serviceChargePath != null) {  
          String text = serviceChargePath.getText();
          String convertedText = text.replaceAll("[^0-9.]", "");
          serviceChargeValue_POS = Double.parseDouble(convertedText);
          
          if(serviceChargeValue_POS == sc_POS) {
        	  System.out.println("SC validated");
          }
    } else {
    	serviceChargeValue_POS = 0.0;
    } 
}


public void pc_validation_after_voidItem() throws InterruptedException{
    WebElement packagingChargePath = null;
    try {
    	packagingChargePath = driver.findElement(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[6]/div[5]/div[2]"));
    } catch (org.openqa.selenium.NoSuchElementException e) {
    	System.out.println("no elements found 9999999999999999999");
    	
    }

    if (packagingChargePath != null) {
          String text = packagingChargePath.getText();
          String convertedText = text.replaceAll("[^0-9.]", "");
          packagingChargeValue_POS = Double.parseDouble(convertedText);
          
          if(packagingChargeValue_POS == pc_POS) {
        	  System.out.println("PC validated");
          }
    } else {
    	packagingChargeValue_POS = 0.0;
    }
    
}


public void bill_calculation_and_validation_after_voidItem() throws InterruptedException{
	
	String total_bill_calaculated_POS;
	
		
		total_bill_POS = item_total_POS - discountValue_POS + sst_POS + sc_POS + pc_POS;
	     total_bill_calaculated_POS = String.format("%.2f", total_bill_POS);
	    total_bill_POS = Double.parseDouble(total_bill_calaculated_POS);

	    
	    WebElement sys_bill = driver.findElement(By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[6]/div[10]/div"));
        String text = sys_bill.getText();
        String convertedText = text.replaceAll("[^0-9.]", "");
        final_bill_sys_POS = Double.parseDouble(convertedText);
        
        if(final_bill_sys_POS == total_bill_POS) {
        	System.out.println("Bill validated");
        	 System.out.println("Total bill is " + total_bill_POS);
        }else {
        	System.out.println("Bill was mismatched by the diffrence of " + (final_bill_sys_POS - total_bill_POS));
        	System.out.println("Final bill system " + final_bill_sys_POS);
        	System.out.println("Tital Bill calculated" + total_bill_POS);
        }
}


	
}
