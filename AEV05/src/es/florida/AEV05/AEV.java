package es.florida.AEV05;

import java.io.Serializable;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import antlr.collections.List;

public class AEV {

	//	Métode: recuperarTots
	//	Descripció: posar en una llista tots els llibres de la base de dades
	//	Parametres d'entrada: ningún
	//	Parametres d'eixida: els llibres
	public static ArrayList<llibre> recuperarTots(SessionFactory sessionFactory){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		ArrayList <llibre >listaLlibres = new ArrayList<llibre>();
		listaLlibres = (ArrayList) session.createQuery("From llibre").list();
		
		for(int i = 0; i < listaLlibres.size(); i++) {
			llibre llib = (llibre) listaLlibres.get(i);
		}
			
		session.getTransaction().commit();
		session.close();
		return (listaLlibres);
	}
	
	//	Métode: recuperarLlibre
	//	Descripció: mos torna un objecte llibre
	//	Parametres d'entrada: int identificador, SessionFactory sessionFactory
	//	Parametres d'eixida: un llibre nou
	public static llibre recuperarLlibre(int identificador, SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		llibre llibreNou = null;
		ArrayList<llibre>llista = recuperarTots(sessionFactory);
		for (int i = 0; i < llista.size(); i++) {
			int pepe = (llista.get(i).getIdentificador());
			if (identificador == pepe) {
				llibreNou = llista.get(i);
			}
		}
		session.getTransaction().commit();
		session.close();
		return llibreNou;
	}
	
	//	Métode: crearLlibre
	//	Descripció: a partir de la llista creada anyadim un llibre nou
	//	Parametres d'entrada: un llibre, SessionFactory sessionFactory
	//	Parametres d'eixida: el identificador del llibre
	public static int crearLlibre(llibre llibr, SessionFactory sessionFactory) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Serializable id = session.save(llibr);
		
		session.getTransaction().commit();
		session.close();
		return llibr.getIdentificador();
	}
	
	//	Métode: actualitzaLlibre
	//	Descripció: a partir de la llista modifiquem un llibre
	//	Parametres d'entrada: identificador, SessionFactory sessionFactory
	//	Parametres d'eixida: ningún
	public static void actualitzaLlibre(int identificador, SessionFactory sessionFactory) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
				
		Scanner in = new Scanner(System.in);
		llibre llib= (llibre) session.load(llibre.class, identificador);
				
				System.out.println("Dime el titol: ");
				llib.setTitol(in.nextLine());
				
				System.out.println("Dime el autor: ");
				llib.setAutor(in.nextLine());
				
				System.out.println("Dime el Any de naixement: ");
				llib.setAny_naixement(in.nextLine());
				
				System.out.println("Dime el any de publicacio: ");
				llib.setAny_publicacio(in.nextLine());

				System.out.println("Dime la editorial: ");
				llib.setEditorial(in.nextLine());

				System.out.println("Dime el numero de pagines: ");
				llib.setNum_pags(in.nextLine());
		
		session.update(llib);
		
		session.getTransaction().commit();
		session.close();
	}
	
	//	Métode: borrarLlibre
	//	Descripció: a partir de la llista borrem un llibre
	//	Parametres d'entrada: identificador, SessionFactory sessionFactory
	//	Parametres d'eixida: ningún
	public static void borrarLlibre(int identificador, SessionFactory sessionFactory) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		llibre llib = new llibre();
		llib.setIdentificador(identificador);
		session.delete(llib);
		
		session.getTransaction().commit();
		session.close();
	}
	
	//	Métode: main
	//	Descripció: menu per a vore que vol fer l'usuari
	//	Parametres d'entrada: ningún
	//	Parametres d'eixida: ningún
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addClass(llibre.class);
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(registry);
		
		System.out.println("1. Mostrar tots els títols de la biblioteca");
		System.out.println("2. Mostrar informació detallada d'un llibre");
		System.out.println("3. Crear nou llibre");
		System.out.println("4. Actualitzar llibre");
		System.out.println("5. Borrar llibre");
		System.out.println("6. Tanca la biblioteca");
		Scanner in = new Scanner(System.in);
		String opcion = in.nextLine();
		
		switch(opcion) {
			case "1":
				for (int i = 0; i < recuperarTots(sessionFactory).size(); i++) {
					System.out.print("Identificador " + recuperarTots(sessionFactory).get(i).getIdentificador() + ": ");
					System.out.println(recuperarTots(sessionFactory).get(i).getTitol());
				}
				System.exit(0);
				
			case "2":
				in = new Scanner(System.in);
				System.out.print("ID del llibre: ");
				String opcion2 = in.nextLine();
				int opcion3 = Integer.parseInt(opcion2); 
				if (recuperarLlibre(opcion3, sessionFactory) == null) {
					System.out.println("ERROR");
				}else {
					System.out.println("|---------------------------------|");
					System.out.println("  Títol: "+ recuperarLlibre(opcion3, sessionFactory).getTitol());
					System.out.println("  Autor: "+ recuperarLlibre(opcion3, sessionFactory).getAutor());
					System.out.println("  Any de naixement: "+ recuperarLlibre(opcion3, sessionFactory).getAny_naixement());
					System.out.println("  Any de publicacio: "+ recuperarLlibre(opcion3, sessionFactory).getAny_publicacio());
					System.out.println("  Editorial: "+ recuperarLlibre(opcion3, sessionFactory).getEditorial());
					System.out.println("  Número de pàgines: "+ recuperarLlibre(opcion3, sessionFactory).getNum_pags());
				}
				System.exit(0);
				
			case "3":
				in = new Scanner(System.in);
				System.out.println("Dime el titol: ");
				String titol = in.nextLine();
				System.out.println("Dime el autor: ");
				String autor = in.nextLine();
				System.out.println("Dime el any de naixement: ");
				String any_publicacio = in.nextLine();
				System.out.println("Dime el any de publicacio: ");
				String any_naixement= in.nextLine();
				System.out.println("Dime la editorial: ");
				String editorial = in.nextLine();
				System.out.println("Dime el numero de pagines: ");
				String pagines = in.nextLine();
				
				llibre nouLlibre = new llibre(titol, autor, any_naixement, any_publicacio, editorial, pagines);
				crearLlibre(nouLlibre, sessionFactory);
				System.exit(0);
				
			case "4":
				System.out.println("Dime el ID del llibre a canviar: ");
				Integer idCanviar = in.nextInt();
				actualitzaLlibre(idCanviar, sessionFactory); 
				System.exit(0);
				
			case "5":
				System.out.println("Dime el ID del llibre a borrar: ");
				Integer idBorrar = in.nextInt();
				borrarLlibre(idBorrar, sessionFactory);
				System.exit(0);
				
			case "6":
				System.exit(0);

		}
	}

}
