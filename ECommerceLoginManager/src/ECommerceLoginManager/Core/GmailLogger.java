package ECommerceLoginManager.Core;

public class GmailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println(message + " Gmailinize do�rulama linki g�nderilmi�tir.");
		
	}

}
