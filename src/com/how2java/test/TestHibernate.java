package com.how2java.test;

import com.how2java.pojo.Category;
import com.how2java.pojo.User;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.how2java.pojo.Product;
import org.hibernate.criterion.Restrictions;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestHibernate {
	public static void main(String[] args) {

//		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//
//		Session s = sf.openSession();
//		s.beginTransaction();
//		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		Session s = sf.openSession();
//		s.beginTransaction();

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();



//		Product p = new Product();
//		p.setName("iphone7");
//		p.setPrice(7000);
//		s.save(p);



//		for (int i = 0; i < 10; i++) {
//			Product p = new Product();
//			p.setName("iphone"+i);
//			p.setPrice(i);
//			s.save(p);
//		}


//		Product product = (Product)s.get(Product.class, 6) ;
//		s.delete(product);
//		System.out.println(product);



//		Product product = (Product)s.get(Product.class, 1) ;
//		product.setName("iphont_update");
//		s.update(product);
//		System.out.println(product);
//		String name = "iphone";
//		Query query = s.createQuery("from Product  where name like ?");
//		query.setString(0, "%"+name+"%");
//		List<Product> lists = query.list();
//		for (Product p :lists){
//			System.out.println(p);
//		}



//		String name = "iphone";
//		Criteria criteria = s.createCriteria(Product.class);
//		criteria.add(Restrictions.like("name", "%"+name+"%"));
//		List<Product> lists = criteria.list();
//		for (Product p : lists){
//			System.out.println(p);
//		}


//		String name = "iphone";
//		String sql = "select * from product_ where name like '%"+ name +"%'";
//		Query query = s.createSQLQuery(sql);
//		List<Object[]> list = query.list();
//		for (Object[] os :list){
//			for (Object file :os){
////				System.out.println(file +"\t");
//				System.out.println(file);
//			}
//			System.out.println();
//		}





//        Category category = new Category();
//        category.setName("c1");
//        s.save(category);
//        Product product = (Product)s.get(Product.class, 8) ;
//        product.setCategory(category);
//        s.update(product);




//        Category category = (Category)s.get(Category.class, 1);
//        Set<Product> ps = category.getProducts();
//        for (Product p :ps){
//            System.out.println(ps);
//        }




//        Set<User> users = new HashSet<>();
//        for (int i = 0; i < 3; i++){
//            User u = new User();
//            u.setName("user" + i);
//            users.add(u);
//            s.save(u);
//        }
//        Product p1 = (Product)s.get(Product.class, 1 );
//        p1.setUsers(users);
//        s.save(p1);


//        Product p = (Product)s.load(Product.class, 1);
//        System.out.println("log1");
//        System.out.println(p.getName());
//        System.out.println("log2");



//        Category category = (Category)s.get(Category.class, 1 );
//        System.out.println("log1");
//        System.out.println(category.getProducts());
//        System.out.println("log2");


//        System.out.println("log1");
//        Category c1 = (Category)s.get(Category.class, 1 );
//        System.out.println("log2");
//        Category c2 = (Category)s.get(Category.class, 1 );
//        System.out.println("log3");


//        Category c1 =(Category)s.get(Category.class, 1 );
//        Category c2 = (Category)s.get(Category.class, 1 );
////        s.getTransaction().commit();
////        s.close();
//        Session s2 = sf.openSession();
//        s2.beginTransaction();
//        Category c3 = (Category)s2.get(Category.class, 1 );
//        s2.getTransaction().commit();
//        s2.close();



//        Category c1 = (Category)s.get(Category.class, 1);
//        System.out.println("log1");
//        Category c2 = (Category)s.get(Category.class, 1);
//        System.out.println("log2");
//        s.getTransaction().commit();
//        s.close();
//        Session s2 = sf.openSession();
//        s2.beginTransaction();
//        Category c3 = (Category)s2.get(Category.class, 1);
//        System.out.println("log3");
//        s2.getTransaction().commit();
//        s2.close();



//        String name ="iphone";
//        Criteria criteria = s.createCriteria(Product.class);
//        criteria.add(Restrictions.like("name", "%"+name+"%" ));
//        criteria.setFirstResult(2);
//        criteria.setMaxResults(4);
//        List<Product> ps = criteria.list();
//        for (Product p :ps){
//            System.out.println(p);
//        }




//        System.out.println("log1");
//        Product p = (Product) s.get(Product.class, 1);
//        System.out.println("log2");
//        Product p2 = (Product) s.load(Product.class, 2);
//        System.out.println("log3");
//        System.out.println(p2.getName());
//        System.out.println("log4");



//        System.out.println("log1");
//        Product p = (Product)s.get(Product.class, 5);
//        System.out.println("log2");
//        Product p2 = (Product)s.load(Product.class, 5);
//        System.out.println("log3");
//
//        Product p3 = (Product)s.get(Product.class, 500);
//        System.out.println("p3="+p3);
//
//        Product p4 = (Product)s.load(Product.class, 500);
//        System.out.println("p3="+p4);




//        Session s2 = sf.openSession();
//
////        s.beginTransaction();
//        s2.beginTransaction();
//
//        Product p1 = (Product) s.get(Product.class, 1);
//        System.out.println("产品原本价格是: " + p1.getPrice());
//
//        p1.setPrice(p1.getPrice() + 1000);
//
//        Product p2 = (Product) s2.get(Product.class, 1);
//        p2.setPrice(p2.getPrice() + 1000);
//
//        s.update(p1);
//        s2.update(p2);
//
//        s.getTransaction().commit();
//        s2.getTransaction().commit();
//
//        Product p = (Product) s.get(Product.class, 1);
//
//        System.out.println("经过两次价格增加后，价格变为: " + p.getPrice());
//
//        s.close();
//        s2.close();





        s.createQuery("from Category ").list();

//		Product product  =null;
//		product.setName("123");
//		product.setPrice(123);
//		s.delete(product);


		s.getTransaction().commit();
		s.close();
		sf.close();
	}

}