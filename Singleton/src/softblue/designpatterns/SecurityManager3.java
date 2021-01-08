package softblue.designpatterns;

public class SecurityManager3 {

	// inicia com a classe
	// desse modo já pode tratar exceções
	
	private static SecurityManager3 instance;

	static {
		try {
			instance = new SecurityManager3();
		} catch (Exception e) {
			// tratar exceção
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
