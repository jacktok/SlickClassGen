package jacktok.modelDB.tables

case class Columns(
                  tableSchema: String,
                  tableName: String,
                  name: String,
                  position: Int,
                  isNullable: Boolean,
                  dataType: String,
                  isUserDefine : Boolean,
                  )
