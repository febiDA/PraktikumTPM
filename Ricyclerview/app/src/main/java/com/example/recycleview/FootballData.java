package com.example.recycleview;

import java.util.ArrayList;

public class FootballData {
    private static String[] title = new String[]{"SKN Kebumen","Vamos Mataram","BlackSteel",
            "IPC Pelindo","Halus FC","Giga FC","Bali Unaited","ADA Futsal","madura","Bintang Timur "};

    private static int[] thumbnail = new
            int[]{R.drawable.skn,R.drawable.vamos,
            R.drawable.bs,R.drawable.ipc,R.drawable.haluss,R.drawable.giga,
            R.drawable.bali,R.drawable.ada,R.drawable.madura,R.drawable.bts};

    private static String[] preview = new String[]{
            "Melakukan perombakan besar-besaran baik di komposisi pemain maupun pelatih, SKN mendatangkan pelatih asal Spanyol, Alvaro Martinez Castillo yang berpengalaman di Vietnam sebagai asisten Miguel Rodrigo.\n" +
                    "\n" +
                    "Selain itu, perekrutan pemain besar-besaran juga dilakukan SKN dengan memboyong empat eks penggawa Black Steel Manokwari ke dalam skuat.\n" +
                    "\n" +
                    "Selain itu, SKN juga membawa paketan timnas futsal U-20 ke dalam tim. Kedua paketan tersebut dilengkapi dengan dua penggawa asing yaitu Alireza Rafieipour (Iran) dan Facundo Schusterman (Argentina).\n" +
                    "\n" +
                    "Dengan skuat yang menjanjikan, SKN menjadi salah satu pesaing kuat peraih gelar juara PFL 2020.",
            "Vamos Mataram Futsal Club (atau Vamos Mataram saja) adalah sebuah klub futsal Indonesia yang bermarkas di Kota Mataram, Nusa Tenggara Barat. Klub ini meraih tiga kali gelar juara pada kompetisi Liga Futsal Profesional Indonesia",
            "Black Steel FC Manokwari is an Indonesian professional futsal club based in Manokwari, West Papua, Indonesia. The club plays in the Indonesia Pro Futsal League.",
            "Musim 2020 menjadi era baru untuk Yos Adi Wicaksono. Kiper legenda futsal Indonesia ini ditunjuk menjadi pelatih kepala baru skuat setelah Dadang Iskandar diangkat jadi direktur Teknik tim.\n" +
                    "\n" +
                    "Tak beda jauh dengan pendahulunya, Yaw kembali memberdayakan pemain-pemain senior dan pegawai di PT Pelabuhan Indonesia cabang Jakarta tersebut. Nama-nama senior seperti Socrates Matulessy, Caisar Silitonga, Jailani Ladjanibi dan Sandy Gempur kembali ke dalam skuat.\n" +
                    "\n" +
                    "Selain itu, Pelindo juga menambah skuat dengan memasukan paket timnas futsal U-20 ke dalam tim yaitu Firman Ardiansyah, Ramadhan Zidani, Agung Pandega dan juga Muhammad Wildan.\n" +
                    "\n" +
                    "Musim pertama Yaw sebagai pelatih kepala bakal penuh tantangan mengingat Pelindo berada di grup B yang merupakan grup berat ditambah catatan tiga kali juara liga ini yang belum pernah lolos ke final four lagi sejak 2016.",
            "Musim 2020 menjadi era baru untuk Yos Adi Wicaksono. Kiper legenda futsal Indonesia ini ditunjuk menjadi pelatih kepala baru skuat setelah Dadang Iskandar diangkat jadi direktur Teknik tim.\n" +
                    "\n" +
                    "Tak beda jauh dengan pendahulunya, Yaw kembali memberdayakan pemain-pemain senior dan pegawai di PT Pelabuhan Indonesia cabang Jakarta tersebut. Nama-nama senior seperti Socrates Matulessy, Caisar Silitonga, Jailani Ladjanibi dan Sandy Gempur kembali ke dalam skuat.\n" +
                    "\n" +
                    "Selain itu, Pelindo juga menambah skuat dengan memasukan paket timnas futsal U-20 ke dalam tim yaitu Firman Ardiansyah, Ramadhan Zidani, Agung Pandega dan juga Muhammad Wildan.\n" +
                    "\n" +
                    "Musim pertama Yaw sebagai pelatih kepala bakal penuh tantangan mengingat Pelindo berada di grup B yang merupakan grup berat ditambah catatan tiga kali juara liga ini yang belum pernah lolos ke final four lagi sejak 2016.",
            "Pelatih Wahyudin Kocoy mengarungi musim ketiganya bersama Giga FC Kota Metro dengan kerangka skuat yang tak berbeda jauh dengan musim sebelumnya.\n" +
                    "\n" +
                    "Beberapa pemain asli Lampung seperti Refani putra, Gilang Tangguh hingga pivot muda Hady Pradana sudah lebih matang untuk mengarungi musim 2020. Mereka ditopang dengan beberapa penambahan pemain dari luar Lampung.\n" +
                    "\n" +
                    "Beberapa pemain senior seperti Moses Kernel, Afif Tamimy dan Andriyana serta kiper Maegel Nustelu masuk ke dalam proyeksi Kocoy untuk musim 2020 ditambah penambahan beberapa pemain muda seperti Egi Desta asal Bandung dan Hasriyadi, eks Young Rior asal Makassar.\n" +
                    "\n" +
                    "Meski dengan skuat yang tak berbeda jauh, konsistensi tiap pekannya menjadi hal yang harus diperhatikan Giga jika masih ingin bersaing merebut tiket ke Final Four.",
            "Bali United F.C. (sebelumnya bernama Persisam Putra Samarinda) merupakan sebuah klub sepak bola Indonesia, yang bermarkas Stadion Kapten I Wayan Dipta, Kabupaten Gianyar, Provinsi Bali, Indonesia. Klub ini dulunya bernama Persatuan Sepak Bola Indonesia Samarinda (Persisam) yang merupakan eks tim Perserikatan dan Putra Samarinda dari Galatama. Pada 15 Februari 2015, Putra Samarinda diambil alih pengusaha asal Indonesia, Pieter Tanuri, setelah sebelumnya mengalami kesulitan finansial hingga akhirnya berpindah kandang ke Bali dan mengubah namanya menjadi Bali United F.C.\n" +
                    "\n" +
                    "Pada tanggal 17 Juni 2019, Bali United menjadi klub pertama yang memiliki saham go public di Asia Tenggara dan kedua di Asia.[1] Pada pembukaan perdagangan perdananya, harga saham perusahaan langsung melambung 69,14 persen ke level Rp.296 per saham dari nilai saham perdana Rp.175 per lembar. klub ini melepas 33,33% kepemilikannya dengan total 2 miliar unit saham. Dengan demikian, dana yang diraup oleh klub ini mencapai 350 miliar rupiah",
            "Meski Pelindo IV Permata Indah telah hilang, bakat-bakat futsal di Sulawesi Selatan masih tertolong dengan bertahannya Young Rior Luwu Utara sebagai panggung mereka di kancah Profesional pada musim Liga 2020.\n" +
                    "\n" +
                    "Lolos dari zona degradasi musim lalu, Young Rior yang hampir menjual slotnya ini tertolong dengan masuknya PT. Menara Antam Sejahtera (MAS) sebagai sponsor utama tim. Ada andil mantan manajer timnas futsal putri dan ketua Asosiasi Futsal Provinsi Sulawesi Selatan, Abdul Sadat, dalam dukungan MAS karena dirinya merupakan Direktur Utama anak perusahaan PT. Antam tersebut.\n" +
                    "\n" +
                    "Hadirnya Abdul Sadat juga membantu pembentukan tim di mana eks Antam FC Jakarta bergabung ke dalam tim. Sebut saja Rahmatullah, Revi Afrian, Arief Hagi hingga Gerry Ferdinandus.\n" +
                    "\n" +
                    "Selain itu beberapa nama pemain senior Makassar juga hadir seperti Rahmat Arsyad dan Fhandy Permana. Nama senior ini disandingkan dengan beberapa pemain muda Sulawesi Selatan seperti Ramdhan Jamaludin, Sahir hingga Ariansyah.",
            "Madura United FC merupakan klub sepak bola asal Indonesia yang berbasis di Pamekasan, Madura. Klub ini sebelumnya bernama Pelita Bandung Raya yang pada waktu itu berlaga di Liga Super Indonesia. Pemilik Pelita Bandung Raya, Ari D. Sutedi akhirnya menjual klubnya ke Achsanul Qosasi, dan kemudian bertransformasi menjadi Madura United FC. Kini, Madura United menjelma menjadi salah satu klub terkuat di liga utama Indonesia.",
            "Bintang Timur Surabaya menjadi salah satu tim unggulan dalam perebutan gelar juara di PFL 2020 ini.\n" +
                    "\n" +
                    "Skuat BTS telah mempersiapkan musim 2020 pasca menyelesaikan musim 2019 di peringkat keempat. Persiapan sejak bulan Juli membuat skuat asuhan Hicham Benhammou cukup matang menjalani liga.\n" +
                    "\n" +
                    "Selain itu kerangka skuat timnas futsal Indonesia di BTS juga membuat tim tampil solid. Hadirnya dua pemain Belanda yaitu Khalid El Hattach dan Karim Mossaoui juga memberikan banyak pilihan dalam skuat.\n" +
                    "\n" +
                    "Ketajaman Andri Kustiawan, ujung tombak timnas futsal serta aksi dari Iqbal Iskandar patut dinantikan di skuat BTS musim ini.\n" +
                    "\n" +
                    "Meski begitu BTS juga harus berhati-hati karena komposisi skuat mereka bisa terganggu dengan persiapan timnas di AFC Futsal Championship 2020."
    };

    public static ArrayList<FootballModel> getListData(){
        FootballModel footballModel = null;
        ArrayList<FootballModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            footballModel = new FootballModel();
            footballModel.setLambangTeam(thumbnail[i]);
            footballModel.setNamaTeam(title[i]);
            footballModel.setPrivew(preview[i]);
            list.add(footballModel);
        }
        return list;
    }
}
