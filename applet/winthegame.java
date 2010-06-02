import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.awt.event.*; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class winthegame extends PApplet {

PFont fontA;
PFont fontB;
int numberspace = 29;
int letterspace = 15+15;
String msg = "";
String[] places = {"19:30", "15:56"}; //B D

public void setup()
{
  //bredd, h\u00f6jd
  size(170, 165);
  noStroke();
  background(240);
  fontA = loadFont("HelveticaNeue-CondensedBold-15.vlw");
  fontB = loadFont("Monospaced-11.vlw");
  textMode(SCREEN);
}

public void draw()
{ 
  background(240);
  fill(40);
  textFont(fontA, 15);
  text("A", 5,letterspace*1 + 10);
  text("B", 5,letterspace*2 + 10);
  text("C", 5,letterspace*3 + 10);
  text("D", 5,letterspace*4 + 10);
  text("1", 37,15);
  text("2", 37+numberspace*1,15);
  text("3", 37+numberspace*2+1,15);
  text("4", 37+numberspace*3+2,15);
  stroke(0);
  for(int i = 0;i<6;i++) {
    line(25, 20+(30*i), 145, 20+(30*i));
  }
  for(int i = 0;i<5;i++) {
    line(25+30*i, 20, 25+30*i, 140);
  }
  fill(240);
  ellipse(70+30, 35+30, 20, 20);
  ellipse(70+30, 35+60, 20, 20);
  ellipse(70-30, 35, 20, 20);
  ellipse(70+60, 35+90, 20, 20);
  ellipse(70, 35, 20, 20);
  ellipse(70-30, 35+60, 20, 20);
  //first cross
  line(90,25,110,45);
  line(90,45,110,25);
  //second cross
  int moveX = -30;
  int moveY = 30;
  line(90+moveX,25+moveY,110+moveX,45+moveY);
  line(90+moveX,45+moveY,110+moveX,25+moveY);
  //third cross
  moveX = -30;
  moveY = 60;
  line(90+moveX,25+moveY,110+moveX,45+moveY);
  line(90+moveX,45+moveY,110+moveX,25+moveY);
  //fourth cross
  moveX = 0;
  moveY = 90;
  line(90+moveX,25+moveY,110+moveX,45+moveY);
  line(90+moveX,45+moveY,110+moveX,25+moveY);
  //fifth cross
  moveX = 30;
  moveY = 60;
  line(90+moveX,25+moveY,110+moveX,45+moveY);
  line(90+moveX,45+moveY,110+moveX,25+moveY);
  fill(40);
  textFont(fontB,11);
  msg = PApplet.parseInt(random(0,99)) + ":" + PApplet.parseInt(random(0,99));
  if(mousePressed) {
    if(mouseX > 90-60 && mouseX < 110-60 && mouseY > 25+30 && mouseY < 45+30) {
      msg = places[0];
    } else if(mouseX > 90-30 && mouseX < 110-30 && mouseY > 25+90 && mouseY < 45+90) {
      msg = places[1];
    }
  }
  text(msg,130,155);
}

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "winthegame" });
  }
}
