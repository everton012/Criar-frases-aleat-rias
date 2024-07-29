import java.util.Random;

public class CriarFrasesAleatorias {

	public static void main(String[] args) {
		
		String[] article = {"the", "a", "one", "some", "any"};
		String[] noun = {"boy", "girl", "dog", "town", "car"};
		String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		
		
		StringBuilder st = new StringBuilder();
		
		Random number = new Random();
		
		int limit = 5;
		
		for(int i = 0; i < 20; i++) {
			int x = number.nextInt(limit);
			st.append(article[x]);
			st.append(" ");
			st.append(noun[x]);
			st.append(" ");
			st.append(verb[x]);
			st.append(" ");
			st.append(preposition[x]);
			st.append(" ");
			int y = number.nextInt(limit);
			st.append(article[y]);
			st.append(" ");
			st.append(noun[y]);
			st.append(".");
			st.append("\n");
		}
		System.out.println(st.toString());

	}

}
