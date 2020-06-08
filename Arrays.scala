import Array._


object Arrays{
  def main( args: Array[String]): Unit ={
    var myList = Array(2,3,4,5,6)
    for (x <- myList){
      println( x )
    }
    var total = 0.0;
    for ( i <- 0 to (myList.length-1)){
      total = total + myList(i);
    }

    println("Total is" + total);

    var max = myList(0);
    for (i <- 1 to (myList.length-1)){
      if(myList(i)>max) max = myList(i);
    }
    println("Max is" + max);

    var matrix = ofDim[Int](3,3)
    for(i <- 0 to 2){
      for( j <- 0 to 2){
        matrix(i)(j) = j;

      }
    }
    for(i <- 0 to 2) {
      for (j <- 0 to 2) {
print(" " + matrix(i)(j));
      }
      println();
    }

    var list1 = Array(2,3,4,5,6)
    var list2 = Array(8,7,9,3,1)
    var list3 = concat(list1, list2)
    for(x <- list3){
      println(x)
    }

    var list_1 = range(10,20,2)
    var list_2 = range(10,20)
    for (x <- list_1){
      print(" " +x)
    }
    println()
    for(x <- list_2){
      print(" "+x)
    }
  }
}