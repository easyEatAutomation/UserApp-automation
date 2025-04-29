package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebBase.WebBase;

public class Bill_completeOrder extends WebBase{
//	public static WebDriver driver;
	
	
	private String getPOSBillDinein() {
		if (currentCountry.equalsIgnoreCase("Malaysia")) {
			return "/html/body/app-root/body/div/div/div[2]/app-order/div/div[3]/div[3]/app-order-right/div/div[2]/div[5]/div[10]/div";
		} else { // Indonesia
			return "/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[9]/div";
		}
	}
	
	
	private String getPOSBillPU() {
		if (currentCountry.equalsIgnoreCase("Malaysia")) {
			return "/html/body/app-root/body/div/div/div[2]/app-order/div/div[3]/div[3]/app-order-right/div/div[2]/div[5]/div[10]/div";
		} else { // Indonesia
			return "/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[9]/div";
		}          
	}
	
	
	public void Bill_validation_on_pos(String final_bill) throws InterruptedException {
		WebElement pos_bill = driver.findElement(By.xpath(getPOSBillDinein()));
        String text = pos_bill.getText();
        String convertedText = text.replaceAll("[^0-9.]", "");
    
        double final_pos_bill= Double.parseDouble(convertedText);
        double final_bill_userApp = Double.parseDouble(final_bill);
        
        if(final_bill_userApp == final_pos_bill) {
            System.out.println("Bill matched successfully");
	}else {
            System.out.println("Bill did not match: ");

	}
	}
	
	public void Bill_validation_on_pos_for_dl_order(String final_bill) throws InterruptedException {
		WebElement pos_bill = driver.findElement(By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[3]/div[3]/app-order-right/div/div[2]/div[5]/div[10]/div"));
        String text = pos_bill.getText();            
        String convertedText = text.replaceAll("[^0-9.]", "");
    
        double final_pos_bill= Double.parseDouble(convertedText);
        double final_bill_userApp = Double.parseDouble(final_bill);
        
        if(final_bill_userApp == final_pos_bill) {
            System.out.println("Bill matched successfully");
	}else {
            System.out.println("Bill did not match: ");

	}
	}
	
	public void Bill_validation_on_pos_for_PU_order(String final_bill) throws InterruptedException {
		WebElement pos_bill = driver.findElement(By.xpath(getPOSBillPU()));
        String text = pos_bill.getText();
        String convertedText = text.replaceAll("[^0-9.]", "");
    
        double final_pos_bill= Double.parseDouble(convertedText);
        double final_bill_userApp = Double.parseDouble(final_bill);
        
        if(final_bill_userApp == final_pos_bill) {
            System.out.println("Bill matched successfully");
	}else {
            System.out.println("Bill did not match: ");

	}
	}
};