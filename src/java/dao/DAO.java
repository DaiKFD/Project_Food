/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Category;
import entity.Food;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class DAO {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Food> getAllProduct() {
        List<Food> foods = new ArrayList<>();
        String query = "SELECT * FROM FOOD";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                foods.add(new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return foods;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Food> foods = dao.getAllProduct();
        List<Category> list = dao.getAllCategory();
        for (Category c : list) {
            System.out.println(c);
        }
    }
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "SELECT * FROM Category";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }
//
//    public Product getLast() {
//        String query = "select top 1 * from product\n"
//                + "order by id desc";
//        try {
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            rs = ps.executeQuery();
//            while(rs.next()){
//                return new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getDouble(4),
//                        rs.getString(5),
//                        rs.getString(6));
//            }
//        } catch (Exception e) {
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        DAO dao = new DAO();
//        List<Product> list = dao.getAllProduct();
//        List<Category> listC = dao.getAllCategory();
//
//        for (Category o : listC) {
//            System.out.println(o);
//        }
//    }
}
