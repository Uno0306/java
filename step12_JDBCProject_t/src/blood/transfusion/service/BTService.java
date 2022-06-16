package blood.transfusion.service;

import java.sql.SQLException;
import java.util.ArrayList;

import blood.transfusion.dao.BTProjectDAO;
import blood.transfusion.dto.BTProjectDTO;
import blood.transfusion.exception.NotExistException;

public class BTService {
			
	private static BTService instance = new BTService();
	
	private BTService(){}
	
	public static BTService getInstance(){
		return instance;
	}
	
	//BTProject - CRUD
	public void notExistBTProject(String btProjectId) throws NotExistException, SQLException{
		BTProjectDTO btProject = BTProjectDAO.getBTProject(btProjectId);
		if(btProject == null){
			throw new NotExistException("검색하진 수혈 정보가 없습니다.");
		}
	}
	
	//모든 BTProject 정보 반환
	public ArrayList<BTProjectDTO> getAllBTProjects() throws SQLException{
		return BTProjectDAO.getAllBTProjects();
	}
	
	//BTProject id로 검색
	public BTProjectDTO getBTProject(String btProjectId) throws SQLException, NotExistException{
		BTProjectDTO btProject = BTProjectDAO.getBTProject(btProjectId);
		if (btProject == null) {
			throw new NotExistException();
		}
		return btProject;
	}
	
	// 새로운 BTProject 저장
	public boolean addBTProject(BTProjectDTO btProject) throws SQLException, NotExistException {
		if(("").equals(btProject.getBtProjectId())) {
			throw new NotExistException();
		} 
		return BTProjectDAO.addBTProject(btProject);
	}
	
	//기존 BTProject 수정
	public boolean updateBTProject(String btProjectId, String btProjectContent) throws SQLException, NotExistException{
		notExistBTProject(btProjectId);
		boolean check = BTProjectDAO.updateBTProjectcontent(btProjectId, btProjectContent);
		return check;
	}
	
	// BTProject 삭제
	public boolean deleteBTProject(String btProjectId) throws SQLException, NotExistException {
		boolean check = BTProjectDAO.deleteBTProject(btProjectId);
		if (check == false) {
			notExistBTProject(btProjectId);
		} else {
			return check;
		}
		return false;
	}

}
