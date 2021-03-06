import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  // Size of image
  public void settings() {
    size(400, 400);
  }

  // Background colour
  public void setup() {
    background(135, 206, 235);
  }

  public void draw() {
	
    // Background grass
    fill(10, 101, 24);
    rect(0, 350, 400, 50);

	  // This is the body of the house
    fill(255, 255, 255);
    rect(100, 150, 200, 200); 

    // This is the roof of the house
    fill(58, 59, 60);
    triangle(200, 50, 100, 150, 300, 150);

    // These are the windows on the house
    fill(120, 246, 252);
    rect(125, 175, 50, 50);

    fill(121, 246, 252);
    rect(225, 175, 50, 50);
    
    //These are the lines of the windows on the house
    stroke(0);
    line(150, 175, 150, 225);
    
    stroke(0);
    line(250, 175, 250, 225);

    stroke(0);
    line(125, 200, 175, 200);

    stroke(0);
    line (225, 200, 275, 200);

    // This is the door on the house
    fill(101, 67, 53);
    rect(175, 275, 50, 75);

    fill(1, 2, 3);
    rect(210, 300, 5, 5);

    // This is the tree beside the house
    fill(101, 67, 53);
    rect(325, 150, 50, 200);
  
    noStroke();
    fill(10, 101, 34);
    ellipse(350, 160, 75, 50);

    fill(10, 101, 34);
    ellipse(350, 125, 75, 50);

    fill(10, 101, 34);
    ellipse(375, 150, 75, 50);

    fill(10, 101, 34);
    ellipse(325, 150, 75, 50);

    // This is the sun
    fill(225, 225, 0);
    ellipse(50, 50, 50, 50);
  }
}