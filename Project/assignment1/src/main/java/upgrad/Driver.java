package upgrad;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.*;

public class Driver {

    /**
     * Driver class main method
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        // MySql credentials
        String url = "jdbc:mysql://pgc-sd-bigdata.cyaielc9bmnf.us-east-1.rds.amazonaws.com:3306/pgcdata";
        String user ="student";
        String password="STUDENT123";

        // MongoDB Configurations
        String dBName = "upgrad";
        String connectionString ="mongodb://ec2-18-205-160-218.compute-1.amazonaws.com";
        String collectionName = "Products";

        // Connection Default Value Initialization
        Connection sqlConnection = null;
        MongoClient mongoClient = null;



        try {
            // Creating database connections
            sqlConnection = DriverManager.getConnection(url,user,password);
            mongoClient = MongoClients.create(connectionString);
            // Import data into MongoDb
            MongoDatabase db = mongoClient.getDatabase(dBName);
            MongoCollection<Document> Products = db.getCollection(collectionName);
            Mobiledata(sqlConnection,Products);
            Cameradata(sqlConnection,Products);
            headphonedata(sqlConnection,Products);
            // List all products in the inventory
            CRUDHelper.displayAllProducts(Products);
            // Display top 5 Mobiles
            CRUDHelper.displayTop5Mobiles(Products);
            // Display products ordered by their categories in Descending Order Without autogenerated Id
            CRUDHelper.displayCategoryOrderedProductsDescending(Products);
            // Display product count in each category
            CRUDHelper.displayProductCountByCategory(Products);
            // Display wired headphonesCRUDHelper.displayWiredHeadphones(Products);
        }
        catch(Exception ex) {
            System.out.println("Got Exception.");
            ex.printStackTrace();
        }
        finally {
            // Close Connections
            sqlConnection.close();
            mongoClient.close();

        }
    }


    private static void Mobiledata(Connection sqlConnection,MongoCollection<Document> products) throws SQLException {
        Statement statement = sqlConnection.createStatement();
        String query = "select * from mobiles";
        ResultSet resultSet = statement.executeQuery(query);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();


        while(resultSet.next()) {
            Document document = new Document();
            for(int i = 1; i < resultSetMetaData.getColumnCount(); i++) {
                document.append(resultSetMetaData.getColumnName(i), resultSet.getString(resultSetMetaData.getColumnName(i)));
                document.append("Category","mobiles");
            }
            products.insertOne(document);
        }

        statement.close();
    }

    private static void Cameradata(Connection sqlConnection, MongoCollection<Document> products) throws SQLException {

        Statement statement = sqlConnection.createStatement();
        String query = "select * from cameras";
        ResultSet resultSet = statement.executeQuery(query);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();


        while(resultSet.next()) {
            Document document = new Document();
            for(int i = 1; i < resultSetMetaData.getColumnCount(); i++) {
                document.append(resultSetMetaData.getColumnName(i), resultSet.getString(resultSetMetaData.getColumnName(i)));
                document.append("Category","Cameras");
            }
            products.insertOne(document);
        }

        statement.close();
    }
    private static void headphonedata(Connection sqlConnection, MongoCollection<Document> products) throws SQLException {


        Statement statement = sqlConnection.createStatement();
        String query = "select * from headphones";
        ResultSet resultSet = statement.executeQuery(query);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();


        while(resultSet.next()) {
            Document document = new Document();
            for(int i = 1; i < resultSetMetaData.getColumnCount(); i++) {
                document.append(resultSetMetaData.getColumnName(i), resultSet.getString(resultSetMetaData.getColumnName(i)));
                document.append("Category","Headphones");
            }
            products.insertOne(document);
        }

        statement.close();
    }

}