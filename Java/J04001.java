import java.util.*;

class Point {
	double x;
	double y;
	
	void input(Scanner scanner) {
		this.x = scanner.nextDouble();
		this.y = scanner.nextDouble();
	}
	
	double distance(Point p) {
		double x0 = this.x -p.x;
		double y0 = this.y -p.y;
		return Math.sqrt(x0 * x0 + y0 * y0);
	}
	
}

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int t = scanner.nextInt();
    	while(t-->0) {
    		Point A = new Point();
    		Point B = new Point();
    		A.input(scanner);
    		B.input(scanner);
            System.out.printf("%.4f\n",A.distance(B));
    	}

    	scanner.close();
    }
}
