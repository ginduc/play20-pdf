import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "pdf"
    val appVersion      = "0.3.3-SNAPSHOT"

    val appDependencies = Seq(
      "org.xhtmlrenderer" % "core-renderer" % "R8",
        "net.sf.jtidy" % "jtidy" % "r938"
	)

    val main = play.Project(appName, appVersion, appDependencies).settings(
      publishArtifact in(Compile, packageDoc) := false //workaround for publishing bug (http://bit.ly/Vfmo5Q)
    )

}
