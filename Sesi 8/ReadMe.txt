Synchronized Java
Contoh penggunaan method synchronized misalkan ketika mengakses resource secara bersama-sama, halini akan sangat berbahaya ketika thread tidak bisa dikontrol.
Misalkan ada tugas untuk menulis ke sebuahfile yang sama, proses ini thread harus dipastikan selesai terlebih dahulu kemudian bisa dilanjutkan threadyang lain untuk menulis juga

Tutorial Maven :
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

mvn archetype:generate -DgroupId=com.learning.test-DartifactId=demotest -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false ==> failed
mvn archetype:generate -DgroupId=com.learning.thread -DartifactId=DemoThread -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false ==> failed

error :{
The goal you specified requires a project to execute but there is no POM in this directory (C:\BTDP\Sesi8). Please verify you invoked Maven from the correct directory. -> [Help 1]
}


https://maven.apache.org/archetype/maven-archetype-plugin/examples/generate-alternative-catalog.html
