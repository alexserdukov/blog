package model

import java.util.Date

import play.api.libs.json.Json

case class Post (title: String, author: String, date: Date, text: String)

object Post{
  val posts = Seq{new Post("title", "author", new Date(), "some text")}
}
