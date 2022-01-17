/**
 * 
 */
package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.Set;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

		Mentoria mentoria = new Mentoria(LocalDate.now());
		mentoria.setDescricao("oioi");
		mentoria.setTitulo("Java");
		mentoria.setData(LocalDate.now());

		Curso curso01 = new Curso();
		curso01.setTitulo("Curso javascript");
		curso01.setDescricao("javascript");
		curso01.setCargaHoraria(6);

		// Polimorfismo
		Conteudo mentoria01 = new Mentoria();

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java");
		bootcamp.setDescricao("Java developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso01);
		bootcamp.getConteudos().add(mentoria01);

		Dev dev = new Dev();
		dev.setNome("João");
		dev.inscreverBootcamp(bootcamp);		
		Dev dev01 = new Dev();
		dev01.setNome("Maria");
		dev01.inscreverBootcamp(bootcamp);
		
		System.out.println(dev.getConteudoInscritos());
		dev.progredir();
		dev.progredir();
		System.out.println(dev.getConteudoConcluido());
		System.out.println("XP:" + dev.calcularTotalXP());
		
		System.out.println(dev01.getConteudoInscritos());
		dev01.progredir();
		System.out.println(dev01.getConteudoConcluido());
		System.out.println("XP:" + dev01.calcularTotalXP());

	}

}
