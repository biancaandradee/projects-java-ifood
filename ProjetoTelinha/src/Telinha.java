import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Telinha extends JFrame {

	JButton botao;

	public Telinha() {
		setBounds(1900, 0, 320, 240);
		setTitle("Teste");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		botao = new JButton();
		botao.setBounds(50, 50, 120, 50);
		botao.setText("Clique aqui!");
//		botao.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(Telinha.this,  "Clicou no botão!");
//			}
//		});
		botao.addActionListener(new EventoBotao() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Telinha.this,  "Clicou no botão!");

			}
		});
		
		getContentPane().add(botao);
		repaint();

	}
}
