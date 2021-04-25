import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener  {
	
	Random random=new Random();
	JFrame jf=new JFrame();
	JFrame jf1=new JFrame();
	JPanel tpanel=new JPanel();
	JPanel bpanel=new JPanel();
	JLabel text=new JLabel();
	ButtonGroup bg=new ButtonGroup();
	JButton[] buttons=new JButton[9];
	int count=0;
	boolean p1_turn;
	TicTacToe()
	{
		
	    			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    		jf.setSize(500,500);
		    		jf.getContentPane().setBackground(Color.BLACK);
		    		jf.setLayout(new BorderLayout());
		    		jf.setVisible(true);
		    		
		    		text.setBackground(Color.BLACK);
		    		text.setForeground(Color.YELLOW);
		    		text.setFont(new Font("Times New Roman",Font.BOLD,70));
		    		text.setHorizontalAlignment(JLabel.CENTER);
		    		text.setText("Tic-Tac-Toe");
		    		text.setOpaque(true);
		    		
		    		tpanel.setLayout(new BorderLayout());
		    		tpanel.setBounds(0, 0, 800, 100);
		    		
		    		bpanel.setLayout(new GridLayout(3,3));
		    		bpanel.setBackground(new Color(100,100,100));
		    		
		    
		    		
		    		for(int i=0;i<9;i++)
		    		{
		    			buttons[i]=new JButton();
		    			bpanel.add(buttons[i]);
		    			buttons[i].setFont(new Font("Ink Free", Font.BOLD,100));
		    			buttons[i].setFocusable(false);
		    			buttons[i].addActionListener(this);
		    		}
		    		
		    		
		    		tpanel.add(text);
		    		
		    		jf.add(tpanel,BorderLayout.NORTH);
		    		jf.add(bpanel);
		    		
		    		firstTurn();
		   

		    		
		    		
	    		}
	    		
	    		

	    		
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<9;i++)
		{
			if(e.getSource()==buttons[i])
			{
				count=count+1;
				if(p1_turn)
				{
					if(buttons[i].getText()=="")
					{
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						p1_turn=false;
						text.setText("O turn");
						check(count);
						
					}
				}
				else
				{
					if(buttons[i].getText()=="")
					{
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						p1_turn=true;
						text.setText("X turn");
						check(count);
										
					}
				}
				
			}
		}
		
	}

	public void firstTurn()
	{
		try
		   {
			   Thread.sleep(10000);
			   
		   }
		   catch(InterruptedException e)
		   {
			   e.printStackTrace();
		   }
	   if(random.nextInt(2)==0)
	   {
		   p1_turn=true;
		   text.setText("X Turn");
	   }
	   else
	   {
		   p1_turn=false;
		   text.setText("O Turn");
	   }
	   
	}
	public void check(int a)
	{
		if(
				(buttons[0].getText()=="X") &&
				(buttons[1].getText()=="X") &&
				(buttons[2].getText()=="X")
				) {
			ifxWins(0,1,2);
		}
		if(
				(buttons[3].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[5].getText()=="X")
				) {
			ifxWins(3,4,5);
		}
		if(
				(buttons[6].getText()=="X") &&
				(buttons[7].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
			ifxWins(6,7,8);
		}
		if(
				(buttons[0].getText()=="X") &&
				(buttons[3].getText()=="X") &&
				(buttons[6].getText()=="X")
				) {
			ifxWins(0,3,6);
		}
		if(
				(buttons[1].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[7].getText()=="X")
				) {
			ifxWins(1,4,7);
		}
		if(
				(buttons[2].getText()=="X") &&
				(buttons[5].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
			ifxWins(2,5,8);
		}
		if(
				(buttons[0].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
			ifxWins(0,4,8);
		}
		if(
				(buttons[2].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[6].getText()=="X")
				) {
			ifxWins(2,4,6);
		}
		//check O win conditions
		if(
				(buttons[0].getText()=="O") &&
				(buttons[1].getText()=="O") &&
				(buttons[2].getText()=="O")
				) {
			ifoWins(0,1,2);
		}
		if(
				(buttons[3].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[5].getText()=="O")
				) {
			ifoWins(3,4,5);
		}
		if(
				(buttons[6].getText()=="O") &&
				(buttons[7].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
			ifoWins(6,7,8);
		}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[3].getText()=="O") &&
				(buttons[6].getText()=="O")
				) {
			ifoWins(0,3,6);
		}
		if(
				(buttons[1].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[7].getText()=="O")
				) {
			ifoWins(1,4,7);
		}
		if(
				(buttons[2].getText()=="O") &&
				(buttons[5].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
			ifoWins(2,5,8);
		}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
			ifoWins(0,4,8);
		}
		if(
				(buttons[2].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[6].getText()=="O")
				) {
			ifoWins(2,4,6);
		}
		else if((a==9)&&(buttons[0].getText()!=null)&&(buttons[1].getText()!=null)&&(buttons[2].getText()!=null)&&(buttons[3].getText()!=null)&&(buttons[4].getText()!=null)&&(buttons[5].getText()!=null)&&(buttons[6].getText()!=null)&&(buttons[7].getText()!=null)&&(buttons[8].getText()!=null))
		{
			tie();
		}
	}
	public void ifxWins(int a,int b, int c)
	{
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		text.setText("X wins");
		
	}
	public void ifoWins(int a,int b, int c)
	{
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		text.setText("O wins");
	}
	public void tie()
	{

		text.setText("Tie-Match");
		for(int i=0;i<9;i++)
		{
			buttons[i].setEnabled(false);
		}
		
	}
	
	}
	
	


