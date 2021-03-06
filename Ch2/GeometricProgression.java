
public class GeometricProgression extends Progression {

	protected long base;

	/** Constructs progression 1, 2, 3, 4, 8, 16, ... */
	public GeometricProgression(){ this(2, 1); }

	/** Constructs progression 1, b, b^2, b^3, ... for base b */
	public GeometricProgression(long b) { this(b, 1); }

	/** Constructs geometric progression with arbitrary base and start */
	public GeometricProgression(long b, long start) {
		super(start);
		base = b;
	}

	/** Multiplies the current value by the geometric base. */
	protected void advance() {
		current *= base;	// multitply current by geometric base
	}
}
