package pariwisata.model.penginapan;

import java.util.List;

/**
 *
 * @author Khanza
 */
public interface PenginapanJdbc {

    public List<Penginapan> selectAll();

    public void insert(Penginapan request);

    public void update(Penginapan request);
    
    public void delete(Long request);

}
