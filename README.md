# Pemrograman Berorientasi Objek - Pertemuan Pertama

## Daftar Isi
- [ Inheritance](#inheritance)
- [ Set and Get](#SetandGet)

---
## Inheritance
### Pengertian
Inheritance adalah mekanisme di mana sebuah sub class dapat mewarisi atribut dan method dari super class. Dengan inheritance, kita dapat menciptakan hierarki kelas yang lebih terstruktur dan mengurangi duplikasi kode.
Kata kunci extends digunakan untuk menunjukkan hubungan inheritance antara dua kelas. Ketika sebuah kelas menggunakan extends, itu berarti kelas tersebut mewarisi semua atribut dan metode dari kelas yang disebutkan setelah kata kunci extends.
Jadi, ketika kita menggunakan kata kunci extends dalam sebuah kelas, kita secara eksplisit menyatakan bahwa kelas tersebut mewarisi atribut dan metode dari kelas lain. Dengan kata lain, extends adalah cara konkret untuk mewujudkan konsep inheritance dalam kode.

### Contoh
````java
//Super Class
public class makhlukHidup {
    public void bernafas(){
        System.out.println("Saya bernafas ...");
    }}

//Sub Class
public class hewan extends makhlukHidup {
    private int jumlahKaki;
    private String berjalan;
    private String reproduksi;
    }
````
class bernama "hewan" yang mewarisi (extends) dari class "makhlukHidup" yang telah ada sebelumnya

---
## Set and Get
### Pengertian
Getter dan Setter adalah metode yang digunakan untuk mengakses dan mengubah nilai atribut private dari sebuah class. Ini adalah cara untuk memberikan kontrol akses dan validasi data.
- Setter -> Metode yang digunakan untuk mengatur nilai dari atribut privat. Biasanya nama method ini dimulai dengan kata set
- Getter -> Metode yang digunakan untuk mengambil nilai dari atribut privat. Biasanya nama method ini dimulai dengan kata get

### Contoh
```` java
    public String getArahDaun() {
        return arahDaun;
    }
    public void setArahDaun(String arahDaun) {
        this.arahDaun = arahDaun;
````

- Method getArahDaun : mengambil nilai dari atribut arahDaun.
- Metode setArahDaun : mengatur nilai dari atribut arahDaun.

---

Sekian dari saya, semoga dapat membantu dalam memahami. TERIMAKASIH!!!🙌
