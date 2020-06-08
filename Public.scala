
object Public {
  def main(args: Array[String]): Unit = {
    class Outer {

      class Inner {

        def f() {
          println("f")
        }

        class InnerMost {

          f()
        }

      }

      (new Inner).f()
    }

  }
}