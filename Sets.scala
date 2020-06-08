object Sets{
  def main(args:Array[String]): Unit ={
    val fruit1 = Set("apples", "oranges", "pears")
    val nums: Set[Int] = Set()

    println("Head of fruit:" +fruit1.head)
    println("Tail os fruit:" +fruit1.tail)
    println("Check if fruit is empty:" +fruit1.isEmpty)
    println("Check if nums is empty:"+ nums.isEmpty)

    val fruit2 = Set("banana", "jackfruit","plum")
    var fruit = fruit1 ++ fruit2
    println("fruit1 ++ fruit2:" +fruit);

    fruit = fruit1. ++(fruit2)
    println("fruit1.++(fruit2):" +fruit);
println("Min:"+fruit.min);
    println("Max:"+fruit.max);
    println("intersection:" +fruit.&(fruit2));
    println("intersection:" +fruit.intersect(fruit2));
  }


}