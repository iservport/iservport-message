organization := "com.iservport"

scalaVersion := "2.11.8"

sbtVersion := "0.13.9"

name := "iservport-message"

version := "1.5.2.RELEASE"

lazy val root = (project in file("."))
  .enablePlugins(JavaServerAppPackaging)
  .settings(commonSettings)

libraryDependencies ++= Seq(
  "org.projectlombok"  % "lombok"      % "1.16.8",
  "org.scalatest"     %% "scalatest"   % "3.0.0"   % "test"
)

lazy val commonSettings = Seq(
  resolvers in ThisBuild ++= Seq(
    "Helianto Releases"    at "s3://maven.helianto.org/release",
    "Helianto Snapshots"   at "s3://maven.helianto.org/snapshot",
    "Helianto Development" at "s3://maven.helianto.org/devel"
  ),
  publishTo in ThisBuild := {
    val helianto = "s3://maven.helianto.org/"
    if (version.value.trim.endsWith("SNAPSHOT"))
      Some("Helianto Snapshots" at helianto + "snapshot")
    else if (version.value.trim.endsWith("RELEASE"))
      Some("Helianto Releases" at helianto + "release")
    else
      Some("Helianto Development"  at helianto + "devel")
  },
  credentials += Credentials(Path.userHome / ".sbt" / ".s3credentials"),
  publishMavenStyle := true
)

licenses in ThisBuild := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
