package model.domain;

public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	private EmpDTO empDTO;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public EmpDTO getEmpDTO() {
		return empDTO;
	}
	public void setEmpDTO(EmpDTO empDTO) {
		this.empDTO = empDTO;
	}
	
	public DeptDTO() {}
	
	public DeptDTO(String dname, EmpDTO empDTO) {
		super();
		this.dname = dname;
		this.empDTO = empDTO;
	}
	
	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public DeptDTO(int deptno, String dname, String loc, EmpDTO empDTO) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.empDTO = empDTO;
	}
	
	@Override
	// 출력용
//	public String toString() {
//		return "DeptDTO [deptno = " + deptno + ", dname = " + dname + ", loc = " + loc + "]" + empDTO;
//	}
	// join용
	public String toString() {
		return "DeptDTO [dname = " + dname + "], " + empDTO;
	}
		
	
	
	
}
