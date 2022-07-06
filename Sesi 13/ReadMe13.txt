ORM-Hibernate

//buat maven project di eclipse//
1. new->project->maven->maven project -> Next
2. cari apache.maven->pilih yang quick start
3. Isi GroupID = com.learning.hibernate
ArtifactID = DemoHibernate
//buat database MySQL dan contoh table//
4. Create database test -> table address_book 
CREATE TABLE IF NOT EXISTS `address_book` (  `id` int(11) NOT NULL AUTO_INCREMENT,  `name` varchar(255) NOT NULL,  `address` varchar(255) NOT NULL,  PRIMARY KEY (`id`)) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;
//buat file konfigurasi hibernate//
5. Buat file src/main/resources/hibernate.cfg.xml dengan cara klik kanan folder resources, New > Other, XML > XML file.
//buat model class untuk fungsi-fungsi ke database.  src/main/java/AddressBook.java.//
6. Klik kanan pada folder java, New > Other > Java > Class, kemudian Next.
// mendefinisikan struktur table yang nanti dihubungkan ke Model Class//
7. buat mapping file untuk table address_book di src/main/java/AddressBook.hbm.xml
//Aplikasi java sebagai controller yang nanti bisa dikembangkan menjadi CRUD (Create, read, update, delete)//
8. Buat java class, src/main/java/App.java. Klik kanan pada folder testhibernate1, New > Other > Java > Class, kemudian Next. Ketikkan App pada field Name.
9. Jalankan dengan mengklik kanan App.java, Run As > Java Application.
// aplikasi ini akan meng insert data kedalam table address_book//



//eror//
delete nama addressbook -> clean -> install -> balikin lagi namanya -> install -> run