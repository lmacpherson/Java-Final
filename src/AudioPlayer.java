/**
 * @author Juo-Wei, Bansi, Lauran
 * Java Programming
 * CS170-01
 * Final Project
 */

import java.io.File; 
import java.io.IOException; 
  
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException; 

public class AudioPlayer {
	
	AudioInputStream audioInputStream;
	Clip clip;
	String filePath;
	
	public AudioPlayer(String fp) throws UnsupportedAudioFileException, 
		IOException, LineUnavailableException
	{ 
	    // create AudioInputStream object
		this.filePath = fp;
		audioInputStream =  
	    AudioSystem.getAudioInputStream(new File(fp).getAbsoluteFile()); 
	  
		// create clip reference 
		clip = AudioSystem.getClip(); 
	  
		// open audioInputStream to the clip 
	    clip.open(audioInputStream); 
	}
	
	// Method to play the audio 
    public void play()  
    { 
        //start the clip 
        clip.start();
    }
    
    public void resumeAudio() throws UnsupportedAudioFileException, 
    	IOException, LineUnavailableException  
	{ 
		clip.close(); 
		resetAudioStream(); 
		this.play(); 
	} 
    
    // Method to reset audio stream 
    public void resetAudioStream() throws UnsupportedAudioFileException, 
    	IOException, LineUnavailableException  
    { 
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()); 
        clip = AudioSystem.getClip();
        clip.open(audioInputStream); 
    } 
}
