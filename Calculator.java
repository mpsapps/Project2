import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.Font;

public class Calculator{
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Calculator");
		f.setSize(300, 200);
		f.setLocation(300, 50);
		f.setResizable(true);
		f.setVisible(true);


		Font font=new Font("HelvLight",Font.BOLD,25);


		JTextField textField=new JTextField(10);
	    textField.setFont(font);

	    JTextField textField2=new JTextField(10);
	    textField2.setFont(font);

	    JButton btnadd=new JButton();
	    btnadd.setText("+");
	    btnadd.setFont(font);

	    JButton btnsubtract=new JButton();
	    btnsubtract.setText("-");
	    btnsubtract.setFont(font);

	    JButton btnmult=new JButton();
	    btnmult.setText("x");
	    btnmult.setFont(font);

	    JButton btndiv=new JButton();
	    btndiv.setText("/");
	    btndiv.setFont(font);

		btnadd.addActionListener(e->{

		try{
		    String addtext=textField.getText();
		    int addnum=Integer.parseInt(addtext);
		    String addtext2=textField2.getText();
		    int addnum2=Integer.parseInt(addtext2);
		    JOptionPane.showMessageDialog(null, addnum + addnum2);
		    // textField.setText(addnum + addnum2);
		    // tv.setText(addnum + addnum2);
		}catch (Exception a) {
			JOptionPane.showMessageDialog(null, "Err. Crossed Digits Limit Or Input Of Invalid Symbols");
		}
	    });

		btnsubtract.addActionListener(e->{

		try{
		    String subtext=textField.getText();
		    int subnum=Integer.parseInt(subtext);
		    String subtext2=textField2.getText();
		    int subnum2=Integer.parseInt(subtext2);
		    JOptionPane.showMessageDialog(null, subnum - subnum2);			
		}catch (Exception b) {
			JOptionPane.showMessageDialog(null, "Err : Crossed Digits Limit Or Input Of Invalid Symbols");
		}
	    });

		btnmult.addActionListener(e->{

		try{
			String multext=textField.getText();
		    int mulnum=Integer.parseInt(multext);
		    String multext2=textField2.getText();
		    int mulnum2=Integer.parseInt(multext2);
		    JOptionPane.showMessageDialog(null, mulnum * mulnum2);
		}catch (Exception c) {
			JOptionPane.showMessageDialog(null, "Err : Crossed Digits Limit Or Input Of Invalid Symbols");
		}
	    });

		btndiv.addActionListener(e->{

		try{
		    String divtext=textField.getText();
		    int divnum=Integer.parseInt(divtext);
		    String divtext2=textField2.getText();
		    int divnum2=Integer.parseInt(divtext2);
		    JOptionPane.showMessageDialog(null, divnum / divnum2);			
		}catch (Exception d) {
			JOptionPane.showMessageDialog(null, "Err : Crossed Digits Limit Or Input Of Invalid Symbols");
		}
	    });



	    f.setLayout(new FlowLayout());

	    f.add(textField);
	    f.add(textField2);
	    f.add(btnadd);
	    f.add(btnsubtract);
	    f.add(btnmult);
	    f.add(btndiv);
	    f.setVisible(true);
	}
}