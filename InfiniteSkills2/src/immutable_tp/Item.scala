package mud.immutable_tp

object Item {
  def apply(n: xml.Node): Item = {
    Item((n \ "@name").text.trim, (n \ "description").text.trim)
  }
}

case class Item(name: String, description: String) {
  def matches(n: String): Boolean = {
    n.compareToIgnoreCase(name) == 0
  }
  
  def print():Unit = {
    println(name)
    println(description)
  }
  
  def toXML:xml.Node = <item name={name}>
    <description>{description}</description>
  </item>
}