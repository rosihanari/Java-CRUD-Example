# JavaCRUDExample
 
Project ini hanya sekedar contoh implementasi CRUD di Java yang dikoneksikan dengan MySQL.

* Library yang digunakan: MySQL JDBC Driver
* Nama DB yang digunakan: mydb
* Struktur tabel yang digunakan:

<pre>
CREATE TABLE `books` (
  `idBook` int(11) NOT NULL AUTO_INCREMENT,
  `bookTitle` varchar(200) DEFAULT NULL,
  `bookAuthor` varchar(100) DEFAULT NULL,
  `bookPublisher` varchar(100) DEFAULT NULL,
  `yearPublished` int(11) DEFAULT NULL,
  PRIMARY KEY (`idBook`)
)
</pre>
