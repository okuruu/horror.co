package horror.story.okuruu_creepypastahorrorstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Satu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu);

        TextView mTitleWindow = (TextView) findViewById(R.id.titleWindow);
        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);

        mTitleWindow.setText("Rumah Baru Yang Lama");

        String Isi = "Kami membeli sebuah rumah tua. Suamiku bertanggung jawab atas merenovasi hampir keseluruhan ruangan, mulai dari dapur hingga kamar tidur. Tugasku lebih mudah, hanya menyingkirkan wallpaper di dinding. Pemilik sebelumnya sepertinya sangat tergila-gila dengan wallpaper. Ia melapisi SEMUA dinding hingga langit-langit dengan wallpaper. Melepaskannya satu demi satu benar-benar brutal, namun juga memberikan rasa puas yang aneh. Perasaan paling enak kudapatkan apabila aku bisa mengelupasnya sepanjang mungkin. Di bawah tiap bagian kertas wallpaper, terdapat nama seseorang beserta tanggal. \n" +
                "\n" +
                "Rasa ingin tahu menguasaiku. Aku kemudian mencari salah satu nama lewat google dan menemukan bahwa orang tersebut dinyatakan hilang pada tanggal yang sesuai dengan yang tertera di bawah wallpaper. Hari berikutnya, aku membuat daftar nama dan tanggal. Ternyata benar, semua nama itu adalah nama orang hilang yang tak pernah ditemukan beserta tanggal mereka lenyap. Aku memberitahu polisi yang kemudian mengirim tim TKP mereka. \n" +
                "\n" +
                "Aku mencuri dengar salah satu teknisi berkata, \n" +
                "\n" +
                "‘Yup, benar ini manusia.’ \n" +
                "\n" +
                "Manusia? Apa maksudnya? \n" +
                "\n" +
                "‘Bu,’ kata petugas itu, ‘Dimana bahan yang anda kelupas dari tembok ini? Itu bukan wallpaper, akan tetapi kulit manusia’\n";

        mMessageWindow.setText(Isi);

    }

}
