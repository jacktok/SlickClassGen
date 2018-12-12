package jacktok

import PgDriver.api._
import jacktok.modelDB.tables.ColumnsTable

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object SlickClassGen {

  def main(args: Array[String]): Unit = {
    val db = Database.forConfig("database")
    val re = Await.result(db.run(ColumnsTable.filter(_.baseType === Instance.UserDeFine).result), Duration.Inf)
    println("hello")
  }

}
