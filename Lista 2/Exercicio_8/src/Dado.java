public class Dado {
	private String dado;

	public Dado(String dado) {
		this.dado = dado;
	}

	private String concatena(int[] vetor) {
		String fim = "";
		for (int i = 0; i < vetor.length; i++) {
			fim = fim + vetor[i];
		}
		return fim;
	}

	public void criptografar() {
		try {
			int j = 1;
			int[] dadofinal = new int[4];
			for (int i = 0; i < 4; i++) {
				int dig = Integer.parseInt(dado.substring(i, j));
				dadofinal[i] = (dig + 7) % 10;
				j++;
			}
			int troca = dadofinal[0];
			dadofinal[0] = dadofinal[2];
			dadofinal[2] = troca;
			troca = dadofinal[1];
			dadofinal[1] = dadofinal[3];
			dadofinal[3] = troca;
			this.dado = concatena(dadofinal);
		} catch (Exception e) {
			System.out.println("Erro!!! Insira um inteiro válido " + e);
		}
	}

	public void descriptografar() {
		int j = 1;
		int[] dadoretorno = new int[4];
		int[] dadofinal = new int[4];
		for (int i = 0; i < 4; i++) {
			dadoretorno[i] = Integer.parseInt(dado.substring(i, j));
			j++;
		}
		int troca = dadoretorno[2];
		dadoretorno[2] = dadoretorno[0];
		dadoretorno[0] = troca;
		troca = dadoretorno[3];
		dadoretorno[3] = dadoretorno[1];
		dadoretorno[1] = troca;
		for (int i = 0; i < 4; i++) {
			int num = 0;
			while( dadoretorno[i] != ((num + 7) % 10) ) {
				num++;
			}
			dadofinal[i] = num;
		}
		this.dado = concatena(dadofinal);
	}

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}
}
