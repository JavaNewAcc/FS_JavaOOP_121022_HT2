package hometask.add.one;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		TextTransformer textTransformer = new TextTransformer();
//		TextTransformer textTransformer = new InverseTransformer();
//		TextTransformer textTransformer = new UpDownTransformer();

		File file = new File("TextTransformer.txt");

		TextSaver textSaver = new TextSaver();
		textSaver.setFile(file);
		textSaver.setTransformer(textTransformer);
		textSaver.saveTextToFile("Hello textTransformers!");
	}
}