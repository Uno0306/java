package blood.transfusion.service;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dao.RecipientDAO;
import blood.transfusion.dto.RecipientDTO;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.model.RecipientInterface;

public class RecipientService implements RecipientInterface{
			
	private static RecipientService instance = new RecipientService();
	
	private RecipientService(){}
	
	public static RecipientService getInstance(){
		return instance;
	}
	
	// Recipient - CRUD
	public void notExistRecipient(String recipientId) throws NotExistException, SQLException {
		RecipientDTO recipient = RecipientDAO.getRecipient(recipientId);
		if (recipient == null) {
			throw new NotExistException();
		}
	}

	public boolean addRecipient(RecipientDTO recipient) throws SQLException, NotExistException {
		if(("").equals(recipient.getId())) {
			throw new NotExistException();
		}
		return RecipientDAO.addRecipient(recipient);
	}

	public boolean updateRecipient(String recipientId, String purposeTransfusion)
			throws SQLException, NotExistException {
		notExistRecipient(recipientId);
		return RecipientDAO.updateRecipient(recipientId, purposeTransfusion);
	}

	public boolean deleteRecipient(String recipientId) throws SQLException, NotExistException {
		notExistRecipient(recipientId);
		return RecipientDAO.deleteRecipient(recipientId);
	}

	public RecipientDTO getRecipient(String recipientId) throws SQLException {
		return RecipientDAO.getRecipient(recipientId);
	}

	public ArrayList<RecipientDTO> getAllRecipients() throws SQLException {
		return RecipientDAO.getAllRecipients();
	}
}
