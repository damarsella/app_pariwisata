package pariwisata.model.transaksi;

import Koneksi.Conn;
import java.sql.Connection;
import java.sql.Date;
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
public class TransaksiJdbcImplement implements TransaksiJdbc {

    private final Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String sql;
    private static final Logger logger = Logger.getLogger(TransaksiJdbcImplement.class);

    public TransaksiJdbcImplement() {
        connection = Conn.getConnection();
    }

    @Override
    public List<Transaksi> selectAll() {
        List<Transaksi> response = new ArrayList<>();
        try {
            sql = "SELECT * FROM paket_wisata";
            preparedStatement = connection.prepareStatement(sql);
            logger.debug(preparedStatement.toString());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Transaksi transaksi = new Transaksi();
                transaksi.setId(resultSet.getLong("id"));
                transaksi.setId_wisata(resultSet.getInt("id_wisata"));
                transaksi.setPaket_wisata(resultSet.getString("paket_wisata"));
                transaksi.setHarga_wisata(resultSet.getInt("harga_wisata"));
                transaksi.setVia_pembayaran(resultSet.getString("via_pembayaran"));
                transaksi.setId_penginapan(resultSet.getInt("id_penginapan"));
                transaksi.setNama_penginapan(resultSet.getString("nama_penginapan"));
                transaksi.setId_pengunjung(resultSet.getInt("id_pengunjung"));
                transaksi.setNama_pengunjung(resultSet.getString("nama_pengunjung"));
                transaksi.setDeskripsi_makanan_minuman(resultSet.getString("deskripsi_makanan_minuman"));
                transaksi.setDeskripsi_tambahan(resultSet.getString("deskripsi_tambahan"));
                transaksi.setDari(resultSet.getDate("dari"));
                transaksi.setSampai(resultSet.getDate("sampai"));
                transaksi.setTotal_tanggal(resultSet.getInt("total_tanggal"));
                
                response.add(transaksi);
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

    /**
     *
     * @param request
     */
    @Override
    public void insert(Transaksi request) {
        logger.debug(request.toString());
        try {
            sql = "INSERT INTO paket_wisata (nama) VALUES(?);";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request.getId());
            preparedStatement.setInt(2, request.getId_wisata());
            preparedStatement.setString(3, request.getPaket_wisata());
            preparedStatement.setInt(4, request.getHarga_wisata());
            preparedStatement.setString(5, request.getVia_pembayaran());
            preparedStatement.setInt(6, request.getId_penginapan());
            preparedStatement.setString(7, request.getNama_penginapan());
            preparedStatement.setInt(8, request.getId_pengunjung());
            preparedStatement.setString(9, request.getNama_pengunjung());
            preparedStatement.setString(10, request.getDeskripsi_makanan_minuman());
            preparedStatement.setString(11, request.getDeskripsi_tambahan());
            preparedStatement.setDate(12, (Date) request.getDari());
            preparedStatement.setDate(13, (Date) request.getSampai());
            preparedStatement.setInt(14, request.getTotal_tanggal());
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void update(Transaksi request) {
        logger.debug(request.toString());
        try {
            sql = "UPDATE paket_wisata SET nama=? WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request.getId());
            preparedStatement.setInt(2, request.getId_wisata());
            preparedStatement.setString(3, request.getPaket_wisata());
            preparedStatement.setInt(4, request.getHarga_wisata());
            preparedStatement.setString(5, request.getVia_pembayaran());
            preparedStatement.setInt(6, request.getId_penginapan());
            preparedStatement.setString(7, request.getNama_penginapan());
            preparedStatement.setInt(8, request.getId_pengunjung());
            preparedStatement.setString(9, request.getNama_pengunjung());
            preparedStatement.setString(10, request.getDeskripsi_makanan_minuman());
            preparedStatement.setString(11, request.getDeskripsi_tambahan());
            preparedStatement.setDate(12, (Date) request.getDari());
            preparedStatement.setDate(13, (Date) request.getSampai());
            preparedStatement.setInt(14, request.getTotal_tanggal());
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
            sql = "DELETE FROM paket_wisata WHERE id=?;";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, request);
            logger.debug(preparedStatement.toString());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(TransaksiJdbc request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
