mathlib-example
===============

Sample illustrating using a private S3 dependency

The key here is that the pom.xml file references the repositories created in rjstanford/mathlib and has the extension to allow s3:// URLs to work.

The plugin used simply allows the creation of a complete jar.

mvn deploy

	creates target/mathexample-1.0-SNAPSHOT-jar-with-dependencies.jar

java -cp target/mathexample-1.0-SNAPSHOT-jar-with-dependencies.jar cc.protea.mathexample.App

	3 + 4 = 7
