package model.domain;

public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	
	public Dept(Builder builder) {
		this.deptno = builder.deptno;
		this.dname = builder.dname;
		this.loc = builder.loc;
	}
	
	public static class Builder{
		private int deptno;
		private String dname;
		private String loc;
		
		public Builder() {}
		
		public Builder deptno(int deptno) {
			this.deptno = deptno;
			return this;
		}
		
		public Builder dname(String dname) {
			this.dname = dname;
			return this;
		}
		
		public Builder loc(String loc) {
			this.loc = loc;
			return this;
		}
		
		public Dept build() {
			return new Dept(this);
			
		}
		
	}

	public int getDeptno() {
		return deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getLoc() {
		return loc;
	}
}
