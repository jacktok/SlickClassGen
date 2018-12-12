package jacktok.modelDB.tables

import jacktok.Instance
import jacktok.PgDriver.api._
import slick.lifted.ProvenShape
object ColumnsTable extends TableQuery(new ColumnsTable(_))
class ColumnsTable(tag: Tag) extends Table[Columns](tag, Instance.InformationSchema, "columns") {

  def schema = column[String]("table_schema")

  def nameTable = column[String]("table_name")

  def name = column[String]("column_name")

  def position = column[Int]("ordinal_position")

  def nullable = column[Boolean]("is_nullable")

  def baseType = column[String]("data_type")

  def udtType = column[String]("udt_name")


  override def * : ProvenShape[Columns] = (schema, nameTable, name, position, nullable, baseType, udtType) <> (in, out)

  type LocalType = (String, String, String, Int, Boolean, String, String)

  def in(data: LocalType): Columns = {
    val (schemaL, nameTableL, nameL, positionL, nullL, baseL, typeL) = data
    val isUserDf = baseL == Instance.UserDeFine
    val typeApply = if (isUserDf) typeL else baseL
    Columns(schemaL, nameTableL, nameL, positionL, nullL, typeApply, isUserDf)
  }

  def out(data: Columns): Option[LocalType] = ???

}
