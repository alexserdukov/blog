package model

import java.util.Date

import play.api.libs.json.Json

case class Post (title: String, author: String, date: Date, text: String)

object Post{
  implicit val postWrites = Json.writes[Post]
  val posts = Seq{new Post("My first blog topic", "Alex", new Date(), "some text")}
}
