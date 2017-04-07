/**
 * 
 */
package org.dimigo.oop;

/**
 * 
 * <pre>
 * org.dimigo.oop
 *   |_IdolGroup
 *
 * 1. 개요 : 
 * 2. 작성일: 2017. 4. 7.
 *</pre>
 *
 *@author alber
 */
public class IdolGroup{
	
	public static void main(String[] args) {
		String[] groupName={"빅뱅","2NE1","걸스데이"};
		String[][] realName={
				{"GD","태양","대성","탑","승리"},
				{"CL","산다라박","박봄","민지"},
				{"유라","혜리","소진","민아"},
		};
		for(int i=0; i<realName.length; i++){
			System.out.println("<<"+groupName[i]+">>");
			for(int j=0; j<realName[i].length; j++){
				System.out.println(realName[i][j]);
				
			}
			System.out.println();
		}
	}
}
