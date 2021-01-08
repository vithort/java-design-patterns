package softblue.designpatterns;

public class SecurityManager4 {

	private static SecurityManager4 instance;

	private SecurityManager4() {

	}

	// synchronized: uma thread executa por vez
	// perde desempenho
	
	public synchronized static SecurityManager4 getInstance() {
		if (instance == null) {
			instance = new SecurityManager4();
		}
		return instance;
	}

	public void login() {

	}

}
