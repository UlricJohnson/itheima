package com.itheima.test1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OldPhone op = new OldPhone();
		NewPhone np = new NewPhone();

		op.call();
		op.sendMessage();

		np.call();
		np.sendMessage();
		np.playGame();
	}

}
