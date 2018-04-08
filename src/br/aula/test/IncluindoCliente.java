package br.aula.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.aula.bd.HibernateFactory;
import br.aula.model.Cliente;

public class IncluindoCliente {
public static void main(String[] args) {
		
		Session s = HibernateFactory.configureSessionFactory().openSession();

		Cliente cliente = new Cliente();
		cliente.setNome("napoleao bonaparte");
		cliente.setDataNascimento(new Date());
		cliente.setEndereco("birigui");
		cliente.setEmail("a@a.com");

		Transaction t = s.beginTransaction();
		s.save(cliente);
		t.commit();
	}
}
