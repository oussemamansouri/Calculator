
import java.awt.*;
import java.awt.event.*;


public class Calculatrice implements ActionListener,ItemListener {
	
	Frame F;
	TextField T1,T2,T3;
	Label L,L2;
	Button B,B2;
	CheckboxGroup G;
	Checkbox C1,C2,C3,C4;
	Panel P1,P2,P3,P4;
	Dialog D;
	
	public Calculatrice (){
	
		F = new Frame("Calculatrice");
		F.setSize(500,200);
		F.setLayout(new BorderLayout());
		
		D = new Dialog(F);
		L2 = new Label();
		B2 = new Button("OK");
		P3 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		P4 = new Panel(new FlowLayout());	
		T1 = new TextField("Valeur1");
		T2 = new TextField("Valeur2");
		T3 = new TextField("    ");
		B = new Button("=");
		
		G = new CheckboxGroup();
		P1 = new Panel(new FlowLayout());
		P2 = new Panel(new FlowLayout());
		L = new Label(" * ");
		
	}
	
	public void affiche_Calculatrice () {
		T3.setSize(T1.getSize());
		P1.add(T1);
		T1.selectAll();
		L.setSize(70,60);
		P1.add(L);
		// L.show();
		P1.add(T2);
		T2.selectAll();
		P1.add(B);
		P1.add(T3);
		C1 = new Checkbox(" + ",G,false);
		C2 = new Checkbox(" - ",G,false);
		C3 = new Checkbox(" * ",G,true);
		C4 = new Checkbox(" / ",G,false);
		P2.add(C1);
		P2.add(C2);
		P2.add(C3);
		P2.add(C4);
		F.add(P1,BorderLayout.NORTH);
		F.add(P2,BorderLayout.SOUTH);
		F.show();
		B.addActionListener(this);
		C1.addItemListener(this);
		C2.addItemListener(this);
		C3.addItemListener(this);
		C4.addItemListener(this);
		F.addWindowListener(new Fermer1());
		//G.getSelectedCheckbox().addItemListener(this);
		D.addWindowListener(new Fermer1());
		D.setTitle("Error 404");
		P3.add(L2);D.setLayout(new GridLayout(2,1));
		D.add(P3);
		P4.add(B2);
		B2.addActionListener(this);
		D.add(P4);
	}
	
	public void actionPerformed(ItemEvent ee) {
		if(ee.getSource() == G.getSelectedCheckbox()) {
			L.setText(G.getSelectedCheckbox().getLabel());
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
		if(e.getSource() == B) {
			
			double N1 = Double.parseDouble(T1.getText());
			double N2 = Double.parseDouble(T2.getText());
			
			if(L.getText() == " + ") {
				T3.setText(String.valueOf(N1+N2));
			}
			if(L.getText() == " - ") {
				T3.setText(String.valueOf(N1-N2));
			}
			if(L.getText() == " * ") {
				T3.setText(String.valueOf(N1*N2));
			}
			if(L.getText() == " / ") {
				if(N2 == 0) {
					D.setSize(200,125);
					L2.setText("La division sur 0 est impossible.");
					D.setVisible(true);
				}
				else {
					T3.setText(String.valueOf(N1/N2));
				}
			}
		}
		}
		catch(Exception exp) {
			D.setSize(300,200);
			L2.setText("Une valeur ou les deux valeurs n\'est pas numérique !!");
			D.setVisible(true);
		}
		if(e.getSource() == B2) {
			D.dispose();
		}
		
	}
	
	public static void main(String[] args) {
		Calculatrice cal = new Calculatrice();
		cal.affiche_Calculatrice();
	}
	
	
	public void itemStateChanged(ItemEvent item) {
		L.setText((String)item.getItem());
	}
	

}

class Fermer1 extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
