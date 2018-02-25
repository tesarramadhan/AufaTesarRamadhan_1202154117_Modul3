package com.tesarramadhan.aufatesarramadhan_1202154117_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {
    //deklarasi variable
    RecyclerView rv;
    menuAdapter adapter;
    List<pilihAir> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("List Air"); //set title untuk screennya

        //membuat arraylist baru
        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu); //mendeklarasikan recyclerview
        rv.setHasFixedSize(true);

        //kondisi saat orientasi menjadi landscape
        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            rv.setLayoutManager(new GridLayoutManager(Menu.this, 2));
        }else {
            rv.setLayoutManager(new GridLayoutManager(Menu.this, 1));
        }
        initdata(); //menjalankan fungsi init data
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            rv.setLayoutManager(new GridLayoutManager(Menu.this, 2));
        }else {
            rv.setLayoutManager(new GridLayoutManager(Menu.this, 1));
        }
    }

    private void initdata() {
        //masukkan data ke dalam array
        listmenu.add(new pilihAir(R.drawable.ades, "Ades", "ini adalah air mineral Ades. \nAdes (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. "));
        listmenu.add(new pilihAir(R.drawable.amidis, "Amidis", "ini adalah air mineral  Amidis. \nAMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida."));
        listmenu.add(new pilihAir(R.drawable.aqua, "Aqua", "ini adalah air mineral Aqua. \nAQUA berasal dari sumber mata air yang terpilih dengan segala kemurnian dan kandungan mineral alami yang terpelihara. AQUA dikemas dengan proses higienis dalam beberapa ukuran kemasan botol plastik; 330 ml, 600 ml, 750 ml dan 1500 ml serta kemasan gelas plastik ukuran 240 ml dan kemasan galon 19 l."));
        listmenu.add(new pilihAir(R.drawable.cleo, "Cleo", "ini adalah air mineral Cleo. \nPada 7 Maret 2004, diluncurkan produk Air Murni Cleo sebagai salah satu produk andalan Tanobel dalam kemasan cup 250 mL, botol 330 mL, 550 mL, 1.200 mL, 6 L dan galon 19 L. Setelah itu, Tanobel melebarkan sayap produksi Air Murni Cleo ke berbagai daerah di Indonesia."));
        listmenu.add(new pilihAir(R.drawable.club, "Club", "ini adalah air mineral Club. \nClub adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk."));
        listmenu.add(new pilihAir(R.drawable.equil, "Equil", "ini adalah air mineral Equil. \nEquil merupakan salah satu produk air mineral dalam kemasan yang bisa dikatakan unik. Pasalnya, jika produk air mineral merek lainnya dikemas dalam gelas plastik atau botol plastik, namun Equil ini memiliki kemasan botol berbahan kaca."));
        listmenu.add(new pilihAir(R.drawable.evian, "Evian", "ini adalah air mineral Evian. \n merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman."));
        listmenu.add(new pilihAir(R.drawable.leminerale, "Le Minerale", "ini adalah air mineral Le Minerale. \nLe Minerale hadir melayani kebutuhan konsumen Indonesia sejak tahun 2015. Sumber mata air Le Minerale berasal dari sumber mata air pegunungan terpilih yang diambil dari kedalaman 100 meter di bawah tanah dan dibotolkan langsung di sumbernya menggunakan mineral protection system untuk melindungi kandungan mineral alami yang ditandai dengan kerasnya botol sebelum dibuka dan diproduksi tanpa tersentuh tangan manusia secara langsung."));
        listmenu.add(new pilihAir(R.drawable.nestle, "Nestle", "ini adalah air mineral Nestle. \n“Nestle Pure Life Natural Spring Water”. Di AS sendiri, Nestle PureLife merupakan air murni yang disaring. Pada tahun 2006, merk ini menjadi andalan utama perusahaan. Dua tahun kemudian, Nestle PureLife bahkan menjadi merk paling terkemuka di dunia. Penjualannya mencapai 5 juta air. Hal yang paling menjual dari produk ini yaitu proses pemurnian airnya. Begitupun dengan botol-botolnya, yang sampai mengalami 12 langkah pemurnian dan peningkatan kualitas."));
        listmenu.add(new pilihAir(R.drawable.pristine, "Pristine", "ini adalah air mineral Pristine. \nBerawal dari sebagai agen exclusif untuk produk kesehatan di seluruh Indonesia, dengan merek pribadi kami SIMBIO,PT.Super Wahana Tehno, yang juga salah satu anak perusahaan SINARMAS Group,saat ini telah bekerjasama dengan salah satu perusahaan Jepang,Nihon Trim.Co.Ltd.Dengan teknologi dan di bawah pengawasan dari Nihon Trim Co.Ltd ,sejak November 2006,PT.Super Wahana Tehno telah memproduksi dan meluncurkan produk baru yaitu : air mineral ionisasi,untuk yang pertama kali dan satu-satunya di Indonesia dengan merk PRISTINE."));
        listmenu.add(new pilihAir(R.drawable.vit, "Vit", "ini adalah air mineral VIT. \n merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT."));
        adapter = new menuAdapter(this, listmenu); //membuat adapter yang mengubungkan kelas ini dengan data yang ditampilkan
        rv.setAdapter(adapter); //menghubungkan recyclerview dengan adapter
    }
}

