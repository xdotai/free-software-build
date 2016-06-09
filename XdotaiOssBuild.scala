import cbt._
import java.net.URL
import scala.collection.immutable.Seq
trait XdotaiOssBuild extends PublishBuild with mixins.Suggested with mixins.Github{
  def user = "xdotai"
  def groupId = "ai.x"
  def organizationName = "x.ai"
  def organizationUrl = new URL("http://x.ai")
  def licenses = Seq(License.Apache2)
}
