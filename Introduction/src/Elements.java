import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Elements extends JavaBasics{
	
	public void alertAccept()
	{
		Alert alert = d.switchTo().alert();
		String alertMessage = d.switchTo().alert().getText();
		alert.accept();

	}
	
	public void alertDismiss()
	{
		Alert alert = d.switchTo().alert();
		String alertMessage = d.switchTo().alert().getText();
		alert.dismiss();

	}
	public void getCurrentUrl()
	{
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());

	}
	

}
