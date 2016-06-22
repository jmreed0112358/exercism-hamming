package hamming;

public class Hamming {
	public static Integer compute(String first, String second) {
		if ( first.length( ) != second.length( ) ) {
			throw new IllegalArgumentException();
		}
		
		Integer result = 0;
		for ( int i = 0 ; i < first.length( ) ; i++ ) {
			if ( first.charAt( i ) != second.charAt( i ) ) {
				result += 1;
			}
		}
		return result;
	}
}
