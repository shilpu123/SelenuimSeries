package selenuimsession;

public class WaitiInSelenium {

	public static void main(String[] args) {
	//script -----app---Sync Concpet: both script and app should in sync
		//script -----slow/fast/very slw beacuse of network issue or any other reasons or specific elemenr is taing time
		//default time : we get no element expection
		//types of wait:
		//1.Static Wait: simple pause , Thread.sleep(5000): problem 
		//2.dynamic wait : 10 secs---2 sec--8 sec will be ignored 
			//2a.Implicitly Wait :Global wait for all the elements 
			//2b.Explicit Wait : on a specific element +polling/interval time +non web elements 
				//1.WebDriverWait
				//2.FluentWait
		
		//WebDriverWait(c)---->FluentWait(c)--->Wait(I):until();
		//						//until(){}
								//other methods{}
		//Wait Heriracy 
		

	}

}
