package com.training.services;

public class Application {

	public static void main(String[] args) {
	
		StringService service = new StringService();
int key = 14;
switch(key) {
case 1:
	service.StringEquals("ram", "ram");
	break;
case 2:
	service.stringObjectEquals();
	break;
case 3:
	service.usingTrim("  rameshss  ");
	break;
case 4:
	service.lengthOfString("       rameshss       ");
	break;
case 5:
	service.usingSubString("ramesh");

	break;
case 6:
	service.usingCharAtAndIndexOf("mahi@com");
	break;
case 7:
	service.usingReplace("ram@abc.com", "welcome");
	break;
case 8:
	service.usingConcat("thas", "hast");
	break;
case 9:
	service.usingCompareTo("Thashi", "Thashi" );
	break;
case 10:
	service.usingStringFormat("thas", 52.31881);
	break;
case 11:
	service.usingStringFormat(12);
	break;
case 12:
	service.usingStringFormat(16,16);
	break;
case 13:
	service.usingStringFormat("thas", "thas");
	break;
case 14:
	service.usingStringFormat(-451L);
	break;
	
	default:
	break;
}
	}

}
