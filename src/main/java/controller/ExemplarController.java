package controller;

import java.util.ArrayList;

import model.bo.ExemplarBO;
import model.bo.LivroBO;
import model.seletor.ExemplarSeletor;
import model.seletor.LivroSeletor;
import model.vo.Exemplar;
import model.vo.Livro;

public class ExemplarController {
	
	private Exemplar exemplar;
	private ExemplarBO exemplarBO = new ExemplarBO();

	public void salvarExemplar(Livro livro, String quantidade, boolean status) {

		exemplarBO.salvar(livro, quantidade, status);
    
    }
	
	public ArrayList<Exemplar> consultarExemplarLivroSeletor(LivroSeletor livroSeletor) {
		return exemplarBO.consultarExemplarLivroSeletor(livroSeletor);
		//TODO retornar todos os livros selecionando apenas o ano
		
	}
	
	public Exemplar consultarExemplar(int id) {
		return exemplarBO.consultarExemplar(id);
    }
	
}