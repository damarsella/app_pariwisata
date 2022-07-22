package pariwisata.model.admin;

import java.util.List;

/**
 *
 * @author Khanza
 */
public interface AdminJdbc {

    public List<Admin> selectAll();

    public void insert(Admin request);

    public void update(Admin request);
    
    public void delete(Long request);

}
