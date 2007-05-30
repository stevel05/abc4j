package abc.ui.swing.score;

import java.awt.geom.Point2D;

import abc.notation.TimeSignature;

public class TimeSignatureRenderer {
	
	public static double render(ScoreRenditionContext context, Point2D base, TimeSignature timeSig){
		//System.out.println("base for time : " + base);
		char[] numChars = getChar(timeSig.getNumerator());
		char[] denomChars = getChar(timeSig.getDenominator());
		context.getGraphics().drawChars(numChars, 0, 1, 
				(int)base.getX(), (int)(base.getY()-context.getNoteHeigth()*3.1));
		context.getGraphics().drawChars(denomChars, 0, 1, 
				(int)base.getX(), (int)(base.getY()-context.getNoteHeigth()*0.9));
		return context.getNoteWidth();
	}
	
	public static char[] getChar(int number) {
		char[] chars = null;
		switch (number) {
			case 1 : chars = ScoreRenditionContext.NUMBER_1; break;
			case 2 : chars = ScoreRenditionContext.NUMBER_2; break;
			case 3 : chars = ScoreRenditionContext.NUMBER_3; break;
			case 4 : chars = ScoreRenditionContext.NUMBER_4; break;
			case 5 : chars = ScoreRenditionContext.NUMBER_5; break;
			case 6 : chars = ScoreRenditionContext.NUMBER_6; break;
			case 7 : chars = ScoreRenditionContext.NUMBER_7; break;
			case 8 : chars = ScoreRenditionContext.NUMBER_8; break;
			case 9 : chars = ScoreRenditionContext.NUMBER_9; break;
			default : throw new IllegalArgumentException("no number matching " + number);
		}
		return chars;
	}
}
