package day58;

public interface Drawable {
	
	public static final String DRAWING_TOOL = "pen";
	public abstract void draw();
	public default void drawLine(int n) {
		System.out.println("Drwaing" + n + "Line");
	}
	
	public static void printDrawingTool() {
		System.out.println("MY TOOL IS "+ DRAWING_TOOL);
	}

}
