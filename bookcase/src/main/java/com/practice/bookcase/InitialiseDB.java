package com.practice.bookcase;

import org.sqlite.SQLiteConfig;

import java.sql.*;
import java.util.ArrayList;

@SuppressWarnings("Duplicates")

public class InitialiseDB {

    public static void main(String[] args) {
        InitialiseDB initDB = new InitialiseDB();
        initDB.connectDB();
        initDB.createTables(initDB.connectDB());
    }

    private Connection connectDB() {
        Connection con = null;

        try {
            Class.forName("org.sqlite.JDBC");
            SQLiteConfig config = new SQLiteConfig();
            config.enforceForeignKeys(true);
            con = DriverManager.getConnection("jdbc:sqlite:" +
                    "C:/Users/Danilo/DevAcademy/bookcase/lib/BooksDatabase.db",
                    config.toProperties());
        } catch (Exception ex) {
            System.out.println(ex.getClass());
            ex.printStackTrace();
        }
        return con;
    }

    public Connection getDBConnection(){
        Connection con = connectDB();
        createTables(con);
        return con;
    }

    private void createTables(Connection con){
        try {
            Statement stmnt = con.createStatement();
            String createBooksTable = "CREATE TABLE IF NOT EXISTS tblBooks " +
                    "(book_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "book_title TEXT NOT NULL, " +
                    "book_author TEXT NOT NULL, " +
                    "book_released TEXT NOT NULL, " +
                    "book_blurb TEXT NOT NULL, " +
                    "book_cover TEXT NOT NULL)";
            stmnt.executeUpdate(createBooksTable);
        } catch (Exception ex) {
            System.out.println(ex.getClass());
            ex.printStackTrace();
        }
    }

    public ArrayList<Book> getBooks(Connection con){

        ArrayList<Book> books = new ArrayList<>();
        Statement stmnt = null;

        try {
            String getBooksQuery = "SELECT * FROM tblBooks";
            stmnt = con.createStatement();
            ResultSet rs = stmnt.executeQuery(getBooksQuery);

            while (rs.next()) {
                Book book = new Book();
                book.setBookID(rs.getInt("book_id"));
                book.setBookTitle(rs.getString("book_title"));
                book.setBookAuthor(rs.getString("book_author"));
                book.setBookYear(rs.getString("book_released"));
                book.setBookBlurb(rs.getString("book_blurb"));
                book.setCoverURL(rs.getString("book_cover"));

                books.add(book);
            }
        } catch (SQLException ex){
            System.out.println(ex.getClass());
            ex.printStackTrace();
        }finally {
            try {
                stmnt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return books;
    }
}
