package br.aula.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.aula.bd.HibernateFactory;
import br.aula.model.Livro;

public class ListandoLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s = HibernateFactory.configureSessionFactory().openSession();
		
		Query query = s.createQuery("from Livro l where l.autor.idAutor = :id");
		query.setLong("id", 4l);
		List<Livro> livros = query.list();
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " - " + livro.getAutor().getNome());
		}
	}

}
