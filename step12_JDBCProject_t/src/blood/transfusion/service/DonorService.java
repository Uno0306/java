package blood.transfusion.service;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dao.DonorDAO;
import blood.transfusion.dto.DonorDTO;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.model.DonorInterface;

public class DonorService implements DonorInterface{
			
	private static DonorService instance = new DonorService();
	
	private DonorService(){}
	
	public static DonorService getInstance(){
		return instance;
	}
	

	//Donor - CRUD
	public void notExistDonor(String donorId) throws NotExistException, SQLException {
		DonorDTO Donor = DonorDAO.getDonor(donorId);
		if (Donor == null) {
			throw new NotExistException();
		}
	}

	public boolean addDonor(DonorDTO donor) throws SQLException, NotExistException {
		if(("").equals(donor.getId())) {
			throw new NotExistException();
		}
		return DonorDAO.addDonor(donor);
	}

	public boolean updateDonor(String donorId, String purposeDonation) throws SQLException, NotExistException {
		notExistDonor(donorId);
		return DonorDAO.updateDonor(donorId, purposeDonation);
	}

	public boolean deleteDonor(String donorId) throws SQLException, NotExistException {
		notExistDonor(donorId);
		return DonorDAO.deleteDonor(donorId);
	}

	public DonorDTO getDonor(String donorId) throws SQLException, NotExistException {
		DonorDTO donor = DonorDAO.getDonor(donorId);
		if (donor == null) {
			throw new NotExistException();
		}
		return donor;
	}

	public ArrayList<DonorDTO> getAllDonors() throws SQLException {
		return DonorDAO.getAllDonors();
	}

}
