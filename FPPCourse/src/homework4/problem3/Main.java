package homework4.problem3;

public class Main {
	public static void main(String []args) {
		UpwardHat upward = new UpwardHat();
		DownwardHat downward = new DownwardHat();
		FaceMaker face = new FaceMaker();
		Vertical lines = new Vertical();
		Figure[] figs = {upward, upward, downward, face, lines};
		for(Figure fig : figs)
			fig.getFigure();
		
		for(Figure fig : figs) {
			System.out.println();
			System.out.print(fig.getClass().getSimpleName()+" : ");
			fig.getFigure();
		}
	}
}
