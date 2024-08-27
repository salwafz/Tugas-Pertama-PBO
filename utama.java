package pertemuanPertama;

import pbo.Tumbuhan;

/**
 *
 * @author Salwa Faizah
 */
public class utama {
    public static void main(String[] args) {
        pertemuanPertama.hewan sapi = new pertemuanPertama.hewan();
        System.out.println("Nama saya sapiiiii");
        sapi.bernafas();
        sapi.tumbuh();
        sapi.membutuhkanNutrisi();
        sapi.setJumlahKaki(4);
        sapi.setReproduksi("seksual");
        System.out.println("Jumlah kaki saya ada " + sapi.getJumlahKaki());
        System.out.println("Cara bereproduksi saya secara " + sapi.getReproduksi());
        
        pertemuanPertama.tumbuhan kentang = new pertemuanPertama.tumbuhan();
        System.out.println("");
        System.out.println("Nama saya pinus");
        kentang.bernafas();
        kentang.tumbuh();
        kentang.membutuhkanNutrisi();
        kentang.setWarnaDaun("hijau");
        kentang.setReproduksi("aseksual");
        System.out.println("Warna daun saya " + kentang.getWarnaDaun());    
        System.out.println("Cara bereproduksi saya secara " +kentang.getReproduksi());
        
        pertemuanPertama.aves elang = new pertemuanPertama.aves();
        System.out.println("");
        System.out.println("Nama saya burung Elanggggggg");
        elang.bernafas();
        elang.tumbuh();
        elang.membutuhkanNutrisi();
        elang.setJumlahKaki(2);
        elang.setReproduksi("seksual");
        elang.setJumlahCakar(4);
        elang.setBentukParuh("bengkok");
        System.out.println("Jumlah kaki saya ada " + elang.getJumlahKaki());
        System.out.println("Cara bereproduksi saya secara " + elang.getReproduksi());
        System.out.println("Saya memiliki " +elang.getJumlahCakar() +" pasang cakar");
        System.out.println("Bentuk paruh saya " +elang.getBentukParuh());
       
        pertemuanPertama.amfibi kodok = new pertemuanPertama.amfibi();
        System.out.println("");
        System.out.println("Nama saya kodokkkkkkkkkk");
        kodok.bernafas();
        kodok.tumbuh();
        kodok.membutuhkanNutrisi();
        kodok.setJumlahKaki(4);
        kodok.setBerjalan("air dan darat");
        kodok.setReproduksi("seksual");
        kodok.setPerilaku("nokturnal");
        kodok.setBentukTubuh("gemuk dan pendek");
        System.out.println("Jumlah kaki saya ada " +kodok.getJumlahKaki());
        System.out.println("Saya berjalan di " +kodok.getBerjalan());
        System.out.println("Cara bereproduksi saya secara " +kodok.getReproduksi());
        System.out.println("Beberapa dari saya termasuk hewan yang berperilaku " +kodok.getPerilaku());
        System.out.println("Bentuk tubuh saya " +kodok.getBentukTubuh());
       
        pertemuanPertama.pisces mujair = new pertemuanPertama.pisces();
        System.out.println("");
        System.out.println("Nama saya ikan mujairrrrrrrr");
        mujair.bernafas();
        mujair.tumbuh();
        mujair.membutuhkanNutrisi();
        mujair.setReproduksi("seksual");
        mujair.setJumlahSirip(5);
        mujair.setHabitat("air tawar");
        System.out.println("Cara bereproduksi saya secara " +mujair.getReproduksi());
        System.out.println("Jumlah sirip saya ada " +mujair.getJumlahSirip());
        System.out.println("Habitat saya di " +mujair.getHabitat());
        
        pertemuanPertama.reptil cicak = new pertemuanPertama.reptil();
        System.out.println("");
        System.out.println("Nama saya cicakkkkkkk");
        cicak.bernafas();
        cicak.tumbuh();
        cicak.membutuhkanNutrisi();
        cicak.setJumlahKaki(4);
        cicak.setBerjalan("di darat");
        cicak.setReproduksi("seksual");
        cicak.setKemampuanRegenerasi("autotomi");
        cicak.setJenisKulit("bersisik");
        System.out.println("Jumlah kaki saya ada " +cicak.getJumlahKaki());
        System.out.println("Saya berjalan di " +cicak.getBerjalan());
        System.out.println("Cara bereproduksi saya secara " +cicak.getReproduksi());
        System.out.println("Kemampuan regenerasi saya yaitu " +cicak.getKemampuanRegenerasi());
        System.out.println("Jenis kulit saya " +cicak.getJenisKulit());
        
        pertemuanPertama.mamalia singa = new pertemuanPertama.mamalia();
        System.out.println("");
        System.out.println("Nama saya singaaaaaa");
        singa.bernafas();
        singa.tumbuh();
        singa.membutuhkanNutrisi();
        singa.setJumlahKaki(4);
        singa.setBerjalan("darat");
        singa.setReproduksi("seksual");
        singa.setSuhuTubuh("Homeoterm");
        singa.setJenisMakanan("karnivora");
        System.out.println("Jumlah kaki saya ada " +singa.getJumlahKaki());
        System.out.println("Saya berjalan di " +singa.getBerjalan());
        System.out.println("Cara bereproduksi saya secara " +singa.getReproduksi());
        System.out.println("saya termasuk hewan " +singa.getSuhuTubuh() +" yaitu hewan yang memiliki suhu tubuh yang tetap");
        System.out.println("Saya juga termasuk mamalia " +singa.getJenisMakanan() +" pemakan daging");
        
        pertemuanPertama.dikotil sepatu = new pertemuanPertama.dikotil();
        System.out.println("");
        System.out.println("Nama saya bunga sepatuu");
        sepatu.bernafas();
        sepatu.tumbuh();
        sepatu.membutuhkanNutrisi();
        sepatu.setWarnaDaun("hijau");
        sepatu.setReproduksi("seksual");
        sepatu.setJumlahBiji(2);
        sepatu.setJumlahKelopakBunga(5);
        System.out.println("Warna daun saya " + sepatu.getWarnaDaun());    
        System.out.println("Cara bereproduksi saya secara " +sepatu.getReproduksi());
        System.out.println("Karena saya dikotil, jumlah biji saya ada " +sepatu.getJumlahBiji());
        System.out.println("Saya memiliki " +sepatu.getJumlahKelopakBunga()+" kelopak bunga"); 
        
        pertemuanPertama.monokotil tebu = new pertemuanPertama.monokotil();
        System.out.println("");
        System.out.println("Nama saya tebuuuuuuuuu");
        tebu.bernafas();
        tebu.tumbuh();
        tebu.membutuhkanNutrisi();
        tebu.setWarnaDaun("hijau");
        tebu.setReproduksi("aseksual");
        tebu.setBentukTulangDaun("sejajar");
        tebu.setBentukAkar("serabut");
        System.out.println("Warna daun saya " + tebu.getWarnaDaun());    
        System.out.println("Cara bereproduksi saya secara " +tebu.getReproduksi());
        System.out.println("Bentuk tulang daun saya " +tebu.getBentukTulangDaun());
        System.out.println("Saya memiliki akar " +tebu.getBentukAkar());   
    }
}
