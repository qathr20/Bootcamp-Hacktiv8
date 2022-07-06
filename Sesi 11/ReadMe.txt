MongoDB dapat diinstall di hampir semua Operating System
Jenis MongoDB server yang dapat digunakan secara gratis adalah MongoDB Community Server.
MongoDB menyimpan data dalam bentuk BSON (Binary JSON) document.
JSON (JavaScript Object Notation)
JSON menjadi salah satu format data yang paling banyak digunakan untuk transfer data antara browser dan server.

Operasi Dasar MongoDB
buka terminal
$ mong

1. membuat database -> use DATABASE_NAME
	melihat database yang sudah digunakan -> show dbs
2. membuat collection -> db.createCollection (name, Options)
#Operasi CURD (Create, Read, Update, Delete)
3. Create 
	-> db.collection.insertOne(), add doc tunggal
	-> db.collection.insertMany(), add doc banyak
4. Read -> db.collection.find()
5. Update
	-> db.collection.updateOne(filter, update) ubah satu doc
	-> db.collection.updateMany(filter, update) ubah banyak doc
	-> db.collection.replaceOne(filter, update) ganti doc satu ke doc baru
6. Delete
	-> db.collection.deleteOne(filter), hapus satu
	-> db.collection.deleteMany(filter), hapus banyak

Introduction Of Relasi
1. Relasi one to one 
	-> relasi antar tabel A adalah data master dan B memiliki data yang di A
2. Relasi one to many
	-> relasi antar tabel dimana tabel A memiliki sebuah data yang dipakai di B dan bisa banyak/beberapa
3. Relasi many to many
	-> hubungan antar tabel bisa banyak tabel, ex. A dengan B dan C dengan B

LOOKUP
sebuah metode yang digunakan untuk menampilkan data seperti find tetapi di lookup ini kita dapat menampilkan beberapa tabel untuk di tampilkan
(lookup ini bisa berjalan kalau tabelnya sudah berrelasi)
ex.
db.collection.aggregate({ $lookup : { from : collection2, localField : “_id”, foreignField : “_id”, as : “join” } }) 
ket:
Aggregate : untuk mengkelompokan data 
Lookup : untuk mengabungkan data 
From : diisi tabel ke 2 yang akan di tampilkan 
localField : diisi dengan nama data yang ada di tabel pertama (data ini harus data yang nanti sama dengan data yang ada di tabel ke 2) 
foreignField : sama dengan localField tetapi untuk foreignField diisi dengan nama data yang ada di tabel kedua 
as : as atau alias dapat diisi bebas karena disini jika nanti data kita mau di tampilkan kita cukup memanggil nama yang sudah di aliaskan saja.
#untuk menampilkan 3 tabel atau lebih sekaligus#
db.collection.aggregate( [ { $lookup : { from : collection2, localField : “_id”, foreignField : “_id”, as : “join” } }, { $lookup : { from : collection3, localField : “_id”, foreignField : “_id”, as : “join” } } ] ) 
Ket: Pembedanya adalah pada kurung [ ] nya ya

Validasi adalah sebuah metode untuk pengecekan suatu data yang di masukkan, misalkan pada saat kita login pada suatu website kita ketikan asal – asalan maka akan muncul peringatan.
Ket: 
createCollection : untuk membuat tabel 
validator : untuk membuat validasi pada json 
$jsonSchema : untuk masuk ke dalam fungsi json 
bsonType : tipe data 
required : data apa saja yang pada saat di tambahkan datanya itu harus diisi 
properties : peraturan – peraturan yang akan dibuat untuk validasi data tersebut 
items : untuk data bertipe array
