
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
boolean canPlaySounds = true;

void setup() {
  
  //Find a Where's Waldo picture and drop it into this sketch.     
PImage   waldo = loadImage("waldo.png"); // Change this to match your file name.
  size(600, 400); 
  // Resize your waldo picture to the same size as the sketch
  waldo.resize(600, 400);
  // Make the waldo image your sketch background
background(waldo);
}

void draw() {

      // If the user presses the mouse .......
  if(mousePressed){
println("X: " + mouseX + " Y: " + mouseY); 
if(mouseX>370&&mouseY>201&&mouseX<417&&mouseY<275){
  textSize(33);
  text("Waldo found!", 200, 200);
  if (canPlaySounds) {
                    playWoohoo();// Use the playWhoohoo() method below. You can change the sound if you want 
                } 
  }else{
    textSize(33);
   text("Not found!", 300, 100); 
   if (canPlaySounds) {
                    playDoh();// Use the playDoh() method below. You can change the sound if you want 
                }    
  }}
          // Use this print statement to help you find the location of Waldo to use in the code below
           //println("X: " + mouseX + " Y: " + mouseY); 
   //x: 370 y: 201
   //x: 417 y: 201
   //x:370 y: 275
   //x:417 y: 275
          // Check if the location of the mouse is anywhere on the image of Waldo.
          // If it is, print “Waldo found!”  Use the text() command to write it on the sketch.
          
                
    
          // However, if the mouse is not on Waldo, print "Not here!" 
          // Use the text() command to write it on the sketch. 
          
              
                
}

/*********************  This code is needed to play sounds. ********************
              Remove the comment markers below, but DON'T CHANGE THE CODE */
              


import ddf.minim.*;
Minim minim = new Minim(this); 

AudioSample woohoo;
void playWoohoo() {
     if (woohoo == null) 
         woohoo = minim.loadSample("homer-woohoo.wav");
     woohoo.stop();
     woohoo.trigger();
}

AudioSample doh;
void playDoh() {
     if (doh == null)
         doh = minim.loadSample("homer-doh.wav"); 
     doh.stop();
     doh.trigger();
}
