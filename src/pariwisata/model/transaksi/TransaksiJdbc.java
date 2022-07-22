package pariwisata.model.transaksi;

import java.util.List;

/**
 *
 * @author Khanza
 */
public interface TransaksiJdbc {

    public List<Transaksi> selectAll();

    public void insert(Transaksi request);

    public void update(TransaksiJdbc request);
    
    public void delete(Long request);

}
