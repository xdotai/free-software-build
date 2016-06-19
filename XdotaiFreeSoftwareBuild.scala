package ai.x.build
import cbt._
import java.net.URL
trait XdotaiFreeSoftwareBuild extends Publish with AdvancedScala with GithubPom{
  def user = "xdotai"
  def groupId = "ai.x"
  def organization = Some( Organization( "x.ai", Some( new URL("http://x.ai") ) ) )
  def licenses = Seq(License.Apache2)
}
object team{
  val cvogt = Developer("cvogt", "Jan Christopher Vogt", "-5", new URL("https://github.com/cvogt/"))
}
