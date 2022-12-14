
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class ViewInventory extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void ViewInv() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewInventory viewframe = new ViewInventory();
					viewframe.setSize(1000,750);
					viewframe.setVisible(true);
					viewframe.setResizable(false);                    
					viewframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewInventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel viewTitle =  new JLabel("VIEW INVENTORY");
		viewTitle.setBounds(380, 15, 343, 40);
		viewTitle.setFont(new Font("Algerian", Font.PLAIN, 30));
		contentPane.add(viewTitle);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mainMenu = new MainMenu();
				mainMenu.showMenu();
			}
		});
		back.setBounds(6, 15, 73, 29);
		contentPane.add(back);
	}
}