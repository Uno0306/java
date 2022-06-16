package blood.transfusion.model;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.exception.NotExistException;

public interface BTProjectInterface {
	public void notExistBTProject(String btProjectId) throws NotExistException, SQLException;
	public ArrayList<BTProjectDTO> getAllBTProjects() throws SQLException;
	public BTProjectDTO getBTProject(String btProjectId) throws SQLException, NotExistException;
	public boolean addBTProject(BTProjectDTO btProject) throws SQLException, NotExistException;
	public boolean updateBTProject(String btProjectId, String btProjectContent) throws SQLException, NotExistException;
	public boolean deleteBTProject(String btProjectId) throws SQLException, NotExistException;
	
}
