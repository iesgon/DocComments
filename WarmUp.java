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
		/*
		 * generates a random number between -100 & 100 and calls firstEightMultiples
		 * method 5x
		 */
		for (int i = 0; i < 5; i++)
		{
			int random = ((int) (Math.random() * (100 + 100)) - 100);
			System.out.println("First 8 Multiples of " + random + " = " + Arrays.toString(firstEightMultiples(random)));
		}
		System.out.println();

		/*
		 * create three different sized String Arrays and pass them to firstAndLastToXXX
		 * method
		 */
		String emptyArray[] = new String[0];
		String oneIndexArray[] =
		{ "Happy:)" };
		String bigArray[] =
		{ "A1", "B2", "C3", "D4" };

		firstAndLastToXXX(emptyArray);
		firstAndLastToXXX(oneIndexArray);
		firstAndLastToXXX(bigArray);
		System.out.println();

		// create 3 Point Arrays of 3 different sizes and pass it to content method
		Point multiplePoints[] =
		{ point1, point2, point3, point4, point5 };
		Point onePoint[] =
		{ point3 };
		Point noPoint[] = new Point[0];

		System.out
				.println("Points: " + Arrays.toString(multiplePoints) + " Expected String:" + content(multiplePoints));
		System.out.println("Points: " + Arrays.toString(onePoint) + " Expected String:" + content(onePoint));
		System.out.println("Points: " + Arrays.toString(noPoint) + " Expected String:" + content(noPoint));
		System.out.println();

		// Make 3 different sized array lists and pass to hyphenate method
		ArrayList<String> multipleSyllables = new ArrayList<String>();
		multipleSyllables.add("Beau");
		multipleSyllables.add("ti");
		multipleSyllables.add("ful");

		ArrayList<String> oneSyllable = new ArrayList<String>();
		oneSyllable.add("Hi");

		ArrayList<String> noSyllable = new ArrayList<String>();

		System.out.println("Syllables:" + multipleSyllables + " Expected String: " + hyphenate(multipleSyllables));
		System.out.println("Syllables:" + oneSyllable + " Expected String: " + hyphenate(oneSyllable));
		System.out.println("Syllables:" + noSyllable + " Expected String: " + hyphenate(noSyllable));
		System.out.println();
		
		//selecting a char and passing it to moreOfTheSame method
		System.out.println(moreOfTheSame('X'));
		System.out.println(moreOfTheSame('-'));
		System.out.println(moreOfTheSame('@'));
		System.out.println();
		
		//create an Point Array list and pass it to take method with different integer sizes. will throw an exception
		ArrayList <Point> pointArrList = new ArrayList<>();
		pointArrList.add(point1);
		pointArrList.add(point2);
		pointArrList.add(point3);
		pointArrList.add(point4);
		pointArrList.add(point5);
		
		System.out.println("List: "+ pointArrList + " ExpectedList: "+take(pointArrList,3));
		System.out.println("List: "+ pointArrList + " ExpectedList: "+take(pointArrList,1));
		System.out.println("List: "+ pointArrList + " ExpectedList: "+take(pointArrList,0));
		System.out.println("List: "+ pointArrList + " ExpectedList: "+take(pointArrList,6));
		System.out.println("List: "+ pointArrList + " ExpectedList: "+take(pointArrList,-1));
		

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
	 * Returns an array that includes the first 8 multiples of n
	 * 
	 * @param n int to find multiples of
	 * @return int array of first 8 multiples of n
	 */
	public static int[] firstEightMultiples(int n)
	{
		int multiplesOfN[] = new int[8];
		for (int i = 0; i < 8; i++)
		{
			multiplesOfN[i] = n * (i + 1);
		}
		return multiplesOfN;
	}

	/**
	 * First and last elements of String array point to "XXX". Prints out Original
	 * String Array and Post String Array
	 * 
	 * @param strings String Array
	 */
	public static void firstAndLastToXXX(String[] strings)
	{
		System.out.print("Before:" + Arrays.toString(strings));
		String str = "XXX";
		if (strings.length == 0)
		{
		} else if (strings.length == 1)
		{
			strings[0] = str;

		} else
		{
			strings[0] = str;
			strings[strings.length - 1] = str;

		}
		System.out.println(" After:" + Arrays.toString(strings));

	}

	/**
	 * Create a string that includes all points of the array separated by a period.
	 * if the array is empty, an empty string will be returned/
	 * 
	 * @param points Array of Points
	 * @return a string
	 */
	public static String content(Point[] points)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < points.length; i++)
		{
			if (!(i == 0))
			{
				sb.append('.');
			}
			sb.append(points[i]);
		}
		return sb.toString();

	}

	/**
	 * Creates a String that includes all syllables of the list separated by dashes.
	 * if list is empty, an empty string returns.
	 * 
	 * @param syllables array list
	 * @return String
	 */
	public static String hyphenate(ArrayList<String> syllables)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < syllables.size(); i++)
		{
			if (i != 0)
			{
				sb.append('-');
			}
			sb.append(syllables.get(i));
		}
		return sb.toString();
	}

	/**
	 * Create and returns a list of type ArrayList<String> that includes 5 strings. the first string has length 1 and includes character provided as an argument once. the second string has length 2 and includes the character twice, etc. the fifth string has length 5 and includes the character 5 times.
	 * @param c char
	 * @return Array List
	 */
	public static ArrayList<String> moreOfTheSame (char c)
	{
		ArrayList<String> moreOfTheSame = new ArrayList<>();
		String str = "";
		for(int i = 1; i < 6; i++)
		{
			str += c;		
			moreOfTheSame.add(str);

		}
		return moreOfTheSame;
	}
	/**
	 * crates and returns a new list that includes the first n points from the list provided as an argument.
	 * @param list Point Array List
	 * @param n int first amount of points
	 * @return a new Point Array list of n amount of points inside given Point Array list.
	 */
	public static ArrayList<Point> take(ArrayList<Point> list, int n)
	{
		ArrayList<Point> newArray = new ArrayList<>();
		
		if (n < 0 || n > list.size())
			   throw new IllegalArgumentException("The list doesn't have " + n + " elements.");

		for(int i = 0; i < n;i++)
		{
			newArray.add(list.get(i));
		}
		
		
		return newArray;
		
	}
	/*
	
	/**
	 * This method allows the user to get back the first 8 multiples of a given integer n. it will then return an array.
	 * @param int n
	 * @return int Array[]
	 */
	/*
	public static int[] firstEightMultiples(int n) {
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
		for (int i = 0; i < intArray.length; i++)
		{
			intArray[i] = intArray[i]*n;
			//System.out.println(Arrays.toString(intArray));
		}
		return intArray;
	}
	/**
	 * Returns an Array list that has had some elements removed depending on n.
	 *Returns and exception if n is larger than the size of the array list or if n is smaller than 0
	 * @param list
	 * @param n
	 * @return
	 * @author Iesus Gonzalez
	 */
	/*
	public static ArrayList<Point> take(ArrayList<Point> list, int n){
		if (n < 0 || n > list.size())
			   throw new IllegalArgumentException("The list doesn't have " + n + " elements.");
		
		for (int i = list.size()-1; i >=n ; i--) {
			list.remove(i);
			
		}
		
		
		return list;
	}*/
}
