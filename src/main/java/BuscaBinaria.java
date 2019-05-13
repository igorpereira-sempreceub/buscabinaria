
import java.util.List;

public class BuscaBinaria {

	private List<Integer> lista;

	public BuscaBinaria(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getLista() {
		return lista;
	}

	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}

	public int buscar(Integer valor) {
		if(this.lista == null || this.lista.size() == 0) return -1;
		
		this.ordena(0, this.lista.size() - 1);
		return this.buscaBinaria(valor, 0, this.lista.size() - 1);
	}

	private int buscaBinaria(Integer valor, int inicio, int fim) {
		if (inicio > fim)
			return -1;

		int meio = (inicio + fim) / 2;
		int vlr_meio = this.lista.get(meio);

		if (vlr_meio == valor) {
			return meio;
		} else if (vlr_meio < valor) {
			return buscaBinaria(valor, ++meio, fim);
		} else {
			return buscaBinaria(valor, inicio, --meio);
		}

	}

	private void ordena(int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(inicio, fim);
			ordena(inicio, posicaoPivo - 1);
			ordena(posicaoPivo + 1, fim);
		}
	}

	private int separar(int inicio, int fim) {

		int pivo = lista.get(inicio);
		int i = inicio + 1;
		int f = fim;

		while (i <= f) {
			if (lista.get(i) <= pivo) {
				i++;
			} else if (pivo < lista.get(f)) {
				f--;
			} else {
				troca(i, f);
				i++;
				f--;
			}
		}

		lista.set(inicio, lista.get(f));
		lista.set(f, pivo);
		return f;
	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
	}
}
