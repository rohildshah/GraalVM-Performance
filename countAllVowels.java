public class countAllVowels {
	
	public static boolean isVowel(Character character) {
		character.toString().toLowerCase().charAt(0);
		if (character == 'a' ||
			character == 'e' ||
			character == 'i' ||
			character == 'o' ||
			character == 'u') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String input = String.join(" ", args);
		long beginning = System.currentTimeMillis();
		long roundStartTime = beginning;
		long vowelCount = 0;
		
		for (int i = 1; i < 10_000_000; i++) {
			vowelCount += input.chars().filter(chr -> isVowel((char) chr)).count();
			if (i % 1_000_000 == 0) {
				long roundEndTime = System.currentTimeMillis();
				System.out.println("Round " + i/1_000_000 + ": " + (roundEndTime-roundStartTime) + " ms");
				roundStartTime = roundEndTime;
			}
		}
		System.out.println(vowelCount);
	
		
	}

}
