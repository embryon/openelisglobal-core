/**
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations under
 * the License.
 *
 * The Original Code is OpenELIS code.
 *
 * Copyright (C) CIRG, University of Washington, Seattle WA.  All Rights Reserved.
 *
 */
package us.mn.state.health.lims.reports.action.implementation.reportBeans;

public class VLReportData {

	private String ampli2;
	private String ampli2lo;
	private String subjectno;
	private String sitesubjectno;
	private String birth_date;
	private String age;
	private String ageMonth = "--";
	private String ageWeek = "--";
	private String gender;
	private String collectiondate;
	private String receptiondate;
	private String accession_number;
	private String servicename;
	private String doctor;
	private String compleationdate;
	private String PTME;
	private String clinicDistrict;
	private String clinic;
	private String status;
	private Boolean duplicateReport = Boolean.FALSE;


	public String getSubjectno() {
		return subjectno;
	}
	public void setSubjectno(String subjectno) {
		this.subjectno = subjectno;
	}
	public String getSitesubjectno() {
		return sitesubjectno;
	}
	public void setSitesubjectno(String sitesubjectno) {
		this.sitesubjectno = sitesubjectno;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birthDate) {
		this.birth_date = birthDate;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAgeMonth() {
		return ageMonth;
	}
	public void setAgeMonth(String agemonth) {
		this.ageMonth = agemonth;
	}
	public String getAgeWeek() {
		return ageWeek;
	}
	public void setAgeWeek(String ageWeek) {
		this.ageWeek = ageWeek;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCollectiondate() {
		return collectiondate;
	}
	public void setCollectiondate(String collectiondate) {
		this.collectiondate = collectiondate;
	}
	public String getAccession_number() {
		return accession_number;
	}
	public void setAccession_number(String accessionNumber) {
		accession_number = accessionNumber;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getCompleationdate() {
		return compleationdate;
	}
	public void setCompleationdate(String compleationdate) {
		this.compleationdate = compleationdate;
	}
	public String getPTME() {
		return PTME;
	}
	public void setPTME(String pTME) {
		PTME = pTME;
	}
	public String getClinicDistrict() {
		return clinicDistrict;
	}
	public void setClinicDistrict(String clinicDistrict) {
		this.clinicDistrict = clinicDistrict;
	}
	public String getClinic() {
		return clinic;
	}
	public void setClinic(String clinic) {
		this.clinic = clinic;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public String getReceptiondate(){
		return receptiondate;
	}
	public void setReceptiondate(String receptiondate){
		this.receptiondate = receptiondate;
	}
	public String getAmpli2() {
		return ampli2;
	}
	public void setAmpli2(String ampli2) {
		this.ampli2 = ampli2;
	}
	public String getAmpli2lo() {
		return ampli2lo;
	}
	public void setAmpli2lo(String ampli2lo) {
		this.ampli2lo = ampli2lo;
	}
	
	public Boolean getDuplicateReport() {
		return duplicateReport;
	}
	public void setDuplicateReport(Boolean duplicateReport) {
		this.duplicateReport = duplicateReport;
	}


}
