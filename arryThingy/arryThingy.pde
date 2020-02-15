/* Paste the code into a new Processing sketch and complete the steps. */

//1. create an array of ints. don't initialize it yet.
int[] intsAndStuff;
void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
  size(600, 600);

  //3. initialize your array with the built in width variable
  intsAndStuff = new int[width];
  //4. initialize the ints in the array with random numbers
  randomize();
  //   from 0 to the built in height variable  
  //5. call the noStroke() method
  noStroke();

}

void draw() {
  //6. set the background color with background(r, g, b);
  background(100, 100, 100);
  //7. set the color for your graph
  
  //8. draw a rectangle for each int in your array.
  for(int i = 0; i < intsAndStuff.length; i++){
  //   the x value will be the current index in the array
  //   the y value will the height variable
  //   the width is 1 (one)
  //   the height is negative the value of the element at the current index of the array
  rect(i, height, 1, -intsAndStuff[i]);
  }

  //9. call the stepSort method
  stepSort(intsAndStuff);
  //10. extract the code that randomizes the array into a method.
  //11. call the method you made in step 10 when the mouse is pressed
  if (mousePressed){
    randomize();
  }
}

void randomize(){
  for(int i = 0; i < intsAndStuff.length; i++){
    intsAndStuff[i] = (int)random(0, height);
  }
}
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}