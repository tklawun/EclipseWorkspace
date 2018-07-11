package program;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class HelloWorldWindow {

	private JFrame frmMiniJavaProgram;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldWindow window = new HelloWorldWindow();
					window.frmMiniJavaProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorldWindow() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiniJavaProgram = new JFrame();
		frmMiniJavaProgram.setTitle("Mini Java Program");
		frmMiniJavaProgram.setBounds(100, 100, 397, 206);
		frmMiniJavaProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiniJavaProgram.getContentPane().setLayout(new GridLayout(3, 1));

		JLabel lblJavaVersion = new JLabel("Java Version");
		lblJavaVersion.setText("startet with Java Version ");
		lblJavaVersion.setHorizontalAlignment(SwingConstants.LEFT);
		lblJavaVersion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JLabel lblJavaVersion01 = new JLabel("  Java Version:");
		lblJavaVersion01.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJavaVersion.setText(System.getProperty("java.version"));
		lblJavaVersion.setHorizontalAlignment(SwingConstants.LEFT);
		lblJavaVersion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JLabel lblJavaHome = new JLabel(" ");
		lblJavaHome.setText(System.getProperty("java.home"));
		lblJavaHome.setToolTipText(lblJavaHome.getText());
		lblJavaHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblJavaHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JLabel lblJavaHome01 = new JLabel("  Java Home:");
		lblJavaHome01.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJavaHome.setText(System.getProperty("java.home"));
		lblJavaHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblJavaHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JButton btnNew = new JButton("Start Control Panel");
		btnNew.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String javactl = System.getProperty("java.home") + "\\bin\\javacpl.exe";
					ProcessBuilder proc = new ProcessBuilder(javactl);
					proc.start();
				} catch (Exception e1) {
					System.out.println("Fehler aufgetreten! " + e1);
				}
			}
		});
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frmMiniJavaProgram.getContentPane().add(lblJavaVersion01);
		frmMiniJavaProgram.getContentPane().add(lblJavaVersion);
		frmMiniJavaProgram.getContentPane().add(lblJavaHome01);
		frmMiniJavaProgram.getContentPane().add(lblJavaHome);
		frmMiniJavaProgram.getContentPane().add(btnNew);
		frmMiniJavaProgram.getContentPane().add(btnClose);
		frmMiniJavaProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public String startJavaControlPanel() throws Exception {

		// try {
		String javactl = System.getProperty("java.home") + "\\javactl.exe";
		ProcessBuilder proc = new ProcessBuilder(javactl);
		proc.start();
		return "Java Control Panel started";
		/*
		 * } catch (Exception e) { return "Java Control Panel not started."; }
		 */
	}
}
