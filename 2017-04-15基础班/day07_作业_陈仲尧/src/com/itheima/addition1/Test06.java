package com.itheima.addition1;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirlFriend girlFriend = new GirlFriend("ŷ������", 1.6, "������");
		girlFriend.cook();
		girlFriend.wash(new Clothes("LiNing", "��ɫ"));

		BoyFriend boyFriend = new BoyFriend("Ľ����Ӣ", 1.75);
		boyFriend.earn();
		boyFriend.play(girlFriend);
	}

}
