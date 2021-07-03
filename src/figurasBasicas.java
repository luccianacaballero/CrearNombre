import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class figurasBasicas extends PApplet {
  public void setup() {

// dibujando un punto
//point(200,200);
// NOMBRRE: LUCCIANA
// LETRA L
line(5,5,5,100);
line(5,100,100,100);
line(30,5,30,80);
line(30,80,100,80);
line(5,5,30,5);
line(100,80,100,100);
//LETRA U
line(105,5,105,100);
line(105,100,195,100);
line(195,5,195,100);
line(135,5,135,80);
line(135,80,165,80);
line(165,5,165,80);
line(105,5,135,5);
line(165,5,195,5);
//LETRA C
line(200,5,200,100);
line(200,100,295,100);
line(200,5,295,5);
line(230,20,230,80);
line(230,20,295,20);
line(295,5,295,20);
line(230,80,295,80);
line(295,80,295,100);
//LETRA C
line(300,5,300,100);
line(300,5,395,5);
line(300,100,395,100);
line(330,20,330,80);
line(330,20,395,20);
line(330,80,395,80);
line(395,5,395,20);
line(395,80,395,100);
//LETRA I 
line(400,5,430,5);
line(400,5,400,100);
line(430,5,430,100);
line(400,100,430,100);
//LETRA A
line(435,5,435,100);
line(530,5,530,100);
line(435,5,530,5);
line(475,55,465,100);
line(490,55,505,100);
line(475,55,490,55);
line(435,100,465,100);
line(505,100,530,100);
line(482,30,482,40);
//LETRA N
line(535,5,535,100);
line(535,5,565,5);
line(565,55,565,100);
line(535,100,565,100);
line(565,55,595,100);
line(595,100,630,100);
line(630,5,630,100);
line(600,5,630,5);
line(565,5,600,55);
line(600,5,600,55);
//LETRA A
line(635,5,635,100);
line(675,55,665,100);
line(635,5,730,5);
line(730,5,730,100);
line(675,55,689,55);
line(689,55,699,100);
line(635,100,665,100);
line(699,100,730,100);
line(682,30,682,40);


// dibujando un triangulo
//triangle(200,300,300,100,100,100);




// dibujando un circulo
//ellipse(200,200,200,200);

// dibujando un elipse
//ellipse(200,200,200,300);

// dibujando un cuadrado
//rect(100,100,100,100);

// cdibujando un rectangulo
//rect(100,100,100,200);

// tamanho de la ventana

    noLoop();
  }

  public void settings() { 
size(800,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "figurasBasicas" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
