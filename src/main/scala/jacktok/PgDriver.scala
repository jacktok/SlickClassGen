package jacktok

import com.github.tminglei.slickpg._

object PgDriver extends PgDriver

trait PgDriver extends ExPostgresProfile with PgArraySupport with utils.PgCommonJdbcTypes {

  override val api: API = new APIHelper {}
  trait APIHelper extends API with ArrayImplicits {

  }
}
