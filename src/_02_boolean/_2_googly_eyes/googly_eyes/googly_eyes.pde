PImage Face;
void setup() {
  size(800, 600);
  Face=loadImage("face.png");
  Face.resize(800, 600);
  background(Face);
}

void draw() {
  background(Face);
  fill(#FFFFFF);
  ellipse(225, 325, 275, 275);
  fill(0, 0, 0);
  ellipse(mouseX, mouseY, 100, 100);
  fill(#FFFFFF);
  ellipse(575, 325, 275, 275);
  fill(0,0,0);
  ellipse(mouseX+350, mouseY, 100, 100);
  if(mouseX<88){
  mouseX=88;  
}
if(mouseY<188){
mouseY=188;
}
if(mouseX>362){
mouseX=362;
}
if(mouseY>462){
  mouseY=462;
}

}
