package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] args) {
		String[] idolGroup = {"AOA", "빅뱅", "걸스데이"};
		String[][] members={
				{"초아", "지민", "설현", "유나", "유경", "혜정", "민아", "찬미"},
				{"지디", "태향", "대성", "탑", "승리"},
				{"유라", "소진", "민아", "혜리"},
		};

		for(int i = 0; i < idolGroup.length; i++) {
			System.out.println("<< " + idolGroup[i] + " >>");
			for(int j = 0; j < members[i].length; j++) {
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
	}

}
