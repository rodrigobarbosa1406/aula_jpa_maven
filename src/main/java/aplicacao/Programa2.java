package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula_jpa_maven");
		EntityManager em = emf.createEntityManager();
		
		Pessoa pessoa = em.find(Pessoa.class, 2);
		
		System.out.println(pessoa);
		
		em.close();
		emf.close();
		
		System.out.println("Feito");
	}
}