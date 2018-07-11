package program;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;

public class HelloJavaWorld {

	private JFrame frmHelloJavaWorld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloJavaWorld window = new HelloJavaWorld();
					window.frmHelloJavaWorld.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloJavaWorld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHelloJavaWorld = new JFrame();
		frmHelloJavaWorld.setTitle("Hello Java World");
		frmHelloJavaWorld.setBounds(100, 100, 450, 300);
		frmHelloJavaWorld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHelloJavaWorld.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
