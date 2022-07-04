import frame.KabupatenViewFrame;
import frame.KecamatanViewFrame;
import helpers.Koneksi;
//Dwian Adhi Nugraha 2010010047
public class Main {
    public static void main(String[] args) {
        //Koneksi.getConnection();
        KabupatenViewFrame viewFrame = new KabupatenViewFrame();
        //KecamatanViewFrame viewFrame = new KecamatanViewFrame();
        viewFrame.setVisible(true);
    }
}
