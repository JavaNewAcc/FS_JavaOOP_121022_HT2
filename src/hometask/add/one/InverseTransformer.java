package hometask.add.one;

public class InverseTransformer extends TextTransformer {

	@Override
	public String transform(String text) {
		String textRev = "";
		char[] charArr = text.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--) {
			textRev += charArr[i];
		}
		return textRev;
	}
}