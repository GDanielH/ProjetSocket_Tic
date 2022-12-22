package com.mrwayfarout.TicTacToe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JPanel;

public class Painter extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	TicTacToe toe;
	
	public Painter(TicTacToe toe) {
		this.toe=toe;
		setFocusable(true);
		requestFocus();
		setBackground(Color.WHITE);
		addMouseListener(this);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		toe.render(g);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (toe.accepted) {
			if (toe.yourTurn && !toe.unableToCommunicateWithOpponent && !toe.won && !toe.enemyWon) {
				int x = e.getX() / toe.lengthOfSpace;
				int y = e.getY() / toe.lengthOfSpace;
				y *= 3;
				int position = x + y;

				if (toe.spaces[position] == null) {
					if (!toe.circle) toe.spaces[position] = "X";
					else toe.spaces[position] = "O";
					toe.yourTurn = false;
					repaint();
					Toolkit.getDefaultToolkit().sync();

					try {
						toe.dos.writeInt(position);
						toe.dos.flush();
					} catch (IOException e1) {
						toe.errors++;
						e1.printStackTrace();
					}

					System.out.println("DATA WAS SENT");
					toe.checkForWin();
					toe.checkForTie();

				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

}