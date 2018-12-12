package jacktok.tool

object StringConvert {
  def getName(in : String) : String = {
    in.split('_').map(txt => (txt.headOption, txt.tail) match {
      case (Some(h), t) => h.toUpper + t
      case _ => "";
    }).mkString("")
  }
}
