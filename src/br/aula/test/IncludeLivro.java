package br.aula.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.bd.HibernateFactory;
import br.aula.model.Autor;
import br.aula.model.Cliente;
import br.aula.model.Livro;

public class IncludeLivro {
	
	public static void main(String[] args) {
		
		Session s = HibernateFactory.configureSessionFactory().openSession();

		Livro livro = new Livro();
		//Autor autor = (Autor) s.get(Autor.class, 3l);
		Autor autor = new Autor();
		autor.setNome("J. K. Rollings");
		
		livro.setTitulo("Harry Potta");
		livro.setFoto("/images/livro003.jpg");
		livro.setQuantidade(1);
		livro.setAutor(autor);

		Transaction t = s.beginTransaction();
		s.save(livro);
		t.commit();
		
	}
}
