package LinesDemo;


import java.awt.Color;
import java.awt.Graphics;

//Trivial - What is the function of Class CanvasBackground?
public class GetInputForLines extends CanvasBackground {
	
	private static Integer[] input;
	private String[] label;
	private static int count;
	private Integer[] transfer;
	int inc;
	static int max;
	static int maxMarker;
	Color[] ColorArray = {Color.RED, Color.getHSBColor(-100, -100, -300), Color.YELLOW, Color.getHSBColor(-100, 100, 100), Color.ORANGE, Color.BLUE, Color.getHSBColor(-10, 10, -5), Color.getHSBColor(-300, -200, -300), Color.WHITE, Color.BLACK, Color.getHSBColor(-300, -300, -300), Color.getHSBColor(-200, -200, -200), Color.getHSBColor(-100, -100, -100), Color.getHSBColor(0, 0, 0), Color.getHSBColor(100, 100, 100)};
	private String title;

	public GetInputForLines(Integer[] input, String[] label, String title){
		this.input = input;
		this.count = input.length;
		this.label = label;
		transfer = new Integer[count];
		this.transfer = input;
		this.title = title;
	}
	
	public static int CalMax() {
		for (int a=1; a < count; a++) {
			if (input[a] > input[a-1]) {
				max = input[a];
			}
			else if (input[a] < input[a-1])
			{
				max = input[a-1];
			}
		}
		maxMarker = max+(max%50)+((50-(max%50))*2);
		return maxMarker;
	}


	protected void paintComponent(Graphics g) {
		inc = 0;
		super.paintComponent(g);
			for (int a=0; a < count; a++) {
				g.setColor(ColorArray[a]);
				g.drawLine(100+inc, maxMarker, 100+inc, maxMarker-transfer[a]);
				g.drawString(label[a], 100+inc, maxMarker+20);
				inc += 50;
			}
			
			//title
			g.setColor(Color.WHITE);
			g.drawString(title, (50*count+10)/2, 20);
			
			//horizontal line
			g.setColor(Color.BLACK);
			g.drawLine(20, maxMarker, 50*(count+2), maxMarker);
			//vertical line
			g.setColor(Color.BLACK);
			g.drawLine(50, maxMarker, 50, 20);
			
			//vertical markers
			for (int a = 50; a < maxMarker; a+=50) {
				g.setColor(Color.WHITE);
				g.drawLine(50, 0+a, 55, 0+a);
			}
			
			//horizontal markers //not applicable here
			/*for (int a = 50; a < 50*(count+1); a+=50) {
				g.setColor(Color.WHITE);
				g.drawLine(50+a, maxMarker, 50+a, maxMarker+5);
			}*/
			
			//vertical marker values
			//index 0 is not printed
			int i = 1;
			Integer count;
			String strArray;
			for (int a = 50; a < maxMarker; a+=50) {
				g.setColor(Color.WHITE);
				count = a;
				strArray = count.toString();
				g.drawString(strArray , 20, maxMarker-(0+a));
				i+=1;
			}
	}
}
