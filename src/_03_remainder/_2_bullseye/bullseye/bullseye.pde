
void setup() {
   size(1000,1000);
  // set the size of your sketch
  
}

void draw() {
  for (int i = 1000; i > 0; i-=50) {
    if (i % 2 == 0) {
      stroke(255,0,0);
    }
    else {
      stroke(250,250,250);
    }
     ellipse(500,500,i,i);
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
