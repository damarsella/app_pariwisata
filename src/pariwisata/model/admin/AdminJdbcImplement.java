package pariwisata.model.admin;

import Koneksi.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author Khanza
 */
public class AdminJdbcImplement implements AdminJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(AdminJdbcImplement.class);

    public AdminJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public List<Admin> selectAll() {
        List<Admin> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM admin";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Admin admin = new Admin();
                admin.setId(resultSet.getLong("id"));
                admin.setNama(resultSet.getString("nama"));
                admin.setUser(resultSet.getString("user"));
                admin.setPassword(resultSet.getString("password"));
                admin.setRole(resultSet.getString("role"));
                response.add(admin);
            }
            resultSet.close();
            preparedStatement.close();
            logger.debug(response.toString());
            return response;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            logger.error(e.getMessage());
            return null;
        }
    }

    @Override
    public void insert(Admin request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO pengunjung (nama, alamat) VALUES(?, ?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, request.getNama());
            preparedStatement.setString(2, request.getUser());
            preparedStatement.setString(3, request.getPassword());
            preparedStatement.setString(4, request.getRole());
            preparedStatement.setLong(5, request.getId());
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Admin request) {
        logger.debug(request.toString());
        try {
            sql = "UPDATE admin SET nama=?, alamat=? WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);            
            preparedStatement.setString(1, request.getNama());
            preparedStatement.setString(2, request.getUser());
            preparedStatement.setString(3, request.getPassword());
            preparedStatement.setString(4, request.getRole());
            preparedStatement.setLong(5, request.getId());
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            logger.error(e.getMessage());
        }
    }

    @Override
    public void delete(Long request) {
        logger.debug(request.toString());
        try {
            sql = "DELETE FROM admin WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request);
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
