package lab1_strategy.solution;

import java.awt.Point;
import java.awt.event.MouseEvent;

public class ScribbleTool implements Tool {
	protected ScribbleCanvas canvas;

	public ScribbleTool(ScribbleCanvas canvas) {
		this.canvas = canvas;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Point p = e.getPoint();
		canvas.mouseButtonDown = true;
		canvas.x = p.x;
		canvas.y = p.y;

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		canvas.mouseButtonDown = false;

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = e.getPoint();
		if (canvas.mouseButtonDown) {
			canvas.getOffScreenGraphics().drawLine(canvas.x, canvas.y, p.x, p.y);
			int xs = Math.min(canvas.x, p.x);
			int ys = Math.min(canvas.y, p.y);
			int dx = Math.abs(p.x - canvas.x) + 1;
			int dy = Math.abs(p.y - canvas.y) + 1;
			canvas.repaint(xs, ys, dx, dy);
			canvas.x = p.x;
			canvas.y = p.y;
		}

	}

}
