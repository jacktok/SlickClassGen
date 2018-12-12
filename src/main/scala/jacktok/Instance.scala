package jacktok

object Instance {
  val BaseType: List[String] = List(
    "integer",
    "numeric",
    "text",
    "character varying",
    "boolean",
    "timestamp with time zone",
    "date",
  )
  val InformationSchema = Some("information_schema")
  val TargetSchema = "equity"
  val UserDeFine = "USER-DEFINED"

}
