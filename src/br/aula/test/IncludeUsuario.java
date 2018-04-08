package br.aula.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.bd.HibernateFactory;
import br.aula.model.Usuario;

public class IncludeUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s = HibernateFactory.configureSessionFactory().openSession();
		
		Usuario usuario = new Usuario();
		
		usuario.setEmail("deniscouras@gmail.com");
		usuario.setPassword("senha");
		usuario.setUserName("usuario");
		
		Transaction t = s.beginTransaction();
		s.save(usuario);
		t.commit();
	}

}
