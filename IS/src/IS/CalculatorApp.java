package IS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorApp {

	public static void main(String[] args) throws InterruptedException {
		Calculator calc = new Calculator(); //create calculator's instance
		calc.setVisible(true); //set calculator visible

	}

}


class Calculator extends JFrame  {
	 JLabel label1, label2, label3, label4; //create labels
	 JButton bDean, bCathedra, bExecute ; //create button
	 JTextField textField1, textField2, textField3, textField4; //create text fields
	 JPanel panel; //create panel
	 
	public Calculator() throws InterruptedException {
		super("Calculator"); //set calculator's title
		setBounds(370, 300, 250, 100); //set bounds.
		
		label1 = new JLabel("Âûáåðèòå ðîëü ïîëüçîâàòåëÿ");
		bCathedra = new JButton("Çàâ. êàôåäðîé");
		bDean = new JButton("Äåêàí");
		
		panel = new JPanel(new FlowLayout());  //dynamically allocates memory
		panel.add(label1);
		panel.add(bCathedra);
		panel.add(bDean);
		
		add(panel);
		
		bCathedra.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				
				
				setBounds(200, 300, 400, 150); //set bounds
				
				label1 = new JLabel("Ââåäèòå êîëè÷åñòâî ó÷åíèêîâ"); //dynamically allocates memory
				label2 = new JLabel("Ââåäèòå êîëèåñòâî ó÷åíèêîâ íà ðóêîâîäèòåëÿ"); //dynamically allocates memory
				label3 = new JLabel("Ââåäèòå ÷èñëî ñâîáîäíûõ ðóêîâîäèòåëåé ñ êàôåäðû"); //dynamically allocates memory
				label4 = new JLabel("Ðåçóëüòàò");
				
				textField1 = new JTextField("", 2); //dynamically allocates memory
				textField2 = new JTextField("", 2); //dynamically allocates memory
				textField3 = new JTextField("", 2); //dynamically allocates memory
				textField4 = new JTextField("", 2); //dynamically allocates memory
				
				bExecute = new JButton("Ïðîâåñòè ðàñ÷¸ò");
				
				
				panel.add(label1); //add the label on the panel
				panel.add(textField1); //add the text field on the panel
				panel.add(label2); //add label on the panel
				panel.add(textField2); //add the text field on the panel
				panel.add(label3); //add the label on the panel
				panel.add(textField3); //add the text field on the panel
				panel.add(label4); //add the label on the panel
				panel.add(textField4); //add text field on the panel
				panel.add(bExecute);
				
			}
			
		});
		
		bDean.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.revalidate();
				setBounds(370, 300, 250, 120); //set bounds
				
				label1 = new JLabel("Ââåäèòå íàçâàíèå êàôåäðû"); //dynamically allocates memory
				textField1 = new JTextField("", 20); //dynamically allocates memory
				bExecute = new JButton("Äàëåå");
				
				panel.add(label1);
				panel.add(textField1);
				panel.add(bExecute);
				
				bExecute.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						panel.removeAll();
						
						
						setBounds(200, 300, 400, 150); //set bounds
						
						label1 = new JLabel("Ââåäèòå êîëè÷åñòâî ó÷åíèêîâ"); //dynamically allocates memory
						label2 = new JLabel("Ââåäèòå êîëèåñòâî ó÷åíèêîâ íà ðóêîâîäèòåëÿ"); //dynamically allocates memory
						label3 = new JLabel("Ââåäèòå ÷èñëî ñâîáîäíûõ ðóêîâîäèòåëåé ñ êàôåäðû"); //dynamically allocates memory
						label4 = new JLabel("Ðåçóëüòàò");
						
						textField1 = new JTextField("", 2); //dynamically allocates memory
						textField2 = new JTextField("", 2); //dynamically allocates memory
						textField3 = new JTextField("", 2); //dynamically allocates memory
						textField4 = new JTextField("", 2); //dynamically allocates memory
						
						bExecute = new JButton("Ïðîâåñòè ðàñ÷¸ò");
						
						
						panel.add(label1); //add the label on the panel
						panel.add(textField1); //add the text field on the panel
						panel.add(label2); //add label on the panel
						panel.add(textField2); //add the text field on the panel
						panel.add(label3); //add the label on the panel
						panel.add(textField3); //add the text field on the panel
						panel.add(label4); //add the label on the panel
						panel.add(textField4); //add text field on the panel
						panel.add(bExecute);
						
					}
					
				});
			}
			
		});
		
		//setBounds(200, 300, 600, 150); //set bounds
		
		/*textField1 = new JTextField("", 2); //dynamically allocates memory
		textField2 = new JTextField("", 2); //dynamically allocates memory
		textField3 = new JTextField("", 2); //dynamically allocates memory
		textField4 = new JTextField("", 2); //dynamically allocates memory
		
		label1 = new JLabel("Ââåäèòå êîëè÷åñòâî ó÷åíèêîâ"); //dynamically allocates memory
		label2 = new JLabel("Ââåäèòå ÷èñëî ó÷åíèêîâ, êîòîðûõ êàæäûé ðóêîâîäèòåëü äîëæåí ïðèíÿòü"); //dynamically allocates memory
		label3 = new JLabel("Ââåäèòå ÷èñëî ñâîáîäíûõ ðóêîâîäèòåëåé ñ êàôåäðû"); //dynamically allocates memory
		label4 = new JLabel("Ðåçóëüòàò");
		
		countB = new JButton("Ðàñ÷¸ò"); //dynamically allocates memory
		
		panel = new JPanel(new FlowLayout());  //dynamically allocates memory
		
		panel.add(label1); //add the label on the panel
		panel.add(textField1); //add the text field on the panel
		panel.add(label2); //add label on the panel
		panel.add(textField2); //add the text field on the panel
		panel.add(label3); //add the label on the panel
		panel.add(textField3); //add the text field on the panel
		panel.add(label4); //add the label on the panel
		panel.add(textField4); //add text field on the panel
		panel.add(countB); //add the button on the panel
		countB.addActionListener(this); //add action listener to the button
		add(panel); //add the panel on the frame

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close*/
	}

	/*public void actionPerformed(ActionEvent e) { //action on click to the button
			doCount();
	}
	
	public void doCount(){
		textField4.setText(""); //do the count
	}*/
	
}
