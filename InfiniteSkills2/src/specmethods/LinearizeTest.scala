package specmethods

trait BaseWriter {
  def write(i:Int):Unit = {}
}

trait Printer extends BaseWriter {
  override def write(i:Int):Unit = {
    println(f"Printer wites: $i%d")
  }
}

trait Buffering extends BaseWriter {
  val buffer = collection.mutable.Buffer[Int]()
  override def write(i:Int):Unit = {
    buffer += i
    if(buffer.size > 5) {
      for(j <- buffer) super.write(j)
      buffer.clear
      println("Buffering "+i)
    } else {
      println("Buffering "+i)
    }
  }
}

trait BinaryFormat extends BaseWriter {
  override def write(i:Int):Unit = {
    super.write(i.toBinaryString.toInt)
  }
}

class WriterUser { 
  this: BaseWriter => // self type
  def useWrite(data:Iterator[Int]):Unit = {
    data.foreach(write)
  }
}

trait FooAbleComponent {
  class FooAble {
    def foo():String = "saying foo"
  }
  val fooAble : FooAble
}
trait BazAbleComponent {
  class BazAble {
    def baz():String = "here is baz"
  }
  val bazAble : BazAble
}
class Bar {
  this: FooAbleComponent with BazAbleComponent =>
  def bar():String = f"bar calls foo:${fooAble.foo()}%s and baz:${bazAble.baz()}%s"
}

object LinearizeTest extends App {
  val bufBinPrint = new Printer with BinaryFormat with Buffering
  bufBinPrint.write(1)
  bufBinPrint.write(2)
  bufBinPrint.write(3)
  bufBinPrint.write(4)
  bufBinPrint.write(5)
  bufBinPrint.write(6)
  bufBinPrint.write(7)
  println()
  println()
  val binBufPrint = new Printer with Buffering with BinaryFormat
  binBufPrint.write(1)
  binBufPrint.write(2)
  binBufPrint.write(3)
  binBufPrint.write(4)
  binBufPrint.write(5)
  binBufPrint.write(6)
  
  val user = new WriterUser with Printer with BinaryFormat
  user.useWrite(List(3,4,5).iterator)
  
  val myBar = new Bar with FooAbleComponent with BazAbleComponent {
    val bazAble = new BazAble{ override def baz():String = "here is baz better" }
    val fooAble = new FooAble
  }
  println(myBar.bar())
}

