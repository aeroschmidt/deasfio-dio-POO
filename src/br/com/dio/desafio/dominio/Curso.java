/**
 * 
 */
package br.com.dio.desafio.dominio;

/**
 * @author sa
 *
 */
public class Curso extends Conteudo {

	private int cargaHoraria;

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Curso(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Curso() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", Titulo=" + getTitulo() + ", Descricao="
				+ getDescricao() + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

}
