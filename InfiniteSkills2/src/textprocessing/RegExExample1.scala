package textprocessing

object RegExExample1 extends App {
  val phonePattern = """\((\d\d\d)\) (\d){3}-(\d\d\d\d)""".r
  val phoneBook = """Name1	(210) 555-3758
    Name2	(512) 555-6948
    NameFalse	(a) 555-6948
    Name3	(605) 555-3724"""
  
  for(m <- phonePattern.findAllMatchIn(phoneBook)) {
    val areaCode = m.group(1)
    println(areaCode)
  }
  println()
  
  for(phonePattern(a,b,c) <- phonePattern.findAllMatchIn(phoneBook)) {
    println(a)
  }
  println()
  
  val x = for (m <- phonePattern findAllMatchIn phoneBook) yield  m group 1
  x.foreach(println)
  println()
  
  for(m <- phonePattern.findAllIn(phoneBook)) {
    m match {
      case phonePattern(a,b,c) => println(a)
    }
  }
}