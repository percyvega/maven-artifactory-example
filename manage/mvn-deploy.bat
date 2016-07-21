mvn deploy:deploy-file ^
    -Dfile=../target/maven-artifactory-example-2.8-SNAPSHOT.jar ^
    -DpomFile=../pom.xml ^
    -DrepositoryId=snapshots ^
    -Durl=http://abc123:8081/artifactory/libs-snapshot-local/