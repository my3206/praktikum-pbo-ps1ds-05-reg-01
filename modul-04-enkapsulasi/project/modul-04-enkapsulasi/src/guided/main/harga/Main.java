package guided.main.harga;

import guided.hargapulsa.hargapulsa;
import guided.hargatoken.hargatoken;

public class Main {
    public static void main(String[] args){
        hargatoken objectToken = new hargatoken();
        objectToken.info();
        hargapulsa objectPulsa = new hargapulsa();
        objectPulsa.info();
    }
}

