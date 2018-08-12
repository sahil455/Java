/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

/**
 *
 * @author Parul
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame
{    
     JLabel l1,l2,l3,l4;
     JTextField t1,t2,t3;
	 JButton b1,b2,b3,b4;
	 public void addComponents()
	 {
	
		
		setLayout(null);
		l1=new JLabel("SIMPLE CALCULATOR");
		l2=new JLabel("FIRST NUMBER");
		l3=new JLabel("SECOND NUMBER");
		l4=new JLabel("ANSWER");
		b1=new JButton("ADDITION");
	    b2=new JButton("SUBSTRACT");
		b3=new JButton("MULTIPLY");
		b4=new JButton("DIVIDE");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		Font fo=new Font("Airial",Font.ITALIC,30);
		l1.setFont(fo);
		l1.setBounds(100,20,350,70);
		l2.setBounds(50,80,100,30);
		l3.setBounds(50,140,100,30);
		t1.setBounds(180,80,100,30);
		t2.setBounds(180,140,100,30);
		b1.setBounds(50,190,100,30);
		b2.setBounds(180,190,120,30);
		b3.setBounds(330,190,100,30);
		b4.setBounds(440,190,100,30);
		l4.setBounds(70,250,100,30);
		t3.setBounds(190,250,100,30);
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4); 
                add(l4);
                add(t3);
		b1.addActionListener(new Addition());
		b2.addActionListener(new Substract());
		b3.addActionListener(new Multiply());
		b4.addActionListener(new Divide());
	 }
	 class Addition implements ActionListener
	 {
		 public void actionPerformed(ActionEvent e)
		 {
		   float n1=Float.parseFloat(t1.getText());
		   float n2=Float.parseFloat(t2.getText()); 
		   float ans=n1+n2;
		   String s=Float.toString(ans);
		   t3.setText(s);
		 }
	 }
	 class Substract implements ActionListener
	 {
		 public void actionPerformed(ActionEvent e)
		 {
		   float n3=Float.parseFloat(t1.getText());
		   float n4=Float.parseFloat(t2.getText()); 
		   float ans=n3-n4;
		   String s=Float.toString(ans);
		   t3.setText(s);
		 }
	 }
	 class Multiply implements ActionListener
	 {
		 public void actionPerformed(ActionEvent e)
		 {
		   float n1=Float.parseFloat(t1.getText());
		   float n2=Float.parseFloat(t2.getText()); 
		   float ans=n1*n2;
		   String s=Float.toString(ans);
		   t3.setText(s);
		 }
	 }
	 class Divide implements ActionListener
	 {
		 public void actionPerformed(ActionEvent e)
		 {
		   float n1=Float.parseFloat(t1.getText());
		   float n2=Float.parseFloat(t2.getText()); 
		   float ans=n1/n2;
		   String s=Float.toString(ans);
		   t3.setText(s);
		 }
	 }
	 
	public static void main(String[] args)
	{
		Calculator f=new Calculator();
		f.setTitle("Calculator");
		f.addComponents();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,400);
		
	}
}