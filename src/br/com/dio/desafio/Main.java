/**
 * 
 */
package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

/**
 * @author sa
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setTitulo("Curso java");
		curso.setDescricao("java");
		curso.setCargaHoraria(8);
		
		Curso curso01 = new Curso();
		curso01.setTitulo("Curso javascript");
		curso01.setDescricao("javascript");
		curso01.setCargaHoraria(6);
		
		Mentoria mentoria = new Mentoria(LocalDate.now());
		mentoria.setDescricao("oioi");
		mentoria.setTitulo("Java");
		mentoria.setData(LocalDate.now());
		
		//Polimorfismo
		Conteudo mentoria01 = new Mentoria();
		
		System.out.println(curso);
		System.out.println(curso01);
		System.out.println(mentoria);

	}

}
