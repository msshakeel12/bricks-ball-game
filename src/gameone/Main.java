package gameone;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj1= new JFrame();
		obj1.setBounds(10,10,700,600);
		obj1.setTitle("Bricks Ball");
		obj1.setResizable(false);
		obj1.setVisible(true);
		obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gamemode gameMode = new Gamemode();
		obj1.add(gameMode);
	}

}
