package com.bdi.sp.vo;

public class DepartInfo {

	private Integer diNo;
	private String diName;
	private String diDesc;
	private Integer diCnt;
	
	public Integer getDiNo() {
		return diNo;
	}
	public void setDiNo(Integer diNo) {
		this.diNo = diNo;
	}
	public String getDiName() {
		return diName;
	}
	public void setDiName(String diName) {
		this.diName = diName;
	}
	public String getDiDesc() {
		return diDesc;
	}
	public void setDiDesc(String diDesc) {
		this.diDesc = diDesc;
	}
	public Integer getDiCnt() {
		return diCnt;
	}
	public void setDiCnt(Integer diCnt) {
		this.diCnt = diCnt;
	}
	@Override
	public String toString() {
		return "DepartInfo [diNo=" + diNo + ", diName=" + diName + ", diDesc=" + diDesc + ", diCnt=" + diCnt + "]";
	}
	
}
