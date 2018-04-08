package br.aula.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.bd.HibernateFactory;
import br.aula.model.Emprestimo;

public class IncludeEmprestimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s = HibernateFactory.configureSessionFactory().openSession();
		
		Emprestimo emprestimo = new Emprestimo();
		
		emprestimo.setDataDevolucao(new Date());
		emprestimo.setDataEmprestimo(new Date());
		
		Transaction t = s.beginTransaction();
		s.save(emprestimo);
		t.commit();
	}
}
