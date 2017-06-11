package models

import com.mongodb.casbah.{MongoCollection, MongoConnection}

/**
  * Created by wuyuhang on 17-6-11.
  */
object CybereekDB_USER {
  private val DATABASE = "cybereekdb"
  private val COLLECTION = "user"

  val connection = MongoConnection(MongoFactory.SERVER)
  val collection = connection(DATABASE)(COLLECTION)
}
