package controllers

import model.Post
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.ExecutionContext.Implicits._

object Application extends Controller {

  def index = Action {
    Ok(views.html.main("Be proactive")(views.html.blog(Post.posts)))
  }

  def about = Action {
    Ok(views.html.about())
  }

  def blog = Action {
    Ok{views.html.blog(Post.posts)}
  }

  def post = Action{
    Ok(views.html.post(Post.posts(0)))
  }

  def posts = Action {
    val posts = Post.posts
    Ok(Json.toJson(posts))
  }

  def someAction = Action.async {
    val futureInt = scala.concurrent.Future { 1 + 1 }
    futureInt.map(i => Ok("Got result: " + i))
  }


}