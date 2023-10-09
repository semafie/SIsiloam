package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import entity.data_master;

public class data_masterRepository implements Repository<data_master> {

    @Override
    public List<data_master> get() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public data_master get(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public boolean add(data_master entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean update(data_master entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(data_master entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    private data_master mapToEntity(ResultSet res)throws SQLException {
        data_master master = new data_master(
            res.getString("nama"),
            res.getInt("no_hp"),
            res.getString("jenis_poli"),
            res.getString("jadwal"),
            res.getInt("no_antrian"),
            res.getDate("tanggal")
        );
        master.setId(res.getInt("id"));
        return master;
    }
    

}
