package com.practise.core.Comparator;

public class Employee {
	
	  private Integer eid;
	    private String ename;
	    private String eloc;
		public Employee(Integer eid, String ename, String eloc) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.eloc = eloc;
		}
		public Integer getEid() {
			return eid;
		}
		public void setEid(Integer eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getEloc() {
			return eloc;
		}
		public void setEloc(String eloc) {
			this.eloc = eloc;
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", eloc=" + eloc + "]";
		}
		 
	 

}
