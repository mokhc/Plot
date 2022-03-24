package LinesDemo;


import java.io.PrintStream;

import javax.swing.JFrame;


public class CanvasLinesApplication extends GetInputForLines {
	
	public CanvasLinesApplication(Integer[] input, String[] label, String title) {
		super(input, label, title);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PrintStream ps = System.out;
		Integer[] input = {10, 20, 30, 40, 50, 60, 70, 80, 200, 300, 200};
		String[] label = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
		String title = "Line Chart";
		JFrame jf1 = new JFrame();
		GetInputForLines ifl1 = new GetInputForLines(input, label, title);
		jf1.add(ifl1);
		jf1.setSize(input.length*50+100,CalMax()+300);
		ps.println(CalMax());
		jf1.setVisible(true);
	}
}
