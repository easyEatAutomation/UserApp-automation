package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebBase.WebBase;

public class Bill_pickupOrder extends WebBase {

	static double discountValue;
	static double sstValue;
	static double serviceChargeValue;
	static double packagingChargeValue;
	static double total_bill = 0;
	static double item_total = 0;
	static double sst;
	static double sc;
	static double pc;
	int iteration = 1;
	Double final_bill_sys;
//	double y = 0;

	private String getDiscountXPath() {
		if (currentCountry.equalsIgnoreCase("Malaysia")) {
			return "//*[@id=\"root\"]/div/div/div[3]/div[5]/div[2]/div/div[2]/div[2]";
		} else { // Indonesia
			return "/html/body/div[1]/div/div[1]/div[8]/div[2]/div/div[1]/div[2]";
		}
	}

	private String getSSTXPath() {
		if (currentCountry.equalsIgnoreCase("Malaysia")) {
			return "/html/body/div[1]/div/div[1]/div[7]/div[2]/div/div[2]/div[2]";
			        //html/body/div[1]/div/div[1]/div[8]/div[2]/div/div[2]/div[2]
		} else { // Indonesia
			//return "/html/body/div[1]/div/div[1]/div[8]/div[2]/div/div[2]/div[2]";
			return "//*[@id=\"root\"]/div/div[1]/div[7]/div[2]/div/div[1]/div[2]";
		}
	}

	private String getSCvalidationXPath() {
		if (currentCountry.equalsIgnoreCase("Malaysia")) {
			return "/html/body/div/div/div[1]/div[7]/div[2]/div/div[2]/div[2]";
		} else { // Indonesia
			return "/html/body/div[1]/div/div[1]/div[8]/div[2]/div/div[3]/div[2]";
		}
	}

	private String getPC_validationXPath() {
		if (currentCountry.equalsIgnoreCase("Malaysia")) {
			return "/html/body/div/div/div[1]/div[7]/div[2]/div/div[4]/div[2]";
		} else { // Indonesia
			//return "/html/body/div[1]/div/div[1]/div[8]/div[2]/div/div[4]/div[2]";
			return "//*[@id=\"root\"]/div/div[1]/div[7]/div[2]/div/div[4]/div[2]";
		}
	}

	private String getSystemBillXPath() {
		if (currentCountry.equalsIgnoreCase("Malaysia")) {
			return "/html/body/div/div/div[1]/div[7]/div[2]/div/div[5]/div[2]";
		}           
		
		else
		{
			return "//*[@id=\"root\"]/div/div[1]/div[7]/div[2]/div/div[5]/div[2]";
		}	
	}

	public void itemTotal_sst_pc_sc_discount() throws InterruptedException {

		// dicount calculate

		WebElement discountPath = null;
		try {
			discountPath = driver.findElement(By.xpath(getDiscountXPath()));
		} catch (org.openqa.selenium.NoSuchElementException e) {

		}

		if (discountPath != null) {
			String text = discountPath.getText();
			String convertedText = text.replaceAll("[^0-9.]", "");
			discountValue = Double.parseDouble(convertedText);
		} else {
			// Store the value 0
			discountValue = 0.0;
		}

		Thread.sleep(5000);
		WebElement parentDiv = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]"));

		// Find all child div elements with the class name "sub-price"
		List<WebElement> subPriceElements = parentDiv.findElements(By.className("sub-price"));

		// Create an array to store the text content of sub-price elements
		List<String> subPriceTexts = new ArrayList<>();

		// Iterate over each sub-price element and store its text content in the array
		for (WebElement subPriceElement : subPriceElements) {
			subPriceTexts.add(subPriceElement.getText());
		}

		// Print the array contents
		for (String subPriceText : subPriceTexts) {
			String PriceText = subPriceText.replaceAll("[^\\d.]", "");
			double itemPrice = Double.parseDouble(PriceText);
			item_total = item_total + itemPrice;
		}
		
		sc = 0.1 * item_total;
		// SST (TAX) Calculation
		if(currentCountry.equalsIgnoreCase("Malaysia")){
			sst = 0.1 * item_total; //10%
			System.out.println("SST   " + sst);
		}
		else //Indonesia
		{
			sst = 0.1 * item_total; //10%
			sst = sst + (0.1 * sc);
		}
		
		//PKCG calculation
		if(currentCountry.equalsIgnoreCase("Malaysia")){
			pc =  0.1 * item_total;
			System.out.println("PC   " + pc);
		}
		else // Indonesia
		{
			pc = 44.34;
			System.out.println("PC   " + pc);
		}
		
		//pc = 0.1 * item_total;
		System.out.println("SST   " + sst);
		//System.out.println("PC   " + pc);
		System.out.println("SC   " + sc);
	}

	public void sst_validation() throws InterruptedException {
		WebElement sstPath = null;
		try {
			sstPath = driver.findElement(By.xpath(getSSTXPath()));

		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("no sst path found");
		}

		if (sstPath != null) {
//        	  WebElement sstEle = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[5]/div[2]/div/div[4]/div[2]"));
			String text = sstPath.getText();
			System.out.println("sst path found, sst is " + text);
			String convertedText = text.replaceAll("[^0-9.]", "");
			sstValue = Double.parseDouble(convertedText);

			if (sstValue == sst) {
				System.out.println("SST validated");
			}
		} else {
			sstValue = 0.0;
			System.out.println("There is no SST");
		}
	}

	public void sc_validation() throws InterruptedException {
		WebElement serviceChargePath = null;
		try {
			serviceChargePath = driver.findElement(By.xpath(getSCvalidationXPath()));
		} catch (org.openqa.selenium.NoSuchElementException e) {
		}

		if (serviceChargePath != null) {
			// WebElement serviceCharge =
			// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[5]/div[2]/div/div[3]/div[2]"));
			String text = serviceChargePath.getText();
			String convertedText = text.replaceAll("[^0-9.]", "");
			serviceChargeValue = Double.parseDouble(convertedText);

			if (serviceChargeValue == sc) {
				System.out.println("SC validated");
			}
		} else {
			serviceChargeValue = 0.0;
		}
	}

	public void pc_validation() throws InterruptedException {
		WebElement packagingChargePath = null;
		try {
			packagingChargePath = driver.findElement(By.xpath(getPC_validationXPath()));
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// Element not found

		}

		if (packagingChargePath != null) {
			// WebElement packagingCharge =
			// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[5]/div[2]/div/div[5]/div[2]"));
			String text = packagingChargePath.getText();
			String convertedText = text.replaceAll("[^0-9.]", "");
			packagingChargeValue = Double.parseDouble(convertedText);

			if (packagingChargeValue == pc) {
				System.out.println("PC validated");
			}
		} else {
			packagingChargeValue = 0.0;
		}

	}
	
	

	public String bill_calculation_and_validation() throws InterruptedException {
		System.out.println("calculation of bil 11111111111111");

     
		
		
		
		String total_bill_calaculated;
		System.out.println("SST new   " + sst);
		System.out.println("PC new  " + pc);
		System.out.println("SC new  " + sc);
		System.out.println("Discount new    " + discountValue);

		total_bill = item_total - discountValue + sst + sc + pc;
		total_bill_calaculated = String.format("%.2f", total_bill);
		total_bill = Double.parseDouble(total_bill_calaculated);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement sys_bill = driver.findElement(By.xpath(getSystemBillXPath()));

		String text = sys_bill.getText();
		String convertedText = text.replaceAll("[^0-9.]", "");
		final_bill_sys = Double.parseDouble(convertedText);

		if (final_bill_sys == total_bill) {
			System.out.println("Bill validated");
			System.out.println("Total bill is " + total_bill);
		} else {
			System.out.println("Bill was mismatched by the diffrence of " + (final_bill_sys - total_bill));
			System.out.println("Final bill system " + final_bill_sys);
			System.out.println("Total Bill calculated" + total_bill);

		}

		return total_bill_calaculated;
	}


}





	
/*public void itemTotal_sst_pc_sc_discount() throws InterruptedException{
		
		//dicount calculate
	
		WebElement discountPath = null;
        try {
        	discountPath = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[5]/div[2]/div/div[2]/div[2]"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
        	
        }

        if (discountPath != null) {
              String text = discountPath.getText();
              String convertedText = text.replaceAll("[^0-9.]", "");
              discountValue = Double.parseDouble(convertedText);  
        } else {
            // Store the value 0
        	discountValue = 0.0;
	}
		
        
         
		WebElement parentDiv = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]"));

        // Find all child div elements with the class name "sub-price"
        List<WebElement> subPriceElements = parentDiv.findElements(By.className("sub-price"));

        // Create an array to store the text content of sub-price elements
        List<String> subPriceTexts = new ArrayList<>();

        // Iterate over each sub-price element and store its text content in the array
        for (WebElement subPriceElement : subPriceElements) {
            subPriceTexts.add(subPriceElement.getText());
        }

        // Print the array contents
        for (String subPriceText : subPriceTexts) {
        	String PriceText = subPriceText.replaceAll("[^\\d.]", "");
        	double itemPrice = Double.parseDouble(PriceText);
        	item_total = item_total + itemPrice;
        }
        sst = 0.1*item_total;
        pc = 0.1*item_total;
        sc = 0.1*item_total;
        System.out.println("SST   " + sst);
        System.out.println("PC   " + pc);
        System.out.println("SC   " + sc);
	}
	
	public void sst_validation() throws InterruptedException{
        WebElement sstPath = null;
        try {
        	//sstPath = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[8]/div[2]/div/div[2]/div[2]"));
        	sstPath = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[7]/div[2]/div/div[2]/div[2]"));
        	                                       
        } catch (org.openqa.selenium.NoSuchElementException e) {
        	System.out.println("no sst path found");
        }

        if (sstPath != null ) {
//        	  WebElement sstEle = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[5]/div[2]/div/div[4]/div[2]"));
              String text = sstPath.getText();
              System.out.println("sst path found, sst is " + text);
              String convertedText = text.replaceAll("[^0-9.]", "");
              sstValue = Double.parseDouble(convertedText);
              
              if(sstValue == sst) {
            	  System.out.println("SST validated");
              }
        } else {
        	sstValue = 0.0;
        	System.out.println("There is no SST");
        }
	}
	
	
	public void sc_validation() throws InterruptedException{
        WebElement serviceChargePath = null;
        try {
        	serviceChargePath = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[7]/div[2]/div/div[2]/div[2]"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
         }

        if (serviceChargePath != null) {
        	 // WebElement serviceCharge = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[5]/div[2]/div/div[3]/div[2]"));
              String text = serviceChargePath.getText();
              String convertedText = text.replaceAll("[^0-9.]", "");
              serviceChargeValue = Double.parseDouble(convertedText);
              
              if(serviceChargeValue == sc) {
            	  System.out.println("SC validated");
              }
        } else {
        	serviceChargeValue = 0.0;
        } 
	}
	
	
	public void pc_validation() throws InterruptedException{
        WebElement packagingChargePath = null;
        try {
        	packagingChargePath = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[7]/div[2]/div/div[4]/div[2]"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Element not found
        	
        }

        if (packagingChargePath != null) {
        	  //WebElement packagingCharge = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[5]/div[2]/div/div[5]/div[2]"));
              String text = packagingChargePath.getText();
              String convertedText = text.replaceAll("[^0-9.]", "");
              packagingChargeValue = Double.parseDouble(convertedText);
              
              if(packagingChargeValue == pc) {
            	  System.out.println("PC validated");
              }
        } else {
        	packagingChargeValue = 0.0;
        }
        
	}
	
	
	public String bill_calculation_and_validation() throws InterruptedException{
		System.out.println("calculation of bil 11111111111111");
        
		String total_bill_calaculated;
		  System.out.println("SST new   " + sst);
	        System.out.println("PC new  " + pc);
	        System.out.println("SC new  " + sc);
	        System.out.println("Discount new    " + discountValue);
	
			total_bill = item_total - discountValue + sst + sc + pc;
		     total_bill_calaculated = String.format("%.2f", total_bill);
		    total_bill = Double.parseDouble(total_bill_calaculated);
		    
		    
		    
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    WebElement sys_bill = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[8]/div[2]/div/div[5]/div[2]"));
		                                                      
		    String text = sys_bill.getText();
	        String convertedText = text.replaceAll("[^0-9.]", "");
	        final_bill_sys = Double.parseDouble(convertedText);
	        
	        if(final_bill_sys == total_bill) {
	        	System.out.println("Bill validated");
	        	 System.out.println("Total bill is " + total_bill);
	        }else {
	        	System.out.println("Bill was mismatched by the diffrence of " + (final_bill_sys - total_bill));
	        	System.out.println("Final bill system " + final_bill_sys);
	        	System.out.println("Total Bill calculated" + total_bill);
	        
		}
		
	    
        	return total_bill_calaculated;
	}
	
}
*/