REQUIREMENT 1
#menampilkan musisi dengan beberapa instrumen
select tc.id_gabung_musik, tm.nama, tm.alamat, 
ti.nama_musik, ti.kunci_musik
from tb_gabung_musik tc
join tb_musisi tm on tc.id_musisi = tm.id_musisi
join tb_instrumen ti on ti.id_instrumen = tc.id_instrumen
where tm.id_musisi=1

#menampilkan instrumen dengan bbrp musisi
select tc.id_gabung_musik, ti.nama_musik, ti.kunci_musik, tm.nama, tm.alamat
from tb_gabung_musik tc
join tb_musisi tm on tc.id_musisi = tm.id_musisi
join tb_instrumen ti on ti.id_instrumen = tc.id_instrumen
where tm.id_musisi=1 and ti.nama_musik='Gitar'

REQUIREMENT 2
#Menampilkan dependent_name dan relationship dengan employee yang namanya diawali huruf R 
SELECT d.dependent_name, d.relationship, 
fname FROM dependent d JOIN employee e ON e.ssn = d.essn 
WHERE e.fname LIKE 'r%' OR e.fname LIKE 'R%';

#Menampilkan banyaknya employee yang mengerjakan project PNum = 1 
SELECT e.fname as "Nama Depan", w.pnum AS "Total Projek" 
FROM works_on w JOIN employee e 
ON e.ssn = w.essn WHERE w.pnum = 1;

#menampilkan employee yang memiliki salary lebih dari 3500000
select count(ssn) from employee where salary > 3500000;

#menampilkan project yang dikerjakan Dnum=2
SELECT COUNT(pnumber), pname FROM project WHERE pnumber = 2;

#menghitung total dan rata2 salary dari setiap departemen
SELECT SUM(e.salary) as "Rata Rata Pendapatan", 
AVG(e.salary) as "Rata Rata Gaji", 
d.dname AS "Departemen" FROM department d 
JOIN employee e ON d.dnumber = e.dnum 
GROUP BY d.dname;

#menampilkan employee dari setiap departemen diurutkan dari employee terbanyak
SELECT COUNT(e.ssn) as "Jumlah Pegawai",
d.dname AS "DEPARTMENT" 
FROM department d 
JOIN employee e ON d.dnumber = e.dnum 
GROUP BY d.dname 
ORDER BY COUNT(e.ssn) DESC;

#menampilkan tital hours/week dari semua employee di setiap project
SELECT COUNT(hours) as "Jumlah Jam Kerja", 
p.pname AS "PROJECT" 
FROM works_on w JOIN project p 
ON p.pnumber = w.pnum 
GROUP BY p.pname; 

#menampilkan employye yang memiliki total hours/week >140
SELECT SUM(w.hours) AS "TOTAL JAM KERJA", 
e.fname AS "NAMA" 
FROM works_on w JOIN employee e 
ON e.ssn = w.essn 
GROUP BY e.ssn 
HAVING SUM(w.hours) > 140 
ORDER BY SUM(w.hours) DESC; 

#mengelompokkan bonus employee berdasarkan jumlah jam kerja (ika >= 200 hours, maka bonus = 50%; Jika >= 150 hours, maka bonus = 25%, Selainnya bonus = 10%)
SELECT e.fname, 
CASE WHEN SUM(w.hours) >= 200 THEN '50%' 
WHEN SUM(w.hours) >= 150 
AND SUM(W.HOURS) < 200 THEN '20%' 
ELSE '10%' END BONUS 
FROM works_on w JOIN employee e 
ON w.essn = e.ssn 
GROUP BY w.essn, e.fname;

#banyak project yang dikerjakan employee
SELECT COUNT(p.pnumber) AS "TOTAL PROJECT",
 e.fname AS "NAMA" FROM project p JOIN employee e 
ON e.dnum = p.dnum 
GROUP BY e.ssn 
ORDER BY COUNT(p.pnumber) DESC; 

#menampilkan employee yang bekerja pada 4 project
SELECT COUNT(p.pnumber) AS "TOTAL PROJECT", 
e.fname AS "NAMA" FROM project p JOIN employee e 
ON e.dnum = p.dnum 
GROUP BY e.ssn 
HAVING COUNT(p.pnumber) > 4 
ORDER BY COUNT(p.pnumber) DESC; 

#menampilkan employye yang memiliki rata2 h/w = 70 jam dan bekerja di 2 project
SELECT AVG(w.hours) AS "TOTAL JAM KERJA", 
e.fname AS "NAMA", 
COUNT(p.pnumber) 
FROM works_on w 
JOIN employee e ON e.ssn = w.essn 
JOIN project p ON e.dnum = p.dnum 
GROUP BY e.ssn 
HAVING AVG(w.hours) > 70 
AND COUNT(p.pnumber) > 2 
ORDER BY AVG(w.hours)
DESC;  

#menampilkan banyak dependent berdasarkan relationship
SELECT COUNT(relationship), 
relationship AS "TOTAL DEPENDANT" FROM dependent 
GROUP BY relationship;

#menampilkan lama manager tiap departemen menjabat
SELECT COUNT(relationship), 
relationship AS "TOTAL DEPENDANT" FROM dependent 
GROUP BY relationship;

#menampilkan lokasi project yang menjadi tempat lebih dari satu departement
SELECT p.plocation,
 COUNT(p.plocation)
 FROM project p JOIN department d 
ON p.dnum = d.dnumber 
GROUP BY p.plocation 
HAVING COUNT(p.plocation) >= 2;  

