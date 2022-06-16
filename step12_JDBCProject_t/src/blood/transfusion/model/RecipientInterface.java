package blood.transfusion.model;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dto.RecipientDTO;
import blood.transfusion.exception.NotExistException;

public interface RecipientInterface {
	public void notExistRecipient(String recipientId) throws NotExistException, SQLException;
	public boolean addRecipient(RecipientDTO recipient) throws SQLException, NotExistException;
	public boolean updateRecipient(String recipientId, String purposeTransfusion) throws SQLException, NotExistException;
	public boolean deleteRecipient(String recipientId) throws SQLException, NotExistException;
	public RecipientDTO getRecipient(String recipientId) throws SQLException;
	public ArrayList<RecipientDTO> getAllRecipients() throws SQLException;
}
