public abstract class AbstractProgression {

	protected long current;
	public AbstractProgression() { this(0); }
	public AbstractProgression(long start) { current = start; }

	public long nextValue() {		// this is a concrete method
		long answer = current;
		advance();	// this protected call is responsible for advce
		return answer;
	}

	public void printProgression(int n) {	// this is a concrete method
		System.out.print(nextValue());	// print first value without space
		for(int j=1; j<n; j++)
			System.out.print(" " + nextValue()); // print leading space before others
		System.out.println();	// end the line
	}

	protected abstract void advance();	// notice the lack of a method body
}
