/**
 * @author Juo-Wei, Bansi, Lauran
 * Java Programming
 * CS170-01
 * Final Project
 */

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MathGameApp {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		GameFrame frame = new GameFrame();
		
		frame.setVisible(true);
		frame.gameloop();
	}

}
