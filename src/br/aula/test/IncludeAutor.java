package br.aula.test;

import org.hibernate.Transaction;

import org.hibernate.Session;

import br.aula.bd.HibernateFactory;
import br.aula.model.Autor;

public class IncludeAutor {
	public static void main(String[] args) {
		
		Session s = HibernateFactory.configureSessionFactory().openSession();
		
		Autor autor = new Autor();
		
		autor.setNome("Andrzej Sapkowski");
		
		Transaction t = s.beginTransaction();
		s.save(autor);
		t.commit();
	}
}
