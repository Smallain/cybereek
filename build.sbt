name := "cybereek"

version := "1.0"

lazy val `cybereek` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "org.mongodb" %% "casbah" % "2.8.0",
  "org.slf4j" % "slf4j-simple" % "1.6.4"
)

scalacOptions += "-deprecation"