import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {
	public Calculator() {
		setTitle("CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 4);
		grid.setHgap(5);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("+"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("-"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("*"));
		c.add(new JButton("<-"));
		c.add(new JButton("0"));
		c.add(new JButton("="));
		c.add(new JButton("/"));
		setSize(300,300);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		new Calculator();
			
		}
	}


