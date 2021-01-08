package softblue.designpatterns;

public class SecurityManager2 {

	// inicia com a classe
	// ocupa mais espa�o em mem�ria
	// n�o pode tratar exce��es
	
	private static SecurityManager2 instance = new SecurityManager2();

	private SecurityManager2() {

	}

	public static SecurityManager2 getInstance() {
		return instance;
	}

	public void login() {

	}

}
