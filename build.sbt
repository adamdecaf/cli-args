name := "cliargs"

organization := "org.decaf"

scalaVersion := "2.10.0"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

resolvers ++= Seq(
  "nomq" at "http://nexus.nomqueue.com:8081/nexus/content/repositories/snapshots/",
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases",
  "typesafe" at "http://repo.typesafe.com/typesafe/ivy-releases/"
)

libraryDependencies ++= Seq(
  "com.scautils" %% "scautils" % "0.1-SNAPSHOT",
  "org.specs2" %% "specs2" % "1.13" % "test")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo := Some("Sonatype Snapshots Nexus" at "http://nexus.nomqueue.com:8081/nexus/content/repositories/snapshots/")
