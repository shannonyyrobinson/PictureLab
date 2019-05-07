/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
	
  public static void testScale()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.scale(beach, "smallerbeach.jpg");
  }
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture arch = new Picture("src/images/arch.jpg");
	  arch.explore();
	  arch.keepOnlyBlue();
	  arch.explore();
  }
  
  public static void testKeepOnlyRed()
  {
	  Picture arch = new Picture("src/images/arch.jpg");
	  arch.explore();
	  arch.keepOnlyRed();
	  arch.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
	  Picture arch = new Picture("src/images/arch.jpg");
	  arch.explore();
	  arch.keepOnlyGreen();
	  arch.explore();
  }
  
  public static void testNegate()
  {
	  Picture arch = new Picture("src/images/arch.jpg");
	  arch.explore();
	  arch.negate();
	  arch.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture arch = new Picture("src/images/arch.jpg");
	  arch.explore();
	  arch.grayscale();
	  arch.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture arch = new Picture("src/images/water.jpg");
	  arch.explore();
	  arch.fixUnderwater();
	  arch.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture motorcycle = new Picture("src/images/redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture motorcycle = new Picture("src/images/redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("src/images/snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("src/images/seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createMyCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
	  Picture canvas = new Picture("src/images/640x480.jpg");
	  canvas.copy(new Picture("src/images/kitten2.jpg"), 70, 70, 120, 120, 50, 50);
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.explore();
    swan.edgeDetection2(20);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	//testScale();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testCollage();
	//testMyCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}