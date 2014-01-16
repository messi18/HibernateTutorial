package org.hibernate.tutorial;

import org.hibernate.Session;
import org.hibernate.tutorial.util.HibernateUtil;

import java.util.Date;

/**
 * Created by malance on 14-1-16.
 */
public class EventManager {
    public static void main(String[] args) {
        EventManager mgr = new EventManager();

        if (args[0].equals("store")) {
            mgr.createAndStoreEvent("My Event", new Date());
        }

        HibernateUtil.getSessionFactory().close();
    }

    private void createAndStoreEvent(String title, Date theDate) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        org.hibernate.tutorial.domain.Event theEvent = new org.hibernate.tutorial.domain.Event();
        theEvent.setTitle(title);
        theEvent.setDate(theDate);
        session.save(theEvent);

        session.getTransaction().commit();
    }

}
