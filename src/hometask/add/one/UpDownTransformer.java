package hometask.add.one;

public class UpDownTransformer extends TextTransformer {

	@Override
	public String transform(String text) {
		String upDownText = "";
		char[] charUpArr = text.toUpperCase().toCharArray();
		char[] charDownArr = text.toLowerCase().toCharArray();
		for (int i = 0; i < charUpArr.length; i++) {
			if ((i + 1) % 2 != 0) {
				upDownText += charUpArr[i];
			} else {
				upDownText += charDownArr[i];
			}
		}
		return upDownText;
	}
}