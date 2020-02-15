package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	//2. create an array of 5 robots.
		Robot[] robos = new Robot[7];
		int[] dist = new int[7];
		for (int i = 0; i < dist.length; i++) {
			dist[i] = 0;
		}
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < robos.length; i++) {
			robos[i] = new Robot("mini");
		
		//4. make each robot start at the bottom of the screen, side by side, facing up
			//robos[i].moveTo(100 + 100*i, 600);
			robos[i].moveTo(100 , 300);
			robos[i].setSpeed(10);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.\
	Random randy = new Random();
	int winnerIndex = 0;
	boolean gameOn = true;
	while (gameOn){
		for (int i = 0; i < robos.length; i++) {
			int moveDis = randy.nextInt(50);
			for (int j = 0; j < moveDis; j++) {
				robos[i].move(2);
				robos[i].turn(1);
				dist[i] = dist[i] + 1;
			}
			if (dist[i] >= 360 && gameOn) {
				JOptionPane.showMessageDialog(null, "Robot " + (i + 1) + " has won!");
				winnerIndex = i;
				gameOn = false;
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
	}
	//7. declare that robot the winner and throw it a party!
	robos[winnerIndex].turn(180);
	robos[winnerIndex].moveTo(300, 300);
	robos[winnerIndex].turn(1000);
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	
	}
}
