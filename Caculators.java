import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Caculators extends JFrame implements ActionListener{
	// JButton array
	JButton[] jbt = new JButton[15];
	JTextField jtf = new JTextField();
	
	public Caculators(){
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(5,3));
		
                // add 1~9 to the button
		for(int i = 0;i < 9;i++){
			p1.add(jbt[i] = new JButton(""+(i+1)));
		}
		
		// add the others to the button
		p1.add(jbt[9] = new JButton(""+0));
		p1.add(jbt[10] = new JButton("+"));
		p1.add(jbt[11] = new JButton("-"));
		p1.add(jbt[12] = new JButton("x"));
		p1.add(jbt[13] = new JButton("/"));
		p1.add(jbt[14] = new JButton("="));
		
		for(int i =0;i < 15; i++){
			jbt[i].addActionListener(this);
		}
		
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(jtf,BorderLayout.NORTH);
		p2.add(p1,BorderLayout.CENTER);
		add(p2);

	}
	
	// event
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == jbt[0])
			jtf.setText("1");
		if(e.getSource() == jbt[1])
			jtf.setText("2");
		if(e.getSource() == jbt[2])
			jtf.setText("3");
		if(e.getSource() == jbt[3])
			jtf.setText("4");
		if(e.getSource() == jbt[4])
			jtf.setText("5");
		if(e.getSource() == jbt[5])
			jtf.setText("6");
		if(e.getSource() == jbt[6])
			jtf.setText("7");
		if(e.getSource() == jbt[7])
			jtf.setText("8");
		if(e.getSource() == jbt[8])
			jtf.setText("9");
		if(e.getSource() == jbt[9])
			jtf.setText("0");
			
	}

	//set frame
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caculators frame = new Caculators();
		frame.setSize(300,450);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
