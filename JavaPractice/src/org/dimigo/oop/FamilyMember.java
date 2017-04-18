/**
 * 
 */
package org.dimigo.oop;

/**
 * 
 * <pre>
 * org.dimigo.oop
 *   |_FamilyMember
 *
 * 1. 개요 : 
 * 2. 작성일: 2017. 4. 18.
 *</pre>
 *
 *@author alber
 */
public class FamilyMember {
	public static int memberCnt;
	private String memberName;
	
	public FamilyMember(){
		
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}

	public static int getMemberCnt() {
		return memberCnt;
	}

	public static void setMemberCnt(int memberCnt) {
		FamilyMember.memberCnt = memberCnt;
	}

	public String getMemberName() {
		return memberName;
	}
	public static void printMemberCnt(){
		System.out.println("가족 총 인원 수"+ " : "+ memberCnt +"명");
	}

	
}
