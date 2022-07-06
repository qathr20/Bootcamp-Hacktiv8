Code Coverage, Deployment + Final Projects
Codecoverage adalah sebuah tools yang mengukur efektivitas dari unit testing, dan untuk menunjukan seberapa lengkap code yang telah ditulis yang sesuai dengan process business yang telah dicover oleh unit test.
Jacoco and SonarQube Jacoco adalah sebuah library opensource untuk aplikasi Java

Sonarqube
Sonarqube adalah sebuah tool yang dilakukan untuk menginspeksi kualitas dari code yang telah ditulis

Deployment
kegiatan menyebarkan aplikasi baik itu website maupun mobile apps yang telah selesai dikerjakan oleh programmer

Integrate Jacoco & Sonarqube

- git init to initialise the repository
- git add . to add all files in folder
- git commit -m ‘Commit name’: commit changes
- heroku create: to create heroku app

next: add mysql DB

- heroku addons:create cleardb:ignite
- heroku config
- git push heroku master