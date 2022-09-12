package main;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	public void play() {
		// Carregar o arquivo de audio
		File file = new File("som/laser1.wav");
		// Tratamento de exceções(arquivo nao encontrado, formato etc)
		try {
			AudioInputStream audio = AudioSystem.getAudioInputStream(file);
		// Controle do audio(reprodução, pause, avanço etc)
			Clip clip = AudioSystem.getClip();
			clip.open(audio);
			clip.start();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
