package pariwisata.model.pengunjung;

import java.util.List;

/**
 *
 * @author Khanza
 */
public interface PengunjungJdbc {

    public List<Pengunjung> selectAll();

    public void insert(Pengunjung request);

    public void update(Pengunjung request);
    
    public void delete(Long request);

}
