organization := "com.iservport"

scalaVersion := "2.11.8"

sbtVersion := "0.13.9"

lazy val root = (project in file("."))
  .enablePlugins(JavaServerAppPackaging)
  .settings(
    name := "iservport-message",
    version := "1.0.0.RELEASE",
    libraryDependencies ++= Seq(
      "com.typesafe"        % "config" % "1.3.0",
      "org.scalatest"      %% "scalatest"        % "3.0.0"   % "test",
      "org.mockito"         % "mockito-all"      % "1.10.19" % "test",
      "org.slf4j" % "slf4j-simple" % "1.7.14"
    )
  )
  .settings(commonSettings)

lazy val commonSettings = Seq(
  resolvers in ThisBuild ++= Seq(
    "Helianto Releases"  at "s3://maven.helianto.org/release",
    "Helianto Snapshots" at "s3://maven.helianto.org/snapshot",
    "Helianto Development" at "s3://maven.helianto.org/devel"
  ),
  publishTo in ThisBuild := {
    val helianto = "s3://maven.helianto.org/"
    if (version.value.trim.endsWith("SNAPSHOT"))
      Some("Helianto Snapshots" at helianto + "snapshot")
    else if (version.value.trim.endsWith("RELEASE"))
      Some("Helianto Snapshots" at helianto + "release")
    else
      Some("Helianto Development"  at helianto + "devel")
  },
  credentials += Credentials(Path.userHome / ".sbt" / ".s3credentials"),
  publishMavenStyle := true
)

licenses in ThisBuild := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
