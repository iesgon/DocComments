package a01;
import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Review of Objects
		 * 
		 */
		Point point1 = new Point(15,24);
		Point point2 = new Point(23, -46);
		Point point3 = new Point(-52, -63);
		Point point4 = new Point(0, 32);
		Point point5 = new Point(12, 0);
		
		
		
		
		//This tests the distance method
		System.out.printf("Point 1: (15,24), Point 2: (23,46), Distance: %.2f\n", distance(point1, point2));
		System.out.printf("Point 1: (15,24), Point 2: (23,46), Distance: %.2f\n", distance(point1, point3));
		System.out.printf("Point 1: (23,-46), Point 2: (-52,-63), Distance: %.2f\n", distance(point2, point3));
		System.out.println();
		//This test lets you figure out which point is the farthest from the origin
		System.out.println("If all of the following three results are the same then the distance method works.");
		System.out.printf("Point 1: (15,24), Point 2: (23,46) Point 3: (-52,63), Greatest distance from the origin: %.2f\n", greatestDistanceFromOrigin(point1, point2, point3));
		System.out.printf("Point 1: (-52, -63), Point 2: (23,46) Point 3: (-15,24),  Greatest distance from the origin: %.2f\n", greatestDistanceFromOrigin(point3, point2, point1));
		System.out.printf("Point 1: (23, -46), Point 2: (15, 24) Point 3: (-52, -63),  Greatest distance from the origin: %.2f\n", greatestDistanceFromOrigin(point2, point1, point3));
		System.out.println();
		//This check the area of the rectangle between the origin and the point
		System.out.printf("Point: (15, 24), Area: %.2f\n", area(point1));
		System.out.printf("Point: (0, 23), Area: %.2f\n", area(point4));
		System.out.printf("Point: (12, 0), Area: %.2f\n", area(point5));
		System.out.println();
		// This tests the method for seeing the first few multiples of a given int n.
		System.out.printf("Multiples of %d: %s\n", 3, Arrays.toString(firstEightMultiples(3)));
		System.out.printf("Multiples of %d: %s\n", 3, Arrays.toString(firstEightMultiples(4)));
		System.out.printf("Multiples of %d: %s\n", 3, Arrays.toString(firstEightMultiples(23)));
		System.out.println();
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(point1);
		points.add(point2);
		points.add(point3);
		points.add(point4);
		points.add(point5);
		System.out.println(points);
		System.out.println(take(points, 3));
		System.out.println(take(points, 1));
		System.out.println(take(points, 0));
		System.out.println(take(points, -1));
		//System.out.println(take(points, 6));
		
		

	}
	/**
	 *This method allows you to get the distance between two points
	 *Both points must have double values
	 * @param p1 first point
	 * @param p2 second point
	 * @return distance between the points
	 */
	public static double distance(Point p1, Point p2) {
		double distanceBetweenPoints;
		distanceBetweenPoints = p1.distance(p2);
		return distanceBetweenPoints;
	}
	
	/**
	 * This test allows you to what the farthest distance from the origin is. All are doubles
	 * @param p1
	 * @param p2
	 * @param p3
	 * @return maxDistance
	 */
	public static double greatestDistanceFromOrigin(Point p1, Point p2, Point p3){
		
		double maxDistance;
		maxDistance = Math.max(p1.distance(), Math.max(p2.distance(), p3.distance()));
		return maxDistance;
	}
	/**
	 * returns the area of the rectangle between the point given and the origin. If p is located on the x-axis
	 * or y-axis then the result will be 0. 
	 * @param  Point p
	 * @return double area
	 */
	public static double area(Point p) {
		double area;
		area = p.getX() * p.getY();
		return area;
	}
	/**
	 * This method allows the user to get back the first 8 multiples of a given integer n. it will then return an array.
	 * @param int n
	 * @return int Array[]
	 */
	
	public static int[] firstEightMultiples(int n) {
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
		for (int i = 0; i < intArray.length; i++)
		{
			intArray[i] = intArray[i]*n;
			//System.out.println(Arrays.toString(intArray));
		}
		return intArray;
	}
	public static ArrayList<Point> take(ArrayList<Point> list, int n){
		if (n < 0 || n > list.size())
			   throw new IllegalArgumentException("The list doesn't have " + n + " elements.");
		
		for (int i = list.size()-1; i >=n ; i--) {
			list.remove(i);
			
		}
		
		
		return list;
	}
}
