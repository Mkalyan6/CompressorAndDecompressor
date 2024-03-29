package BreadcrumbsCompress_Decompress;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AppFrame extends JFrame implements ActionListener{
	JButton compressButton;
	JButton decompressButton;
	
	AppFrame(){
	  
		      // set exit close buttons
		
		this.setLayout(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	compressButton = new JButton ("Select file to compress");
	compressButton.setBounds(20,100,200,30);                      // set bounds   
	compressButton.addActionListener(this);                      // add action listener
	
	
	decompressButton = new JButton("Select file to decompress");
	decompressButton.setBounds(250,100,200,30);                     // set bounds 
	decompressButton.addActionListener(this);                      // add action listener
	
	// add buttons
	this.add(compressButton);
	this.add(decompressButton);
	
	
	
	// set size and colors
	this.setSize(1000,500);
	
	this.getContentPane().setBackground(Color.green);
	
	// visible set true;
	
	this.setVisible(true);
	
	
	
	}
	
	@Override
	
	public void actionPerformed( ActionEvent e) {
		
		 if( e.getSource() == compressButton) {
			 JFileChooser filechooser = new JFileChooser();
			 
			 int responce = filechooser.showSaveDialog(null);
			 
			 if( responce == JFileChooser.APPROVE_OPTION ) {
				 File file = new File(filechooser.getSelectedFile().getAbsolutePath());
				 
				 System.out.print(file);
				 String str = file.toString();
				 if( str.substring(str.length()-3) == ".gz") {
					 
					 JOptionPane.showMessageDialog(this, "* Decompress faild *");
					 return;
				 }
				 
				 try {
					 Compressor.method(file);
					 JOptionPane.showMessageDialog(this, "* compress success *");
					 System.out.println(" compress success");
					 
				 }
				 catch(Exception ee){
					 
					 JOptionPane.showMessageDialog(null, ee.toString());
					 JOptionPane.showMessageDialog(this, "* Decompress faild *");
					 System.out.println(" compress fail");
					 
				 }
			 }
		 }
		 
		 // decompress 
		 
		  if( e.getSource() == decompressButton) {
		 
		 JFileChooser filechooser = new JFileChooser();
		 
		 int responce = filechooser.showSaveDialog(null);
		 
		 if( responce == JFileChooser.APPROVE_OPTION) {
			 File file = new File(filechooser.getSelectedFile().getAbsolutePath());
			 
			 System.out.print(file);
			 
			 try {
				 Decompressor.method(file);
				 JOptionPane.showMessageDialog(this, "* Decompress success *");
				 System.out.println(" Decompress success");
			 }
			 catch( Exception ee) {
				 
				 
				 JOptionPane.showMessageDialog(this, "* Decompress faild *");
				 System.out.println(" Decompress fail");
				
			 }
		 }
		 
		 
		 
		 }
		
	}

}









