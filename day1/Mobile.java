package week1.day1;

public class Mobile {
       
	  public void sendMessage() {
		  System.out.println("Send the message");
	}
	  public void shareDocument() {
		  System.out.println("Share the document");
	}
	  public void call() {
		  System.out.println("Call");
	}
	  public static void main(String[] args) {
		Mobile obj=new Mobile();
				obj.sendMessage();
				obj.shareDocument();
				obj.call();
	}
}
