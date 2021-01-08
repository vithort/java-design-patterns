package softblue.designpatterns;

public class SecurityManager5 {

	private static SecurityManager5 instance;

	private SecurityManager5() {

	}

	// synchronized: uma thread executa por vez
	// como o synchronized não está no método inteiro, melhora performance

	public static SecurityManager5 getInstance() {
		if (instance == null) {
			synchronized (SecurityManager5.class) {
				// a 2a verificação é para caso ocorra concorrência na primeira execução
				if (instance == null) {
					instance = new SecurityManager5();
				}
			}
		}
		return instance;
	}

	public void login() {

	}

}
