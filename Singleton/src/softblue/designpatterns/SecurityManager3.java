package softblue.designpatterns;

public class SecurityManager3 {

	// inicia com a classe
	// desse modo j� pode tratar exce��es
	
	private static SecurityManager3 instance;

	static {
		try {
			instance = new SecurityManager3();
		} catch (Exception e) {
			// tratar exce��o
		}
	}

	private SecurityManager3() {

	}

	public static SecurityManager3 getInstance() {
		return instance;
	}

	public void login() {

	}

}
