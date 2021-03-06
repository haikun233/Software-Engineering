package views;
import javax.swing.*;

import views.Frame;

import java.awt.*;

public class Frame extends JFrame {
    private JLabel statusBar;
    private GamePenal gameBoard;

    
    public Frame() {
        statusBar = new JLabel("Gaming");
        gameBoard = new GamePenal(this);
    }

    public void init() {
        setLayout(new BorderLayout());
        add(statusBar, BorderLayout.NORTH);
        add(gameBoard, BorderLayout.CENTER);
        gameBoard.start();
        setSize(400, 800);
        setPreferredSize(new Dimension(400, 800));
        setTitle("決戰俄羅斯");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);
    }

    JLabel getStatusBar() {
        return statusBar;
    }
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame game = new Frame();
					game.setVisible(true);
					game.setLocationRelativeTo(null);
					game.init();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
}