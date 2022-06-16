package blood.transfusion.model;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dto.DonorDTO;
import blood.transfusion.exception.NotExistException;

public interface DonorInterface {
	public void notExistDonor(String donorId) throws NotExistException, SQLException;
	public boolean addDonor(DonorDTO donor) throws SQLException, NotExistException;
	public boolean updateDonor(String donorId, String purposeDonation) throws SQLException, NotExistException;
	public boolean deleteDonor(String donorId) throws SQLException, NotExistException;
	public DonorDTO getDonor(String donorId) throws SQLException, NotExistException;
	public ArrayList<DonorDTO> getAllDonors() throws SQLException;
}
