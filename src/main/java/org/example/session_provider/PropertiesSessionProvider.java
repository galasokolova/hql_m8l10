package org.example.session_provider;

import org.example.model.Author;
import org.example.model.Book;
import org.example.model.Publisher;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PropertiesSessionProvider implements SessionProvider{
    @Override
    public SessionFactory getSessionFactory() {
        return new Configuration()
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Publisher.class)
                .buildSessionFactory();
    }
}
