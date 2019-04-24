/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jointheleague.graphical.robot.Robot;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
JButton[] button;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setVisible(true);
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	String question=JOptionPane.showInputDialog("please enter a positive number");
		//3.  Ask the user to enter a positive number and convert it to an int
		int answer=Integer.parseInt(question);
		Random ran=new Random(answer);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		button=new JButton[answer];
		//5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < button.length; i++) {
			button[i]=new JButton();
			button[i].addActionListener(this);
			panel.add(button[i]);
			window.add(panel);
		}	
		window.pack();
		//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		//9 add the panel to the window
	
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "A button will flash for a moment, click that button. if yur wrong, well, just don't be");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		hiddenButton=ran.nextInt(answer);
		//14. Set the text of the JButton located at hiddenButton the read "ME"
		button[hiddenButton].setText("ME");
		//15. Use  to pause the program.
		try {
			Thread.sleep(25);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		button[hiddenButton].setText(" ");
		//    Surround it with a try/catch - use Eclipse helper for this
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		if (e.getSource().equals(button[hiddenButton])) {
			JOptionPane.showMessageDialog(null, "YOU WIN!!!!!");
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "NOPE, try again");
			button[hiddenButton].setText("ME");
			//15. Use  to pause the program.
			try {
				Thread.sleep(25);
			} catch (InterruptedException y) {
				// TODO Auto-generated catch block
				y.printStackTrace();
				
			}
			button[hiddenButton].setText(" ");
		}
		//17. if the hiddenButton is clicked, tell the user that they win.
		
		//18. else tell them to try again
	}
}
