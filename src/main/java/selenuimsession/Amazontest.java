package selenuimsession;

public class Amazontest {

	public static void main(String[] args) {
		
		String browsername = "chrome";

		BrowserUtil brutil= new BrowserUtil();
		brutil.initDriver(browsername);
		brutil.launchUrl("https://www.amazon.com");
		
		String actTitle = brutil.getpageTitle();
		if(actTitle.contains("Amazon")) {
			System.out.println("title---pasas");
		}
		else {
			System.out.println("fail");
		}
    String acturl =brutil.getPageUrl();
    	if(actTitle.contains("Amazon")) {
			System.out.println("url---pasas");
		}
		else {
			System.out.println("url fail");
		}
    	brutil.quitBrowser();
    }
	}
	


