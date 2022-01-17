/**
 * 
 */
package br.com.dio.desafio.dominio;

/**
 * @author sa
 *
 */
public class Curso {
	
	private String titulo;
	private String descrição;
	private int cargaHoraria;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Curso(String titulo, String descrição, int cargaHoraria) {
		super();
		this.titulo = titulo;
		this.descrição = descrição;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descrição=" + descrição + ", cargaHoraria=" + cargaHoraria + "]";
	}

	
}
