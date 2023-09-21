Algoritma: ProjectLaundry

Deklarasi
Nama
Jeniscuci : basahharga= 4000, keringharga = 4500, setrikalipatharga= 5000 : double
JmlKg : int
TotHarga : double
Payment QRIS/Bank/E-wallet/Cash
Jasa : antar/ambil
Alamat 

DiscLog=0.05 , JmlDisc : double (jika login terdahulu)

Deskripsi 
print "Masukkan Nama Penyewa"
read nama
Print "Masukkan Jumlah Kg!"
Read JmlKg
print "Pilih Jenis Cucian!"
read jeniscuci
print "jasa"
read jasa
print "alamat"
read alamat
print "Pilih Payment"
read payment
Print "Masukkan Potongan TotHarga!"
read TotHarga

Totharga= (JmlKg*basahharga)-(basahharga*DiscHarga)
Totharga= (JmlKg*keringharga)-(keringharga*DiscHarga)
Totharga= (JmlKg*setrikalipatharga)-(setrikalipatharga*DiscHarga)

print "Harga untuk Cucian anda adalah"
read TotHarga
print "Pilih payment"
read payment
print "Pilih Jasa"
read jasa
print "Masukkan Alamat!"
read alamat