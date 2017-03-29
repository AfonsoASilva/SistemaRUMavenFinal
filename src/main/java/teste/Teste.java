package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Usuario;

public class Teste {

	public static void main(String[] args) {
				
		
		Usuario user = new Usuario();
		
		user.setNome("super");

		EntityManagerFactory  facoty = Persistence.createEntityManagerFactory("sistema_ru");
		EntityManager manager = facoty.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try{
			
			transaction.begin();
			manager.persist(user);
			transaction.commit();	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim");
	}

}
