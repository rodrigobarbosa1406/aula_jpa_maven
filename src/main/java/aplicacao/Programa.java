package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa pessoa2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa pessoa3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula_jpa_maven");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(pessoa1);
		em.persist(pessoa2);
		em.persist(pessoa3);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Feito");
	}
}
