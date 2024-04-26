package com.cyb.shopping.member.vo;

import java.sql.Date;

public class MemberVO {

		private String MEMBER_ID;
		private String MEMBER_PW;
		private String MEMBER_NAME;
		private String MEMBER_GENDER;
		private String TEL1;
		private String TEL2;
		private String TEL3;
		private String HP1;
		private String HP2;
		private String HP3;
		private String SMSSTS_YN;
		private String EMAIL1;
		private String EMAIL2;
		private String EMAILSTS_YN;
		private String ZIPCODE;
		private String ROADADDRESS;
		private String JIBUNADDRESS;
		private String NAMUJIADDRESS;
		private String MEMBER_BIRTH_Y;
		private String MEMBER_BIRTH_M;
		private String MEMBER_BIRTH_D;
		private String MEMBER_BIRTH_GN;
		private Date JOINDATE;
		
		public String getMEMBER_ID() {
			return MEMBER_ID;
		}
		public void setMEMBER_ID(String mEMBER_ID) {
			MEMBER_ID = mEMBER_ID;
		}
		public String getMEMBER_PW() {
			return MEMBER_PW;
		}
		public void setMEMBER_PW(String mEMBER_PW) {
			MEMBER_PW = mEMBER_PW;
		}
		public String getMEMBER_NAME() {
			return MEMBER_NAME;
		}
		public void setMEMBER_NAME(String mEMBER_NAME) {
			MEMBER_NAME = mEMBER_NAME;
		}
		public String getMEMBER_GENDER() {
			return MEMBER_GENDER;
		}
		public void setMEMBER_GENDER(String mEMBER_GENDER) {
			MEMBER_GENDER = mEMBER_GENDER;
		}
		public String getTEL1() {
			return TEL1;
		}
		public void setTEL1(String tEL1) {
			TEL1 = tEL1;
		}
		public String getTEL2() {
			return TEL2;
		}
		public void setTEL2(String tEL2) {
			TEL2 = tEL2;
		}
		public String getTEL3() {
			return TEL3;
		}
		public void setTEL3(String tEL3) {
			TEL3 = tEL3;
		}
		public String getHP1() {
			return HP1;
		}
		public void setHP1(String hP1) {
			HP1 = hP1;
		}
		public String getHP2() {
			return HP2;
		}
		public void setHP2(String hP2) {
			HP2 = hP2;
		}
		public String getHP3() {
			return HP3;
		}
		public void setHP3(String hP3) {
			HP3 = hP3;
		}
		public String getSMSSTS_YN() {
			return SMSSTS_YN;
		}
		public void setSMSSTS_YN(String sMSSTS_YN) {
			SMSSTS_YN = sMSSTS_YN;
		}
		public String getEMAIL1() {
			return EMAIL1;
		}
		public void setEMAIL1(String eMAIL1) {
			EMAIL1 = eMAIL1;
		}
		public String getEMAIL2() {
			return EMAIL2;
		}
		public void setEMAIL2(String eMAIL2) {
			EMAIL2 = eMAIL2;
		}
		public String getEMAILSTS_YN() {
			return EMAILSTS_YN;
		}
		public void setEMAILSTS_YN(String eMAILSTS_YN) {
			EMAILSTS_YN = eMAILSTS_YN;
		}
		public String getZIPCODE() {
			return ZIPCODE;
		}
		public void setZIPCODE(String zIPCODE) {
			ZIPCODE = zIPCODE;
		}
		public String getROADADDRESS() {
			return ROADADDRESS;
		}
		public void setROADADDRESS(String rOADADDRESS) {
			ROADADDRESS = rOADADDRESS;
		}
		public String getJIBUNADDRESS() {
			return JIBUNADDRESS;
		}
		public void setJIBUNADDRESS(String jIBUNADDRESS) {
			JIBUNADDRESS = jIBUNADDRESS;
		}
		public String getNAMUJIADDRESS() {
			return NAMUJIADDRESS;
		}
		public void setNAMUJIADDRESS(String nAMUJIADDRESS) {
			NAMUJIADDRESS = nAMUJIADDRESS;
		}
		public String getMEMBER_BIRTH_Y() {
			return MEMBER_BIRTH_Y;
		}
		public void setMEMBER_BIRTH_Y(String mEMBER_BIRTH_Y) {
			MEMBER_BIRTH_Y = mEMBER_BIRTH_Y;
		}
		public String getMEMBER_BIRTH_M() {
			return MEMBER_BIRTH_M;
		}
		public void setMEMBER_BIRTH_M(String mEMBER_BIRTH_M) {
			MEMBER_BIRTH_M = mEMBER_BIRTH_M;
		}
		public String getMEMBER_BIRTH_D() {
			return MEMBER_BIRTH_D;
		}
		public void setMEMBER_BIRTH_D(String mEMBER_BIRTH_D) {
			MEMBER_BIRTH_D = mEMBER_BIRTH_D;
		}
		public String getMEMBER_BIRTH_GN() {
			return MEMBER_BIRTH_GN;
		}
		public void setMEMBER_BIRTH_GN(String mEMBER_BIRTH_GN) {
			MEMBER_BIRTH_GN = mEMBER_BIRTH_GN;
		}
		public Date getJOINDATE() {
			return JOINDATE;
		}
		public void setJOINDATE(Date jOINDATE) {
			JOINDATE = jOINDATE;
		}
		@Override
		public String toString() {
			return "MemberVO [MEMBER_ID=" + MEMBER_ID + ", MEMBER_PW=" + MEMBER_PW + ", MEMBER_NAME=" + MEMBER_NAME
					+ ", MEMBER_GENDER=" + MEMBER_GENDER + ", TEL1=" + TEL1 + ", TEL2=" + TEL2 + ", TEL3=" + TEL3
					+ ", HP1=" + HP1 + ", HP2=" + HP2 + ", HP3=" + HP3 + ", SMSSTS_YN=" + SMSSTS_YN + ", EMAIL1="
					+ EMAIL1 + ", EMAIL2=" + EMAIL2 + ", EMAILSTS_YN=" + EMAILSTS_YN + ", ZIPCODE=" + ZIPCODE
					+ ", ROADADDRESS=" + ROADADDRESS + ", JIBUNADDRESS=" + JIBUNADDRESS + ", NAMUJIADDRESS="
					+ NAMUJIADDRESS + ", MEMBER_BIRTH_Y=" + MEMBER_BIRTH_Y + ", MEMBER_BIRTH_M=" + MEMBER_BIRTH_M
					+ ", MEMBER_BIRTH_D=" + MEMBER_BIRTH_D + ", MEMBER_BIRTH_GN=" + MEMBER_BIRTH_GN + ", JOINDATE="
					+ JOINDATE + "]";
		}

}
