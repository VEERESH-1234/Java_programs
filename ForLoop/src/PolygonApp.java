
public class PolygonApp {
	public void Display(int side)
	{
		switch(side)
		{
		case 3:System.out.println("Triangle");
		         break;
		case 4:System.out.println("Quadrilateral");
		         break;
		case 5:System.out.println("Pentagon");
		         break;
		case 6:System.out.println("Hexagon");
		         break;
		case 7:System.out.println("Hectagon");
		         break;
		case 8:System.out.println("Octagon");
		         break;
		case 9:System.out.println("Nanogon");
		         break;
		default :System.out.println("Polygon");
		         break;
		}
	}

}
