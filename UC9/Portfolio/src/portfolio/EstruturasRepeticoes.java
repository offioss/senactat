package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class EstruturasRepeticoes extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstruturasRepeticoes dialog = new EstruturasRepeticoes();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public EstruturasRepeticoes() {
		setBounds(100, 100, 450, 300);

	}

}
