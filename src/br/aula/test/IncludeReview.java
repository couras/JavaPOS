package br.aula.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.bd.HibernateFactory;
import br.aula.model.Review;

public class IncludeReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session s = HibernateFactory.configureSessionFactory().openSession();
		
		Review review = new Review();
		
		review.setAvaliacao(5);
		review.setComentario("que beleza, que legal");
		
		Transaction t = s.beginTransaction();
		s.save(review);
		t.commit();
	}

}
