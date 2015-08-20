package controllers

import model.Post
import play.api.mvc._
import play.api.libs.json._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Be proactive"))
  }

  def posts = Action {
    implicit val postWrites = Json.writes[Post]
    val posts = Post.posts
    Ok(Json.toJson(posts))
  }

}