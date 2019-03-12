package org.spiders;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spiders.HibernateUtil;

public class Runner {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Tree mangoTree = new Tree();
		mangoTree.setTreeName("mango tree");
		mangoTree.setAge(40);

		List<Fruits> fruits = new ArrayList<Fruits>();

		Fruits mangoFruit1 = new Fruits();
		mangoFruit1.setColor("yello");
		mangoFruit1.setNoOfSeeds(1);

		Fruits mangoFruit2 = new Fruits();
		mangoFruit2.setColor("green yello");
		mangoFruit2.setNoOfSeeds(1);

		Fruits mangoFruit3 = new Fruits();
		mangoFruit3.setColor("green");
		mangoFruit3.setNoOfSeeds(1);

		fruits.add(mangoFruit1);
		fruits.add(mangoFruit2);
		fruits.add(mangoFruit3);

		mangoTree.setFruits(fruits);

		session.save(mangoTree);

		transaction.commit();

	}
}
