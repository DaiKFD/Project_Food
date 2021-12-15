/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
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
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12)));
            }
        } catch (Exception e) {
        }
        return foods;
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
                        rs.getString(2), rs.getString(3)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Food> getLast() {
        List<Food> list = new ArrayList<>();
        String query = "select top 3 * from Food\n"
                + "order by FoodID desc";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Category> getCategoryByID(int cid) {
        List<Category> list = new ArrayList<>();
        String query = "select * from Category\n"
                + "where CategoryID = ?";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Category getOneCategoryByID(int cid) {
        String query = "select * from Category\n"
                + "where CategoryID = ?";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Category(rs.getInt(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Food> searchByName(String txtSearch) {
        List<Food> list = new ArrayList<>();
        String query = "select * from Food\n"
                + "where [FoodName] like ?";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12)));
            }
        } catch (Exception e) {
        }
        return list;
    }
//

    public List<Food> getFoodByCID(int id) {
        List<Food> list = new ArrayList<>();
        String query = "select * from Food\n"
                + "where CategoryID = ?";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12)));
            }
        } catch (Exception e) {
        }
        return list;
    }

//SORT    
    public List<Food> SortFoodByPriceCID(int id) {
        List<Food> list = new ArrayList<>();
        String query = "SELECT * FROM Food WHERE CategoryID = ?\n"
                + "ORDER BY FoodPrice";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getInt(13)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Food> SortFoodByPrice() {
        List<Food> list = new ArrayList<>();
        String query = "SELECT * FROM Food\n"
                + "ORDER BY FoodPrice";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            ps.executeQuery();
            while (rs.next()) {
                list.add(new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getInt(13)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Food getFoodByID(int id) {
        String query = "select * from Food\n"
                + "where FoodID = ?";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12));
            }
        } catch (Exception e) {
        }
        return null;
    }
// User,account,login,register

    public Account login(String user, String pass) {
        String sql = "SELECT * FROM Account WHERE userName = ? AND password = ?";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Account> getAllAccount() {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM Account";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                accounts.add(new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return accounts;
    }

    public Account checkAccountExist(String user) {
        String sql = "SELECT * FROM Account WHERE userName = ?";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void signUp(String user, String pass) {
        DAO dao = new DAO();
        int max = 0;
        List<Account> accounts = dao.getAllAccount();
        for (Account a : accounts) {
            if (a.getUid() > max) {
                max = a.getUid();
            }
        }
        String sql = "INSERT INTO Account ([Uid]\n"
                + "           ,[userName]\n"
                + "           ,[password]\n"
                + "           ,[isSell]\n"
                + "           ,[isAdmin]) VALUES(" + ++max + ",?,?,0,0)";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //Manage Food
    public List<Food> getFoodBySellID(int id) {
        List<Food> list = new ArrayList<>();
        String query = "select * from Food\n"
                + "where SellID = ?";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getInt(13)));
            }
        } catch (Exception e) {
        }
        return list;
    }
//Them ,sua,xoa

    public void deleteFood(int id) {
        String sql = "DELETE FROM Food WHERE FoodID = ?";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
//  int fid = Integer.parseInt(request.getParameter("fid"));
//        String fname = request.getParameter("name");
//        String fimage = request.getParameter("url");
//        String price = request.getParameter("price");
//        String des = request.getParameter("descrip");
//        String sanco = request.getParameter("avail");
//        String weight = request.getParameter("weight");
//        String category = request.getParameter("cate");

    public void insertFood(int fid, String fname, String fimage, String price, String des, String sanco, String weight, String category, int sid) {
        String sql = "INSERT INTO [dbo].[Food]\n"
                + "           ([FoodID]\n"
                + "           ,[FoodName]\n"
                + "           ,[FoodImage]\n"
                + "           ,[FoodPrice]\n"
                + "           ,[FoodDescription]\n"
                + "		   ,[CategoryID]\n"
                + "           ,[FoodAvailability]\n"
                + "           ,[FoodWeight],\n"
                + "		   [SellID])\n"
                + "     VALUES(?,?,?,?,?,?,?,?,?)\n";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(sql);
            ps.setInt(1, fid);
            ps.setString(2, fname);
            ps.setString(3, fimage);
            ps.setString(4, price);
            ps.setString(5, des);
            ps.setString(6, sanco);
            ps.setString(7, weight);
            ps.setString(8, category);
            ps.setInt(9, sid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void UpdateFood(int fid, String fname, String fimage, String price, String des, String sanco, String weight, String category, int sid) {
        String sql = "UPDATE [dbo].[Food] SET\n"
                + "           [FoodID] = ?\n"
                + "           ,[FoodName] = ?\n"
                + "           ,[FoodImage] = ?\n"
                + "           ,[FoodPrice] = ?\n"
                + "           ,[FoodDescription] = ?\n"
                + "		   ,[CategoryID] = ?\n"
                + "           ,[FoodAvailability] = ?\n"
                + "           ,[FoodWeight] = ?,\n"
                + "		   [SellID] = ?\n"
                + "     WHERE [FoodID] = ?";
        try {
            connection = new DBContext().getConnection();//mo ket noi voi sql
            ps = connection.prepareStatement(sql);
            ps.setInt(1, fid);
            ps.setString(2, fname);
            ps.setString(3, fimage);
            ps.setString(4, price);
            ps.setString(5, des);
            ps.setString(6, sanco);
            ps.setString(7, weight);
            ps.setString(8, category);
            ps.setInt(9, sid);
            ps.setInt(10, fid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
//test

    public static void main(String[] args) {
        DAO dao = new DAO();
        Account list = dao.login("daikfd", "1234");

        System.out.println(list);

    }
}
