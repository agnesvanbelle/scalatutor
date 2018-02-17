package textprocessing

import scala.util.parsing.combinator._

// expr := term { "+" term | "-" term }
// term := factor { "*" factor | "/" factor }
// factor := number | identifier | "(" expr ")"

object ExpressionParser extends JavaTokenParsers {
  def expr: Parser[Any] = term ~ rep("+" ~ term | "-" ~ term)
  def term: Parser[Any] = factor ~ rep("*" ~ factor | "/" ~ factor)
  def factor: Parser[Any] = floatingPointNumber | ident | "(" ~ expr ~ ")"

  def main(args: Array[String]): Unit = {
    val parse = parseAll(expr, "3+a")
    println(parse)
    //traverse(parse.get)
  }

  def traverse(a: Any): Unit = a match {
    case lst: List[Any] =>
      println("List")
      lst.foreach(traverse)
    case opt: Option[Any] =>
      println("Option")
      opt.foreach(traverse)
    case a ~ b =>
      traverse(a)
      print(" ~ ")
      traverse(b)
    case s: String =>
      println(s)
  }
}

object MyParser extends JavaTokenParsers {
  
  /**
   * zin := iemand ww { "dat" zin  | iemand_lv } 
   * iemand := "ik" | "hij" | "zij"
   * ww := "haat" | "houdt van"
   * iemand_lv := "mij" | "hem" | "haar"
   */
  def zin: Parser[Any] = iemand ~ ww ~ rep( "dat" ~ zin | iemand_lv )
  def iemand: Parser[Any] = "ik" | "hij" | "zij"
  def ww: Parser[Any] = "haat" | "houdt van"
  def iemand_lv: Parser[Any] = "mij" | "hem" | "haar"
  
  def main(args: Array[String]): Unit = {
    val result = parseAll(zin, "hij houdt van dat zij houdt van mij")
    println(result)
    println(result.get)
  }
  
  
  
}