package org.example;

import org.example.model.Author;
import org.example.model.Book;
import org.example.session_provider.PropertiesSessionProvider;
import org.example.session_provider.SessionProvider;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SessionProvider provider = new PropertiesSessionProvider();
        SessionFactory sessionFactory = provider.getSessionFactory();


        // get all authors
//        try(Session openSession = sessionFactory.openSession()) {
//            Query<Author> query = openSession.createQuery("from Author", Author.class);
//
//            List<Author> authorList = query.list();
//            for (Author author : authorList) {
//                System.out.println(author);
//            }
//        }

        // get one author    getSingleResult()
//        try(Session openSession = sessionFactory.openSession()) {
//            Query<Author> query = openSession.createQuery("from Author where id = 4", Author.class);
//
//           Author author = query.getSingleResult();
//            System.out.println(author);
//        }

        // get all next authors after id = ......scroll.scroll(1)
//        try(Session openSession = sessionFactory.openSession()) {
//            Query<Author> queryAuthors = openSession.createQuery("from Author", Author.class);
//            Query<Book> queryBooks = openSession.createQuery("from Book", Book.class);
//
//            ScrollableResults<Author> scrollAuthors = queryAuthors.scroll();
//            ScrollableResults<Book> scrollBooks = queryBooks.scroll();
//
//            scrollAuthors.scroll(1);
//            scrollBooks.scroll(2);
//
//            while (scrollBooks.next()){
//                Book book = scrollBooks.get();
//                System.out.println(book);
//            }
//
//            while (scrollAuthors.next()){
//                Author author = scrollAuthors.get();
//                System.out.println(author);
//            }
//        }

        // using annotation @ManyToOne and @JoinColumn to get books and authors
//        try(Session openSession = sessionFactory.openSession()) {
//            Query<Book> query = openSession.createQuery("from Book where author.firstName = 'Mark'", Book.class);
//
//            List<Book> bookList = query.list();
//            for (Book book : bookList) {
//                System.out.println(book);
//            }
//        }


        //getting authors from book table using setParameter()
//        try(Session openSession = sessionFactory.openSession()) {
//            Query<Author> query = openSession.createQuery(
//                    "select author from Book where author.firstName = :parameter1 and author.lastName = :parameter2", Author.class
//                    );
//
//            query.setParameter("parameter1", "Mark");
//            query.setParameter("parameter2", "Twain");
//            List<Author> authorList = query.list();
//            for (Author author : authorList) {
//                System.out.println(author);
//            }
//        }


        //getting authors from book table using parameters through Scanner
//        try(Session openSession = sessionFactory.openSession()) {
//            Query<Author> queryThroughScanner = openSession.createQuery(
//                    "select author from Book where author.firstName = :parameter1 and author.lastName = :parameter2", Author.class
//            );
//
//            Scanner scanner = new Scanner(System.in);
//            queryThroughScanner.setParameter("parameter1", scanner.nextLine());
//            queryThroughScanner.setParameter("parameter2", scanner.nextLine());
//            List<Author> authorList = queryThroughScanner.list();
//            for (Author author : authorList) {
//                System.out.println(author);
//            }
//        }

        // getting authors from book table using setParameterList()
//        try(Session openSession = sessionFactory.openSession()) {
//            Query<Author> query = openSession.createQuery(
//                    "select author from Book where author.firstName in (:list)", Author.class
//                    );
//
//            query.setParameterList("list", List.of("Mark", "Stephen"));
//
//            List<Author> authorList = query.list();
//            for (Author author : authorList) {
//                System.out.println(author);
//            }
//        }

        //LIMIT and OFFSET
//        try(Session openSession = sessionFactory.openSession()) {
//            Query<Author> query = openSession.createQuery(
//                    "select author from Book where author.firstName in (:list)", Author.class
//            );
//
//            query.setParameterList("list", List.of("Mark", "Stephen"));
//            query.setFirstResult(1).setMaxResults(2);
//
//            List<Author> authorList = query.list();
//            for (Author author : authorList) {
//                System.out.println(author);
//            }
//        }


        // @createNamedQuery
//        try(Session openSession = sessionFactory.openSession()) {
//            Query<Book> bookPublishedMoreThanOneYear = openSession.createNamedQuery("BookPublishedMoreThanOneYear", Book.class);
//            List<Book> list = bookPublishedMoreThanOneYear.list();
//            for (Book book : list) {
//                System.out.println(book);
//            }
//        }

    }
}