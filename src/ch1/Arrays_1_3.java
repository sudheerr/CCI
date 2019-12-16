package ch1;

public class Arrays_1_3 {

	public static void main(String[] args) {
		
		String input = "Mr John Smith    ";
	//	String str = replaceSpaces(input, 13);
	//	System.out.println("Replaced Str : " + str);
		
		String output =replaceSpaces(input.toCharArray(), 13);
		System.out.println("Output : " + output);
	}

	static String replaceSpaces(String input, int len) {

		char[] chars = input.toCharArray();
		int mylen = chars.length;
		for (int i = 0; i < len; i++) {
			char ch = chars[i];
			if (ch == ' ') {
				chars[i] = '%';
				for (int j = mylen - 3; j > i; j--) {
					chars[j + 2] = chars[j];
				}
				chars[i + 1] = '2';
				chars[i + 2] = '0';
			}
		}

		return String.valueOf(chars);
	}

	static String replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;
		if (trueLength < str.length)
			str[trueLength] = '\0'; // End array
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
		
		return String.valueOf(str);
	}

}
