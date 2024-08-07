package selenuimsession;

import org.openqa.selenium.By;

public class CustomCssSelector {

	public static void main(String[] args) {

		// id:
		// #id
		By fn = By.cssSelector("#input-firstname");

		// tag#id
		// input#input-firstname
		
		// class
		// .class
		//.form-control
		//.login-email
		
		//tag.class
		//input.form-control
		//input.login-email
		//button.login-submit
		
		// .c1.c2.c3...cn -->hubspot.com
		//.form-control.private-form__control.login-email
		//tag.c1.c2.c3
		//tag.form-control.private-form__control.login-email
		
		//input.form-control.login-email
		
		//tag#id.class
		//input#username.login-email
		
		//tag.class#id
		//input.login-email#username
		
		//#id.class
		//#username.login-email
		
		//.class#id
		//.login-email#username
		
		//tag.c1.c2.c3...cn#id
		//input.form-control.private-form__control.login-email#username
		//input#username.form-control.private-form__control.login-email
		
		//htmltag[attr='value]
		//input[id='username']
		
		//htmltag[attr1='value'][attr2='value]
		//input[id='username'][type='email']
		
		//input[id*='user']----contains
		//input[id*='user']
		//input[class*='login-email']
		
		//input[name^='user']---starts with
		//input[id^='user']
		//div[data-test-id^='remember-me']
		
		//input[name$='name'] ---ends with 
		//input[aria-labelledby$='label-2'] 	
		
		//parent to child
		// tagname.class childtagname
		//div.private-form__input-wrapper input
		//div.private-form__input-wrapper > input
		
		// form#hs-login div --20 (direct+indirect)
		// form#hs-login > div --8 (only direct)
		
		//child to parent : not allowed
		//backward travesring 
		
		//or-comma in css:(combine 2 htmltag in css)
		//input#username,input#password,button#loginBtn,button#ssoBtn
		//FE(s).size()---->4
		
		
		//not in css
		//input.form-control:not(input[name='password'],input[name='firstname'])
		
		//indexing:
		//select#Form_getForm_Country > option:first-child
		//select#Form_getForm_Country > option:last-child
		
		//	select#Form_getForm_Country > option:first-of-type
		//select#Form_getForm_Country > option:last-of-type
		
		//select#Form_getForm_Country > :last-of-type
	//	select#Form_getForm_Country > :first-child
		
		//select#Form_getForm_Country > :nth-of-type(12)
		//select#Form_getForm_Country > option:nth-of-type(19)
		
		
		           //xpath        vs          css
	//1.syntax:    complex					simple
	//2.text        yes						n	o
	//3. and 		yes							yes
	//4.or           yes                      yes with comma
	//5.forward travesring yes 					yes
	//6.backward     yes 						no
	//7.forward sibling yes  					yes
	//8.backward sibling yes                  NO
	//9. not:            no 						Yes
	//10.index      yes 						no
	//11.capture group yes 							no
	//12peformance : slower depends on browser how the engine is desinged 
		
		//every browser have thier on xpath engine : xpath and css are almost same : xpath we can solve complex to complex solution 
		
	//13starts with   Yes 						yes
		
	//14contains    yes 								yes
		
	//15ends-wuth  	no     						yes
	//16webtable     easy                 Limoited 
		
		
		//siblings in css 
		//label[for='input-email']+input[name='email']  ---+--> for immediate sibling  ---1 
		//div#Form_getForm_subdomain_Holder~div  ---> it gives immediate and forward sibling 
		
	}

}
