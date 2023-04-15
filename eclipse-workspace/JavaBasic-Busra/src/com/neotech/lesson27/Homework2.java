package com.neotech.lesson27;

interface WebDriver {
	
	void open(); // by default public and abstract 
	
	
	void close();
	
	
	String getTitle ();
	
}

interface TakesScreenshot {
	
	void getScreenShot();
	
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
	
	void navigate();
	
}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome driver opened");
		
	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed");
		
	}

	@Override
	public String getTitle() {
		
		return "Neotech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot is taken by Chrome");
		
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Chrome");
		
	}
	
}

class FirefoxDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Firefox driver opened");
		
	}

	@Override
	public void close() {
		System.out.println("Firefox driver closed");
		
	}

	@Override
	public String getTitle() {
		
		return "Neotech";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot is taken by Firefox");
		
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Firefox");

		
	}
	
}

class SafariDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Safari driver opened");
		
	}

	@Override
	public void close() {
		System.out.println("Safari driver closed");
		
	}

	@Override
	public String getTitle() {
		
		return "bbb";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot is taken by Safari");
		
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Safari");
		
	}
	
}

public class Homework2 {
	
	public static void main(String[] args) {
		
		ChromeDriver c = new ChromeDriver ();
		c.open();
		c.close();
		c.getTitle();
		c.getScreenShot();
		c.navigate();
		
		System.out.println("----------");
		
		FirefoxDriver f = new FirefoxDriver();
		f.open();
		f.close();
		f.getTitle();
		f.getScreenShot();
		f.navigate();
		
		System.out.println("----------");
		
		SafariDriver s = new SafariDriver();
		s.open();
		s.close();
		s.getTitle();
		s.getScreenShot();
		s.navigate();
		
		System.out.println("----------");
		System.out.println("---Upcasting---");
		
		RemoteWebDriver rwd1 = c;
		rwd1.open();
		
		RemoteWebDriver rwd2 = f;
		rwd2.close();
		
		System.out.println("Why do we need upcasting?");
		
		
		ChromeDriver[] chromeArray = new ChromeDriver[3];
		FirefoxDriver[] firefoxArray = new FirefoxDriver[3];
		
		
		RemoteWebDriver[] remoteArray = new RemoteWebDriver[3];
		remoteArray[0]=c;
		remoteArray[1]=f;
		remoteArray[2]= new SafariDriver();
		
		for (RemoteWebDriver driver : remoteArray) {
			System.out.println("-------");
			driver.open();
			driver.getScreenShot();
			System.out.println(driver.getTitle());
			driver.navigate();
			driver.close();
		}
		
				
		
	}
	
	 

}