package ai.x.build
import cbt._
import java.net.URL
import scala.collection.immutable.Seq
trait XdotaiFreeSoftwareBuild extends PublishBuild with mixins.Suggested with mixins.Github{
  def user = "xdotai"
  def groupId = "ai.x"
  def organizationName = "x.ai"
  def organizationUrl = new URL("http://x.ai")
  def licenses = Seq(License.Apache2)
}
object team{
  val cvogt = Developer("cvogt", "Jan Christopher Vogt", "-5", new URL("https://github.com/cvogt/"))
}
