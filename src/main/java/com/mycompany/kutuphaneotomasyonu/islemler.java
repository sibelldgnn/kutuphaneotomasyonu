/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kutuphaneotomasyonu;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.hibernate.HibernateException;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;








public class islemler  {

    
    
         public ArrayList<Kitappkayitt> kitapbilgileriniGetir()
    {   
      
        ArrayList<Kitappkayitt> cikti= new ArrayList<Kitappkayitt>();
        SessionFactory factory = new Configuration() 
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Kitappkayitt.class)
                                               
						.buildSessionFactory();
        
		Session session = factory.getCurrentSession();
         
    Transaction tx = null;

    try {              
			
        tx = session.beginTransaction();
            java.util.List today = session.createQuery(" FROM  Kitappkayitt  ").list();
     for (Iterator iterator = today.iterator(); iterator.hasNext();){
    
        Kitappkayitt Sal = (Kitappkayitt) iterator.next(); 
          
           int ıd= Sal.getId();
            String ad=Sal.getAd().toString();
            String yazar=Sal.getYazar().toString();
           Date tarih= Sal.getTarih();
          String kitabıalan=Sal.getKitabialan();
           
           cikti.add(new Kitappkayitt(ıd, ad, yazar, tarih,kitabıalan));

     }
        tx.commit();
      
    } catch (HibernateException e) {
        if (tx != null) {
            tx.rollback();
        }
        e.printStackTrace();
    } finally {
        session.close();
    }
             return cikti;

       
  			

}
   
      public void Ekle(String ad,String yazar,Date tarih,String kitabialan)
    {
        SessionFactory factory = new Configuration() 
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Kitappkayitt.class)
						.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Kitappkayitt kitappkayitt = new Kitappkayitt(Integer.SIZE, ad, yazar, tarih,kitabialan);
			session.beginTransaction();
			session.save(kitappkayitt);
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
                
                
    }
      
      
        public void EkleUyeGirisi(String email,String parola)
    {
        SessionFactory factory = new Configuration() 
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Uyegirisii.class)
						.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Uyegirisii  uyegirisii = new Uyegirisii(Integer.SIZE, email, parola);
			session.beginTransaction();
			session.save(uyegirisii);
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
              
    }
      
           public void sil(int id, String ad,String yazar,Date tarih,String kitabialan)
    {
        SessionFactory factory = new Configuration() 
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Kitappkayitt.class)
						.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Kitappkayitt kitappkayitt = new Kitappkayitt(id, ad, yazar, tarih,kitabialan);
			session.beginTransaction();
			session.delete(kitappkayitt);
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
                
                
    }
                   public void guncelle(int id,String ad,String yazar,Date tarih,String kitabialan)
    {
        SessionFactory factory = new Configuration() 
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Kitappkayitt.class)
						.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Kitappkayitt kitappkayitt = new Kitappkayitt(id, ad, yazar, tarih,kitabialan);
			session.beginTransaction();
			session.update(kitappkayitt);
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
                
                
    }
                     public  boolean girisyap( String mail,String  parola) 
    { 
         SessionFactory factory = new Configuration() 
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Adminler.class)
						.buildSessionFactory();
		
              System.out.println("In Check login");
			Session session = factory.openSession();
			boolean userFound = false;
			//Query using Hibernate Query Language
			String SQL_QUERY =" from Adminler   as a where a.email=?0 and a.parola=?1";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,mail);
			query.setParameter(1,parola);
			List list = query.list();

			if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}

			session.close();
			return userFound;              
       }

       
     
      
        public void Ekle1(int tc, String ad, String soyad, String email, int telefon,String parola)
    {
        SessionFactory factory = new Configuration() 
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Uyekayitt_1.class)
						.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Uyekayitt_1 uyekayitt=new Uyekayitt_1(Integer.SIZE, tc, ad, soyad, email, telefon,parola);
			session.beginTransaction();
			session.save(uyekayitt);
                       
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
                
                
    }

    
    


}

  

          
			

       
  
