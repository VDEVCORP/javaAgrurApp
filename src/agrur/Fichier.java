
package agrur;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author smily
 */
public class Fichier {
    private BufferedWriter fw;
    private BufferedReader fr;
    private char mode;
   
    /**
     *
     * @param nomFic
     * @param s
     * @throws IOException
     */
    public void ouvrir(String nomFic, String s) throws IOException{
        mode=(s.toUpperCase()).charAt(0);
        File f =new File(nomFic);
        if(mode=='R' || mode =='L'){
            fr = new BufferedReader(new FileReader(f));
        }
        else if(mode=='W' || mode=='E'){
            fw = new BufferedWriter(new FileWriter(f));
        }
    }

    /**
     *
     * @param chaine
     * @throws IOException
     */
    public void ecrire(String chaine) throws IOException{
        if(chaine!=null){
            fw.write(chaine, 0, chaine.length());
        }
    }

    /**
     *
     * @throws IOException
     */
    public void fermer() throws IOException{
        if(mode=='R' || mode =='L'){
            fr.close();
        }
        if(mode=='W' || mode=='E'){
            fw.close();
        }
    }    
}
