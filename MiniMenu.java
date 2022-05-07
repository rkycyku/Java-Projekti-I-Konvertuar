import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Rilind Kycyku
 * 
 */
public class MiniMenu {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        String perdoruesi, fillimi_i_menys = null, fillolojen, filloprogramin, filloinfo;
        int perdoruesilen, menuja, loja, programi;
        
        
        
        System.out.println("Pershendetje. Si quheni? ");
        perdoruesi = sc.nextLine();
        perdoruesilen = perdoruesi.length();
        
        //Menyja nese emri i pedoruesit ka 3 Shkronja
        if(perdoruesilen == 3)
        {
            System.out.println("\n///////////////////////////////////////////////");
            Thread.sleep(100);
            System.out.println("/                                             /");
            Thread.sleep(100);
            System.out.println("/                                             /");
            Thread.sleep(100);
            System.out.println("/                  Mini Menu                  /");
            Thread.sleep(100);
            System.out.println("/                                             /");
            Thread.sleep(100);
            System.out.println("/               Mirësevini, " + perdoruesi + "               /");
            Thread.sleep(100);
            System.out.println("/                                             /");
            Thread.sleep(100);
            System.out.println("/                                             /");
            Thread.sleep(100);
            System.out.println("///////////////////////////////////////////////");
            
            Thread.sleep(100);
            System.out.println("\nShkruani \"Po\" per te hapur menun,");
            Thread.sleep(100);
            System.out.println("Shkruani \"Jo\" per te mbyllur programin");
            Thread.sleep(100);
            // Keto variabla sherbejne per te pyetur perdoruesin a deshiron te hapi menun apo jo
            System.out.println("\nA deshironi te hapni menun? ");
            fillimi_i_menys = sc.next();
            fillimi_i_menys = fillimi_i_menys.toLowerCase();
        }
        //Menyja nese emri i pedoruesit ka 4 Shkronja
        else if(perdoruesilen == 4)
        {
            System.out.println("\n////////////////////////////////////////////////");
            Thread.sleep(100);
            System.out.println("/                                              /");
            Thread.sleep(100);
            System.out.println("/                                              /");
            Thread.sleep(100);
            System.out.println("/                  Mini Menu                   /");
            Thread.sleep(100);
            System.out.println("/                                              /");
            Thread.sleep(100);
            System.out.println("/               Mirësevini, " + perdoruesi + "               /");
            Thread.sleep(100);
            System.out.println("/                                              /");
            Thread.sleep(100);
            System.out.println("/                                              /");
            Thread.sleep(100);
            System.out.println("////////////////////////////////////////////////");
            
            Thread.sleep(100);
            System.out.println("\nShkruani \"Po\" per te hapur menun,");
            Thread.sleep(100);
            System.out.println("Shkruani \"Jo\" per te mbyllur programin");
            Thread.sleep(100);
            // Keto variabla sherbejne per te pyetur perdoruesin a deshiron te hapi menun apo jo
            System.out.println("\nA deshironi te hapni menun? ");
            fillimi_i_menys = sc.next();
            fillimi_i_menys = fillimi_i_menys.toLowerCase();
        }
        //Menyja nese emri i pedoruesit ka 5 Shkronja
        else if(perdoruesilen == 5)
        {
            System.out.println("\n/////////////////////////////////////////////////");
            Thread.sleep(100);
            System.out.println("/                                               /");
            Thread.sleep(100);
            System.out.println("/                                               /");
            Thread.sleep(100);
            System.out.println("/                   Mini Menu                   /");
            Thread.sleep(100);
            System.out.println("/                                               /");
            Thread.sleep(100);
            System.out.println("/               Mirësevini, " + perdoruesi + "               /");
            Thread.sleep(100);
            System.out.println("/                                               /");
            Thread.sleep(100);
            System.out.println("/                                               /");
            Thread.sleep(100);
            System.out.println("/////////////////////////////////////////////////");
            
            Thread.sleep(100);
            System.out.println("\nShkruani \"Po\" per te hapur menun,");
            Thread.sleep(100);
            System.out.println("Shkruani \"Jo\" per te mbyllur programin");
            Thread.sleep(100);
            // Keto variabla sherbejne per te pyetur perdoruesin a deshiron te hapi menun apo jo
            System.out.println("\nA deshironi te hapni menun? ");
            fillimi_i_menys = sc.next();
            fillimi_i_menys = fillimi_i_menys.toLowerCase();
        }
        
        //Menyja nese emri i pedoruesit ka 6 Shkronja
        else if(perdoruesilen == 6)
        {
            System.out.println("\n//////////////////////////////////////////////////");
            Thread.sleep(100);
            System.out.println("/                                                /");
            Thread.sleep(100);
            System.out.println("/                                                /");
            Thread.sleep(100);
            System.out.println("/                    Mini Menu                   /");
            Thread.sleep(100);
            System.out.println("/                                                /");
            Thread.sleep(100);
            System.out.println("/               Mirësevini, " + perdoruesi + "               /");
            Thread.sleep(100);
            System.out.println("/                                                /");
            Thread.sleep(100);
            System.out.println("/                                                /");
            Thread.sleep(100);
            System.out.println("//////////////////////////////////////////////////");
            
            Thread.sleep(100);
            System.out.println("\nShkruani \"Po\" per te hapur menun,");
            Thread.sleep(100);
            System.out.println("Shkruani \"Jo\" per te mbyllur programin");
            Thread.sleep(100);
            // Keto variabla sherbejne per te pyetur perdoruesin a deshiron te hapi menun apo jo
            System.out.println("\nA deshironi te hapni menun? ");
            fillimi_i_menys = sc.next();
            fillimi_i_menys = fillimi_i_menys.toLowerCase();
        }
        
        //Menyja nese emri i pedoruesit ka 7 Shkronja
        else if(perdoruesilen == 7)
        {
            System.out.println("\n///////////////////////////////////////////////////");
            Thread.sleep(100);
            System.out.println("/                                                 /");
            Thread.sleep(100);
            System.out.println("/                                                 /");
            Thread.sleep(100);
            System.out.println("/                    Mini Menu                    /");
            Thread.sleep(100);
            System.out.println("/                                                 /");
            Thread.sleep(100);
            System.out.println("/               Mirësevini, " + perdoruesi + "               /");
            Thread.sleep(100);
            System.out.println("/                                                 /");
            Thread.sleep(100);
            System.out.println("/                                                 /");
            Thread.sleep(100);
            System.out.println("///////////////////////////////////////////////////");
            
            Thread.sleep(100);
            System.out.println("\nShkruani \"Po\" per te hapur menun,");
            Thread.sleep(100);
            System.out.println("Shkruani \"Jo\" per te mbyllur programin");
            Thread.sleep(100);
            // Keto variabla sherbejne per te pyetur perdoruesin a deshiron te hapi menun apo jo
            System.out.println("\nA deshironi te hapni menun? ");
            fillimi_i_menys = sc.next();
            fillimi_i_menys = fillimi_i_menys.toLowerCase();
        }
        
        //Menyja nese emri i pedoruesit ka 8 Shkronja
        else if(perdoruesilen == 8)
        {
            System.out.println("\n////////////////////////////////////////////////////");
            Thread.sleep(100);
            System.out.println("/                                                  /");
            Thread.sleep(100);
            System.out.println("/                                                  /");
            Thread.sleep(100);
            System.out.println("/                    Mini Menu                     /");
            Thread.sleep(100);
            System.out.println("/                                                  /");
            Thread.sleep(100);
            System.out.println("/               Mirësevini, " + perdoruesi + "               /");
            Thread.sleep(100);
            System.out.println("/                                                  /");
            Thread.sleep(100);
            System.out.println("/                                                  /");
            Thread.sleep(100);
            System.out.println("////////////////////////////////////////////////////");
            
            Thread.sleep(100);
            System.out.println("\nShkruani \"Po\" per te hapur menun,");
            Thread.sleep(100);
            System.out.println("Shkruani \"Jo\" per te mbyllur programin");
            Thread.sleep(100);
            // Keto variabla sherbejne per te pyetur perdoruesin a deshiron te hapi menun apo jo
            System.out.println("\nA deshironi te hapni menun? ");
            fillimi_i_menys = sc.next();
            fillimi_i_menys = fillimi_i_menys.toLowerCase();
        }
        
        else{
            System.out.println("Miresevini " + perdoruesi);
            Thread.sleep(100);
            System.out.println("\nShkruani \"Po\" per te hapur menun,");
            Thread.sleep(100);
            System.out.println("Shkruani \"Jo\" per te mbyllur programin");
            Thread.sleep(100);
            // Keto variabla sherbejne per te pyetur perdoruesin a deshiron te hapi menun apo jo
            System.out.println("\nA deshironi te hapni menun? ");
            fillimi_i_menys = sc.next();
            fillimi_i_menys = fillimi_i_menys.toLowerCase();
        }
        
        while(!"po".equals(fillimi_i_menys) && !"jo".equals(fillimi_i_menys)){
            System.out.println("\nJu lutemi shkruani \"Po\" ose \"Jo\"!");
            System.out.println("A deshironi te hapni menun? ");
            fillimi_i_menys = sc.next();
            fillimi_i_menys = fillimi_i_menys.toLowerCase();
        }      
        
        while("jo".equals(fillimi_i_menys)){
            menuja = 0;
            loja = 0;
            programi = 0;
            System.out.println("\nMire u pafshim " + perdoruesi);
            break;
        }
        
        while("po".equals(fillimi_i_menys)){
            //# Mini Menuja per te vendosur cilen nga menut te hapesh
            System.out.println("\n////////////////////////////////////////////////");
            Thread.sleep(100);
            System.out.println("/                                              /");
            Thread.sleep(100);
            System.out.println("/                                              /");
            Thread.sleep(100);
            System.out.println("/                  Mini Menu                   /");
            Thread.sleep(100);
            System.out.println("/                                              /");
            Thread.sleep(100);
            System.out.println("/                                              /");
            Thread.sleep(100);
            System.out.println("/                                              /");
            Thread.sleep(100);
            System.out.println("////////////////////////////////////////////////");
            Thread.sleep(100);
            
            System.out.println("\nVendos numrin 1 per te hapur menun e lojrave");
            Thread.sleep(100);
            System.out.println("Vendos numrin 2 per te hapur menun e programeve");
            Thread.sleep(100);
            System.out.println("Vendos numrin 3 per te pare informacione rreth programit");
            Thread.sleep(100);
            //            # Variabla e menys
            System.out.println("\nCilen meny deshironi te hapni? ");
            menuja = sc.nextInt();
            
            //            # Ne rast se pordoruesi zgjedh nje numer i cili nuk eshte ne meny,
            //            # Ateher ky kod i mundeson te zgjedhi perseri
            while(menuja != 1 && menuja != 2 && menuja != 3){
                System.out.println("Keni shkruar numrin gabim!");
                System.out.println("\nJu lutemi shkeruani prap se cilen menu deshironi te hapni? ");
                menuja = sc.nextInt();
            }
            
            //            # Kodimet e Menyve 
            
            //            # Menuja e pare 
            while(menuja == 1){
                //                # Menuja e Lojrave
                System.out.println("\n////////////////////////////////////////////////");
                Thread.sleep(100);
                System.out.println("/                                              /");
                Thread.sleep(100);
                System.out.println("/                                              /");
                Thread.sleep(100);
                System.out.println("/                  Game Menu                   /");
                Thread.sleep(100);
                System.out.println("/                                              /");
                Thread.sleep(100);
                System.out.println("/                                              /");
                Thread.sleep(100);
                System.out.println("/                                              /");
                Thread.sleep(100);
                System.out.println("////////////////////////////////////////////////");
                Thread.sleep(100);

                System.out.println("\nVendos numrin 1 per te luajtur lojen e \"Lotaris\"");
                Thread.sleep(100);
                System.out.println("Vendos numrin 2 per te luajtur lojen e \"Hedhjes se gureve\"");
                Thread.sleep(100);
                System.out.println("Vendos numrin 3 per te luajtur lojen e \"Gure,Leter & Gershere\"");
                Thread.sleep(100);
                System.out.println("Vendos numrin 4 per te luajtur lojen e \"Fantazmes\"");
                Thread.sleep(100);
                System.out.println("Vendos numrin 9 per tu kthyer prapa ne menu");
                Thread.sleep(100);

                //            # Variabla e lojes
                System.out.println("\nCilen loje deshironi te luani? ");
                loja = sc.nextInt();

                //            # Ne rast se pordoruesi zgjedh nje numer i cili nuk eshte ne meny,
                //            # Ateher ky kod i mundeson te zgjedhi perseri
                while(loja != 1 && loja != 2 && loja != 3 && loja != 4 && loja != 9){
                    System.out.println("Keni shkruar numrin gabim!");
                    System.out.println("\nJu lutemi shkeruani prap se cilen loje deshironi te luani? ");
                    loja = sc.nextInt();
                }
                
                //                # Fillimi i kodimit te lojrave
                //        
                
                //                # Loja e lotaris
                while(loja == 1){
                    System.out.println("\n////////////////////////////////////////////////////");
                    Thread.sleep(100);
                    System.out.println("/                                                  /");
                    Thread.sleep(100);
                    System.out.println("/                                                  /");
                    Thread.sleep(100);
                    System.out.println("/                  Loja e Lotaris                  /");
                    Thread.sleep(100);
                    System.out.println("/                                                  /");
                    Thread.sleep(100);
                    System.out.println("/                                                  /");
                    Thread.sleep(100);
                    System.out.println("/                                                  /");
                    Thread.sleep(100);
                    System.out.println("////////////////////////////////////////////////////");
                    Thread.sleep(100);
                    
                    //                      #Per te pytur perdoruesin a deshiron te filloj lojen
                    System.out.println("\nShkruani \"Po\" per tu vendosur numrat,");
                    Thread.sleep(100);
                    System.out.println("Shkruani \"Jo\" per te mbyllur lojen.");
                    Thread.sleep(100);
                    
                    System.out.println("\nA deshironi te filloni me vendosjen e numrave? ");
                    fillolojen = sc.next();
                    fillolojen = fillolojen.toLowerCase();
                    
                    while(!"po".equals(fillolojen) && !"jo".equals(fillolojen)){
                        System.out.println("\nJu lutemi shkruani \"Po\" ose \"Jo\"!");
                        System.out.println("A deshironi te vendosni numrat? ");
                        fillolojen = sc.next();
                        fillolojen = fillolojen.toLowerCase();
                    }      
                    
                    while("po".equals(fillolojen)){
                        //# false ne kete rast sherben per ti bere variablat si te pasakta 
                        boolean i1ne1 = false;
                        boolean i2ne1 = false;
                        boolean i3ne1 = false;
                        boolean i1ne2 = false;
                        boolean i2ne2 = false;
                        boolean i3ne2 = false;
                        boolean i1ne3 = false;
                        boolean i2ne3 = false;
                        boolean i3ne3 = false;

                        //# Keto variabla sherbejn per ti bere ato si 0 apo fillestare pastaj ti japin vlere kodet e meposhtme
                        int sakta = 0;
                        int shumaparave = 0;

                        //# Lista e numrave
                        //                    numrat = [1,2,3,4,5,6,7,8,9];

                        //# Keto variabla sherbejne per te zgjedhur nje numer nga lista "numrat"
                        int kompjuteri1 = rd.nextInt(9)+1;
                        int kompjuteri2 = rd.nextInt(9)+1;
                        int kompjuteri3 = rd.nextInt(9)+1;

                        //                    # Keto variabla sherbejne per te vendosur numrat nga pordoruesi
                        System.out.println("\nVendosni nje numer nga 1 deri ne 9: ");
                        int numri1 = sc.nextInt();
                        
                        while(numri1 != 1 && numri1 != 2 && numri1 != 3 && numri1 != 4 && numri1 != 5 && numri1 != 6 && numri1 != 7 && numri1 != 8 && numri1 != 9){
                            System.out.println("\nJu lutemi vendosni nje numer nga 1 deri ne 9!");
                            System.out.println("Vendosni perseri numrin e 1! ");
                            numri1 = sc.nextInt();
                        }
                        
                        System.out.println("\nVendosni nje numer tjeter nga 1 deri ne 9: ");
                        int numri2 = sc.nextInt();
                        
                        while(numri2 != 1 && numri2 != 2 && numri2 != 3 && numri2 != 4 && numri2 != 5 && numri2 != 6 && numri2 != 7 && numri2 != 8 && numri2 != 9){
                            System.out.println("\nJu lutemi vendosni nje numer nga 1 deri ne 9!");
                            System.out.println("Vendosni perseri numrin e 2! ");
                            numri2 = sc.nextInt();
                        }
                        
                        
                        System.out.println("\nVendosni per here te fundit nje numer nga 1 deri ne 9: ");
                        int numri3 = sc.nextInt();
                        
                        while(numri3 != 1 && numri3 != 2 && numri3 != 3 && numri3 != 4 && numri3 != 5 && numri3 != 6 && numri3 != 7 && numri3 != 8 && numri3 != 9){
                            System.out.println("\nJu lutemi vendosni nje numer nga 1 deri ne 9!");
                            System.out.println("Vendosni perseri numrin e 3! ");
                            numri3 = sc.nextInt();
                        }

                        //                    # Keto sherbejn per te treguar se a eshte numri i 1 i sakt apo pasakt
                        if(kompjuteri1 == numri1){
                            i1ne1 = true;
                            sakta++;
                        }
                        else if(i1ne1 == false && kompjuteri1 == numri2){
                            i2ne1 = true;
                            sakta++;
                        }
                        else if(i1ne1 == false && i2ne1 == false && kompjuteri1 == numri3){
                            i3ne1 = true;
                            sakta++;
                        }
                        //                    # Keto sherbejn per te treguar se a eshte numri i 2 i sakt apo pasakt
                        if(i1ne1 == false && kompjuteri2 == numri1){
                            i1ne2 = true;
                            sakta++;
                        }
                        else if(i1ne2 == false && i2ne1 == false && kompjuteri2 == numri2){
                            i2ne2 = true;
                            sakta++;
                        }
                        else if(i1ne2 == false && i2ne2 == false && i3ne1 == false && kompjuteri2 == numri3){
                            i3ne2 = true;
                            sakta++;
                        }

                        //                    # Keto sherbejn per te treguar se a eshte numri i 3 i sakt apo pasakt
                        if(i1ne1 == false && i1ne2 == false && kompjuteri3 == numri1){
                            i1ne3 = true;
                            sakta = sakta + 1;
                        }
                        else if(i1ne3 == false && i2ne1 == false && i2ne2 == false && kompjuteri3 == numri2){
                            i2ne3 = true;
                            sakta = sakta + 1;
                        }
                        else if(i1ne3 == false && i2ne3 == false && i3ne1 == false && i3ne2 == false && kompjuteri3 == numri3){
                            i3ne3 = true;
                            sakta = sakta + 1;
                        }

                        //                    # Keto funksione sherbejne per te caktuar shumen e parave te fituara
                        if(sakta == 1){
                            shumaparave = 250;
                        }
                        else if(sakta == 2){
                            shumaparave = 500;
                        }
                        else if(sakta == 3){
                            shumaparave = 1000;
                        }
                        else{
                            shumaparave = 0;
                        }

                        //                          # Printimi i rezultatit ne qoftese asnje numer nuk eshte i sakte
                        if(sakta == 0){
                            Thread.sleep(100);
                            System.out.println("\nKompjuteri ka zgjedhur keto numra: " + kompjuteri1 + ", " + kompjuteri2 + " & " + kompjuteri3); 
                            Thread.sleep(100);
                            System.out.println("Ndersa ti ke zgjedhur keto numra: " + numri1 + ", " + numri2 + " & " + numri3) ;
                            Thread.sleep(100);
                            System.out.println("Na vjen keq por ti nuk ke fituar asgje pasiqe nuk keni asnje numer te sakt!");
                            Thread.sleep(100);
                            loja = 0;
                        }
                        //                          # Printimi i rezultatit ne qoftese vetem nje numer eshte i sakte
                        else if(sakta == 1){
                            Thread.sleep(100);
                            System.out.println("\nKompjuteri ka zgjedhur keto numra: " + kompjuteri1 + ", " + kompjuteri2 + " & " + kompjuteri3);
                            Thread.sleep(100);
                            System.out.println("Ndersa ti ke zgjedhur keto numra: " + numri1 + ", " + numri2 + " & " + numri3);
                            Thread.sleep(100);
                            System.out.println("Dhe ti ke vetem " + sakta + " numer te sakte");
                            Thread.sleep(100);
                            System.out.println("Dhe ke fituar $" + shumaparave);
                            Thread.sleep(100);
                            loja = 0;
                        }
                        //                          # Printimi i rezultatit kur dy numera jane te sakta
                        else if(sakta == 2){
                            Thread.sleep(100);
                            System.out.println("\nKompjuteri ka zgjedhur keto numra: " + kompjuteri1 + ", " + kompjuteri2 + " & " + kompjuteri3);
                            Thread.sleep(100);
                            System.out.println("Ndersa ti ke zgjedhur keto numra: " + numri1 + ", " + numri2 + " & " + numri3);
                            Thread.sleep(100);
                            System.out.println("Dhe ti ke " + sakta + " numera te sakte");
                            Thread.sleep(100);
                            System.out.println("Dhe ke fituar $" + shumaparave);
                            Thread.sleep(100);
                            loja = 0;
                        }
                        //                          # Printimi i rezultatit ne qoftese te gjitha numrat jane te sakta
                        else if(sakta == 3){
                            Thread.sleep(100);
                            System.out.println("\nKompjuteri ka zgjedhur keto numra: " + kompjuteri1 + ", " + kompjuteri2 + " & " + kompjuteri3) ;
                            Thread.sleep(100);
                            System.out.println("Ndersa ti ke zgjedhur keto numra: " + numri1 + ", " + numri2 + " & " + numri3);
                            Thread.sleep(100);
                            System.out.println("Ju lumte ju keni gjetur " + sakta + " numra te sakte") ;
                            Thread.sleep(100);
                            System.out.println("Dhe ju keni fituar $" + shumaparave);
                            Thread.sleep(100);
                            loja = 0;
                        }

                        Thread.sleep(1000);
                        System.out.println("\nShkruani \"Po\" per tu gjuajtur perseri,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur lojen.");
                        Thread.sleep(100);
                        System.out.println("\nA deshironi te gjuani perseri? ");
                        fillolojen = sc.next();
                        fillolojen = fillolojen.toLowerCase();
                    }
                    
                    if("jo".equals(fillolojen)){
                        loja = 0;
                        System.out.println("\nShkruani \"Po\" per tu rikthyer,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                        Thread.sleep(100);
                        System.out.println("A deshironi te ktheheni mbrapa? ");
                        fillimi_i_menys = sc.next();
                        fillimi_i_menys = fillimi_i_menys.toLowerCase();
                    }
                    
                    
                    //                          # Keto funksione sherbejn per tu kthyer ne menu
                    
                }    
                
                while(loja == 2){
                    System.out.println("\n//////////////////////////////////////////////////////////////");
                    Thread.sleep(100);
                    System.out.println("/                                                            /");
                    Thread.sleep(100);
                    System.out.println("/                                                            /");
                    Thread.sleep(100);
                    System.out.println("/                  Loja e hedhjes se gureve                  /");
                    Thread.sleep(100);
                    System.out.println("/                                                            /");
                    Thread.sleep(100);
                    System.out.println("/                                                            /");
                    Thread.sleep(100);
                    System.out.println("/                                                            /");
                    Thread.sleep(100);
                    System.out.println("//////////////////////////////////////////////////////////////");
                    Thread.sleep(100);
                    
                    //                    # Variabla e Gjuaj Guret
                    System.out.println("\nShkruani \"Po\" per tu gjuajtur guret,");
                    Thread.sleep(100);
                    System.out.println("Shkruani \"Jo\" per te mbyllur lojen.");
                    Thread.sleep(100);
                    
                    System.out.println("\nA deshironi te filloni me gjuajtjen e gureve? ");
                    fillolojen = sc.next();
                    fillolojen = fillolojen.toLowerCase();
                    
                    while(!"po".equals(fillolojen) && !"jo".equals(fillolojen)){
                        System.out.println("\nJu lutemi shkruani \"Po\" ose \"Jo\"!");
                        System.out.println("A deshironi te filloni me gjuajtjen e gureve? ");
                        fillolojen = sc.next();
                        fillolojen = fillolojen.toLowerCase();
                    }     
                    
                    //                    # While ne kete rast perdoret per kur Gjuaj Guret eshte Po
                    while("po".equals(fillolojen)){
                    //                        # Guri i 1
                        int g1 = rd.nextInt(6)+1;
                    //                        # Guri i 2
                        int g2 = rd.nextInt(6)+1;
                    //                        # Guri i 3
                        int g3 = rd.nextInt(6)+1;
                    //                        # Guri i 4
                        int g4 = rd.nextInt(6)+1;
                    
                    //                        # Printimi i Gureve per lojtarin e 1
                        System.out.println("\nPo Rrotullohen guret per lojtarin e 1...");
                        Thread.sleep(1000);
                        System.out.println("\nKeni qelluar...");
                        Thread.sleep(1000);
                        System.out.println("Guri i pare: " + g1);
                        Thread.sleep(800);
                        System.out.println("Guri i dyte: " + g2);
                    //                        # Printimi i Gureve per lojtarin e 2
                        System.out.println("\nPo rrotullohen guret per lojtarin e 2...");
                        Thread.sleep(1000);
                        System.out.println("\nKeni qelluar...");
                        Thread.sleep(1000);
                        System.out.println("Guri i pare: " + g3);
                        Thread.sleep(1000);
                        System.out.println("Guri i dyte: " + g4);

                    //                        # Guret per lojtarin e 1
                        int lojtari1 = g1 + g2;
                        Thread.sleep(1000);
                        System.out.println("\nLojtari 1 ne total ka: " +lojtari1);
                    //                        # Guret per lojtarin e 2
                        int lojtari2 = g3 + g4;
                        Thread.sleep(1000);
                        System.out.println("Lojtari 2 ne total ka: " + lojtari2);

                    //                        # Ky funksion sherben kur guret e lojtarit te 1 jane me te madhenj se guret e lojtarit te 2 
                        if(lojtari1 > lojtari2){
                            Thread.sleep(1000);
                            System.out.println("\nKa fituar lojtari 1");
                        }
                    //                        # Ky funksion sherben kur guret e lojtarit te 1 jane me te vegjel se guret e lojtarit te 2 
                        else if(lojtari1 < lojtari2){
                            Thread.sleep(1000);
                            System.out.println("\nKa fituar lojtari 2");
                        }
                    //                        # Ky funksion sherben kur guret e 2 lojtareve jane barazim
                        else{
                            Thread.sleep(1000);
                            System.out.println("\nRezultati eshte barazim");
                        }   
                    
                        Thread.sleep(1000);
                        System.out.println("\nShkruani \"Po\" per tu gjuajtur perseri,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur lojen.");
                        Thread.sleep(100);
                        System.out.println("\nA deshironi te gjuani perseri? ");
                        fillolojen = sc.next();
                        fillolojen = fillolojen.toLowerCase();
                    }
                    
                    //                        # Keto funksione sherbejn per tu kthyer ne menu
                    if("jo".equals(fillolojen)){
                        loja = 0;
                        System.out.println("\nShkruani \"Po\" per tu rikthyer,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                        Thread.sleep(100);
                        System.out.println("A deshironi te ktheheni mbrapa? ");
                        fillimi_i_menys = sc.next();
                        fillimi_i_menys = fillimi_i_menys.toLowerCase();
                    }
                }
                
                //# Loja e Gure,Leter & Gershere
                while(loja == 3){
                    //# Grafiku i lojes se Gure,Leter & Gershere
                    System.out.println("\n//////////////////////////////////////////////////////////////////////////////");
                    Thread.sleep(100);
                    System.out.println("/                                                                            /");
                    Thread.sleep(100);
                    System.out.println("/                                                                            /");
                    Thread.sleep(100);
                    System.out.println("/                         Loja e Gure,Leter & Gershere                       /");
                    Thread.sleep(100);
                    System.out.println("/                                                                            /");
                    Thread.sleep(100);
                    System.out.println("/                                                                            /");
                    Thread.sleep(100);
                    System.out.println("//////////////////////////////////////////////////////////////////////////////");
                    
                    
                    //                      #Per te pytur perdoruesin a deshiron te filloj lojen
                    System.out.println("\nShkruani \"Po\" per te luajtur,");
                    Thread.sleep(100);
                    System.out.println("Shkruani \"Jo\" per te mbyllur lojen.");
                    Thread.sleep(100);
                    
                    System.out.println("\nA deshironi te filloni te luani? ");
                    fillolojen = sc.next();
                    fillolojen = fillolojen.toLowerCase();
                    
                    while(!"po".equals(fillolojen) && !"jo".equals(fillolojen)){
                        System.out.println("\nJu lutemi shkruani \"Po\" ose \"Jo\"!");
                        System.out.println("A deshironi te filloni te luani? ");
                        fillolojen = sc.next();
                        fillolojen = fillolojen.toLowerCase();
                    }      
                    
                    while("po".equals(fillolojen)){
                        //# Keto sherbejne per te treguar rregullat e lojes
                        System.out.println("Rregullat e lojes Gure,Leter & Gershere jane keto: \n"
                                            +"Gure vs Leter->Fiton ai qe ka zgjedhur Leter \n"
                                            + "Gure vs Gershere->Fiton ai qe ka zgjedhur Gure \n"
                                            +"Leter vs Gershere->Fiton ai qe ka zgjedhur Gersher \n");

                        //# Ne kete liste jane te vendosur opcinet e lojes
                        String njeriu;

                        //# Kjo variabel sherben per ti dhene vlere i-se
                        int i = 1;

                        //# Ky kod eshte funksional vetem kur i eshte me e vogel apo e njejte me 5
                        while(i <= 5){
                            System.out.println("\nGure, leter apo gershere: ");
                            njeriu = sc.next();
                            njeriu = njeriu.toLowerCase();
                            Thread.sleep(100);
                            
                            String pc;
                            int rand = rd.nextInt(3)+1;
                            
                            if(rand == 0) {
                                pc = "gure";
                            } 
                            else if(rand == 1) {
                                pc = "leter";
                            } 
                            else {
                                pc = "gershere";
                            }
                            
                            //# Ky funksion sherben kur eshte shkruar teksti gabim
                            while(!"gure".equals(njeriu) && !"leter".equals(njeriu) && !"gershere".equals(njeriu)){
                                System.out.println("\n*****NUK ESHTE SHENUAR MIRE TEKSTI!*****");
                                Thread.sleep(100);
                                System.out.println("\nGure, leter apo gershere: ");
                                njeriu = sc.next();
                                njeriu = njeriu.toLowerCase();
                                Thread.sleep(100);
                            }
                                
                            //# Ky funksion sherben kur Kompjuteri dhe Perdoruesi kane zjedhur te njejtin opcion    
                            while(pc.equals(njeriu)){
                                System.out.println("\nKompjuteri ka zgjedhur: " + pc);
                                System.out.println("Ju keni zgjedhur: " + njeriu);
                                Thread.sleep(100);
                                System.out.println("*****BARAZIM*****");
                                Thread.sleep(100);
                                System.out.println("\nGure, leter apo gershere: ");
                                njeriu = sc.next();
                                njeriu = njeriu.toLowerCase();
                                Thread.sleep(100);
                                
                                rand = rd.nextInt(3)+1;
                                if(rand == 1) {
                                    pc = "gure";
                                } 
                                else if(rand == 2) {
                                    pc = "leter";
                                } 
                                else {
                                    pc = "gershere";
                                }
                                i++;
                            }
                            
                            //# Keto funksione sherbejne kur Kompjuteri dhe Perdoruesi kane zgjedhur opsione te ndryshme
                            //## Keto funksione gjithashtu sherbejne per te treguar se a keni humbur apo keni fituar
                            if("gershere".equals(pc) && "gure".equals(njeriu)){
                                System.out.println("\nKompjuteri ka zgjedhur: " + pc);
                                System.out.println("Ju keni zgjedhur: " + njeriu);
                                Thread.sleep(100);
                                System.out.println("Fituat pas heres se " + i);
                                Thread.sleep(100);
                                break;
                            }    
                                
                            else if("gershere".equals(pc) && "leter".equals(njeriu)){
                                System.out.println("\nKompjuteri ka zgjedhur: " + pc);
                                System.out.println("Ju keni zgjedhur: " + njeriu);
                                Thread.sleep(100);
                                System.out.println("*****HUMBE*****");
                                Thread.sleep(100);
                                
                                rand = rd.nextInt(3)+1;
                                if(rand == 1) {
                                    pc = "gure";
                                } 
                                else if(rand == 2) {
                                    pc = "leter";
                                } 
                                else {
                                    pc = "gershere";
                                }
                            }
                            
                            else if("gure".equals(pc) && "gershere".equals(njeriu)){
                                System.out.println("\nKompjuteri ka zgjedhur: " + pc);
                                System.out.println("Ju keni zgjedhur: " + njeriu);
                                Thread.sleep(100);
                                System.out.println("*****HUMBE*****");
                                Thread.sleep(100);
                                
                                rand = rd.nextInt(3)+1;
                                if(rand == 1) {
                                    pc = "gure";
                                } 
                                else if(rand == 2) {
                                    pc = "leter";
                                } 
                                else {
                                    pc = "gershere";
                                }
                            }
                                    
                            else if("gure".equals(pc) && "leter".equals(njeriu)){
                                System.out.println("\nKompjuteri ka zgjedhur: " + pc);
                                System.out.println("Ju keni zgjedhur: " + njeriu);
                                Thread.sleep(100);
                                System.out.println("Fituat pas heres se " + i);
                                Thread.sleep(100);
                                break;
                            }
                                    
                            else if("leter".equals(pc) && "gure".equals(njeriu)){
                                System.out.println("\nKompjuteri ka zgjedhur: " + pc);
                                System.out.println("Ju keni zgjedhur: " + njeriu);
                                Thread.sleep(100);
                                System.out.println("*****HUMBE*****");
                                Thread.sleep(100);
                                
                                rand = rd.nextInt(3)+1;
                                if(rand == 1) {
                                    pc = "gure";
                                } 
                                else if(rand == 2) {
                                    pc = "leter";
                                } 
                                else {
                                    pc = "gershere";
                                }
                            }
                                    
                            else if("leter".equals(pc) && "gershere".equals(njeriu)){
                                System.out.println("\nKompjuteri ka zgjedhur: " + pc);
                                System.out.println("Ju keni zgjedhur: " + njeriu);
                                Thread.sleep(100);
                                System.out.println("Fituat pas heres se " + i);
                                Thread.sleep(100);
                                break;
                            }
                                
                            //# Ky funksion sherben kur Perodoruesi ka kaluar limitin e mundesive 
                            if(i >= 5){
                                System.out.println("\nKeni kaluar limit e mundesive, keni pasur vetem " + i + " raste.");
                                Thread.sleep(100);
                                break;
                            }
                            i++;
                            
                        }
                    
                        Thread.sleep(1000);
                        System.out.println("\nShkruani \"Po\" per tu luajtur perseri,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur lojen.");
                        Thread.sleep(100);
                        System.out.println("\nA deshironi te luani perseri? ");
                        fillolojen = sc.next();
                        fillolojen = fillolojen.toLowerCase();
                    }
                    //# Keto funksione sherbejn per tu kthyer ne menu
                    if("jo".equals(fillolojen)){
                        loja = 0;
                        System.out.println("\nShkruani \"Po\" per tu rikthyer,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                        Thread.sleep(100);
                        System.out.println("A deshironi te ktheheni mbrapa? ");
                        fillimi_i_menys = sc.next();
                        fillimi_i_menys = fillimi_i_menys.toLowerCase();
                    }
                }
                
                //# Loja e Fantazmes
                while(loja == 4){
                    //# Grafiku i lojes se lotaris
                    System.out.println("\n////////////////////////////////////////////////////////////////////");
                    Thread.sleep(100);
                    System.out.println("/                                                                  /");
                    Thread.sleep(100);
                    System.out.println("/                                                                  /");
                    Thread.sleep(100);
                    System.out.println("/                         Loja e Fantazmes                         /");
                    Thread.sleep(100);
                    System.out.println("/                                                                  /");
                    Thread.sleep(100);
                    System.out.println("/                                                                  /");
                    Thread.sleep(100);
                    System.out.println("////////////////////////////////////////////////////////////////////");
                    
                    //                      #Per te pytur perdoruesin a deshiron te filloj lojen
                    System.out.println("\nShkruani \"Po\" per te luajtur,");
                    Thread.sleep(100);
                    System.out.println("Shkruani \"Jo\" per te mbyllur lojen.");
                    Thread.sleep(100);
                    
                    System.out.println("\nA deshironi te filloni te luani? ");
                    fillolojen = sc.next();
                    fillolojen = fillolojen.toLowerCase();
                    
                    while(!"po".equals(fillolojen) && !"jo".equals(fillolojen)){
                        System.out.println("\nJu lutemi shkruani \"Po\" ose \"Jo\"!");
                        System.out.println("A deshironi te filloni te luani? ");
                        fillolojen = sc.next();
                        fillolojen = fillolojen.toLowerCase();
                    }     
                    
                    while("po".equals(fillolojen)){
                        // # Pershendetja e Perdoruesit
                        System.out.println("\nPershendetje " + perdoruesi + " eshte koha per te luajtur \"Loja e Fantazmes\"");
                        Thread.sleep(1000);

                        //# Kodimi i lojes
                        boolean ndihem_i_guximshem = true;
                        int piket = 0;
                        int dera, dera_e_fantazmes, numri_i_deres;

                        while(ndihem_i_guximshem == true){
                            dera_e_fantazmes = rd.nextInt(3)+1;
                            System.out.println("\nTre dyer perpara...");
                            Thread.sleep(1000);
                            System.out.println("Nje fantazem pas njeres.");
                            Thread.sleep(1000);
                            System.out.println("Cilen dere do te hapni?");
                            Thread.sleep(1000);
                            System.out.println("1,2 apo 3? ");
                            dera = sc.nextInt();

                            while(dera != 1 && dera != 2 && dera != 3){
                                System.out.println("Keni shkruar numrin gabim!");
                                System.out.println("\nJu lutemi shkeruani prap se cilen dere deshironi te hapni? ");
                                dera = sc.nextInt();
                            }

                            Thread.sleep(1000);
                            numri_i_deres = dera;


                            //## Ky sherben ne rast se numri i zgjedhur eshte i njejte
                            //## Me ate ne te cilin eshte fantazma
                            if(numri_i_deres == dera_e_fantazmes){
                                System.out.println("\nFantazem!");
                                Thread.sleep(1000);
                                ndihem_i_guximshem = false;
                            }
                            //## Ne rast se numri i zgjedhur nuk eshte i njejte me ate te fantazmes
                            //## Ky kod muneson vazhdimin e lojes per ne deren tjeter
                            else{
                                System.out.println("\nNuk ka Fantazem!");
                                Thread.sleep(1000);
                                System.out.println("Ti u fute ne dhomen tjeter.");
                                Thread.sleep(1000);
                                piket++;
                            }
                        }    
                        System.out.println("\nLargohu!");
                        Thread.sleep(1000);
                        //# Keto funksione sherbejne per te printuar rezultatin
                        if(piket == 1){
                            System.out.println("Loja Mbaroi! Ti kalove " + piket + " dhomë");
                        }
                        else{
                            System.out.println("Loja Mbaroi! Ti kalove " + piket + " dhoma");
                        }

                        Thread.sleep(1000);
                        System.out.println("\nShkruani \"Po\" per tu luajtur perseri,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur lojen.");
                        Thread.sleep(100);
                        System.out.println("\nA deshironi te luani perseri? ");
                        fillolojen = sc.next();
                        fillolojen = fillolojen.toLowerCase();
                    }
                    
                    //# Keto funksione sherbejn per tu kthyer ne menu
                    if("jo".equals(fillolojen)){
                        loja = 0;
                        System.out.println("\nShkruani \"Po\" per tu rikthyer,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                        Thread.sleep(100);
                        System.out.println("A deshironi te ktheheni mbrapa? ");
                        fillimi_i_menys = sc.next();
                        fillimi_i_menys = fillimi_i_menys.toLowerCase();
                    }
                }
                
                //# Ky kod sherben per tu kthyer prapa ne menu
                while(loja == 9){
                    loja = 0;
                    menuja = 0;
                    fillimi_i_menys = "po";
                }
                //# Ky funksion sherben kur perdoruesi nuk deshiron te kthehet ne menu
                while("jo".equals(fillimi_i_menys)){
                    loja = 0;
                    menuja = 0;
                    System.out.println("\nMire u pafshim " + perdoruesi);
                    Thread.sleep(100);
                    break;
                } 
            }
            
            //# Menuja e dyte
            while(menuja == 2){
                //# Menuja e programeve
                System.out.println("\n//////////////////////////////////////////////////////////////////////");
                Thread.sleep(100);
                System.out.println("/                                                                    /");
                Thread.sleep(100);
                System.out.println("/                                                                    /");
                Thread.sleep(100);
                System.out.println("/                            Programs Menu                           /");
                Thread.sleep(100);
                System.out.println("/                                                                    /");
                Thread.sleep(100);
                System.out.println("/                                                                    /");
                Thread.sleep(100);
                System.out.println("//////////////////////////////////////////////////////////////////////");
                Thread.sleep(100);
                //# Programet ne dispozicion
                System.out.println("\nVendos numrin 1 per te perdorur programin e \"Kovertimit te gradeve\"");
                Thread.sleep(100);
                System.out.println("Vendos numrin 2 per te perdorur programin e \"Gjetjes se perimetrit\"");
                Thread.sleep(100);
                System.out.println("Vendos numrin 9 per tu kthyer prapa ne menu");
                Thread.sleep(100);
                //# Variabla e Programit
                System.out.println("\nCilin program deshironi te perdorni? ");
                programi = sc.nextInt();

                //# Ne rast se pordoruesi zgjedh nje program i cili nuk eshte ne meny,
                //# Ateher ky kod i mundeson te zgjedhi perseri
                while(programi != 1 && programi !=2 && programi !=9){
                    System.out.println("Keni shkruar numrin gabim!");
                    System.out.println("\nJu lutemi shkeruani prap se cilin programe deshironi te hapni? ");
                    programi = sc.nextInt();
                }
                //# Fillimi i kodimit te Programeve
                
                //# Konvertimi i Gradeve
                while(programi == 1){
                    //# Grafiku i Konvertimit te Gradeve
                    System.out.println("\n/////////////////////////////////////////////////");
                    Thread.sleep(100);
                    System.out.println("/                                               /");
                    Thread.sleep(100);
                    System.out.println("/                                               /");
                    Thread.sleep(100);
                    System.out.println("/            Konvertimi i Gradeve               /");
                    Thread.sleep(100);
                    System.out.println("/                                               /");
                    Thread.sleep(100);
                    System.out.println("/                                               /");
                    Thread.sleep(100);
                    System.out.println("/////////////////////////////////////////////////");
                    Thread.sleep(100);
                    
                    //                      #Per te pytur perdoruesin a deshiron te filloj lojen
                    System.out.println("\nShkruani \"Po\" per te filluar konvertimin,");
                    Thread.sleep(100);
                    System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                    Thread.sleep(100);
                    
                    System.out.println("\nA deshironi te filloni te konvertimin? ");
                    filloprogramin = sc.next();
                    filloprogramin = filloprogramin.toLowerCase();
                    
                    while(!"po".equals(filloprogramin) && !"jo".equals(filloprogramin)){
                        System.out.println("\nJu lutemi shkruani \"Po\" ose \"Jo\"!");
                        System.out.println("A deshironi te filloni te konvertimin? ");
                        filloprogramin = sc.next();
                        filloprogramin = filloprogramin.toLowerCase();
                    }
                    
                    while("po".equals(filloprogramin)){
                        float grada, F, C;
                        String shkalla;

                        //# Variabla e gradeve
                        System.out.println("\nSa grade eshte: ");
                        grada = sc.nextFloat();
                        //# Variabla e shkalles
                        System.out.println("Deshironi ta konvertoni ne C apo F: ");
                        shkalla = sc.next();
                        shkalla = shkalla.toLowerCase();
                        //# Formula per konvertimin e °F
                        F = (grada * 9/5) + 32;
                        //# Formula per konvertimin e °C
                        C = (grada - 32) * 5/9;

                        //# Printimi per °C
                        if("c".equals(shkalla)){
                            System.out.println(grada + " °F " + " eshte e barabart me " + C + "°C");
                        }
                        //# Printimi per °F
                        else if("f".equals(shkalla)){
                            System.out.println(grada + " °C " + " eshte e barabart me " + F +"°F");
                        }
                        
                        Thread.sleep(1000);
                        System.out.println("\nShkruani \"Po\" per tu konvertuar perseri,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                        Thread.sleep(100);
                        System.out.println("\nA deshironi te konvertoni perseri? ");
                        filloprogramin = sc.next();
                        filloprogramin = filloprogramin.toLowerCase();
                    }
                    
                    //# Keto funksione sherbejn per tu kthyer ne menu
                    if("jo".equals(filloprogramin)){
                        programi = 0;
                        System.out.println("\nShkruani \"Po\" per tu rikthyer,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                        Thread.sleep(100);
                        System.out.println("A deshironi te ktheheni mbrapa? ");
                        fillimi_i_menys = sc.next();
                        fillimi_i_menys = fillimi_i_menys.toLowerCase();
                    }
                }
                
                //# Perimetri
                while(programi == 2){
                    //# Grafiku i perimetrit
                    System.out.println("\n////////////////////////////////////////////////////");
                    Thread.sleep(100);
                    System.out.println("/                                                  /");
                    Thread.sleep(100);
                    System.out.println("/                                                  /");
                    Thread.sleep(100);
                    System.out.println("/              Gjetja e Perimetrit                 /");
                    Thread.sleep(100);
                    System.out.println("/                                                  /");
                    Thread.sleep(100);
                    System.out.println("/                                                  /");
                    Thread.sleep(100);
                    System.out.println("////////////////////////////////////////////////////");
                    Thread.sleep(100);
                    
                    float a, b, P;
                    
                    //                      #Per te pytur perdoruesin a deshiron te filloj Programin
                    System.out.println("\nShkruani \"Po\" per te filluar,");
                    Thread.sleep(100);
                    System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                    Thread.sleep(100);
                    
                    System.out.println("\nA deshironi te filloni me gjethjen e perimetrit? ");
                    filloprogramin = sc.next();
                    filloprogramin = filloprogramin.toLowerCase();
                    
                    while(!"po".equals(filloprogramin) && !"jo".equals(filloprogramin)){
                        System.out.println("\nJu lutemi shkruani \"Po\" ose \"Jo\"!");
                        System.out.println("A deshironi te filloni? ");
                        filloprogramin = sc.next();
                        filloprogramin = filloprogramin.toLowerCase();
                    }
                    
                    while("po".equals(filloprogramin)){
                        //# Variabla e Gjatesise
                        System.out.println("\nGjeresia ne cm: ");
                        a = sc.nextFloat();
                        Thread.sleep(500);

                        //# Variabla e Gjeresise
                        System.out.println("Gjatesia ne cm: ");
                        b = sc.nextFloat();
                        Thread.sleep(250);

                        //# Formula e Perimetrit
                        P = 2*(a+b);

                        //# Perimetri 
                        System.out.println("\nPerimetri i kesaj siperfaqe eshte: "  + P + "cm");
                        Thread.sleep(250);
                        
                        Thread.sleep(1000);
                        System.out.println("\nShkruani \"Po\" per tu gjetur perseri perimetrin,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                        Thread.sleep(100);
                        System.out.println("\nA deshironi te gjeni perseri perimetrin? ");
                        filloprogramin = sc.next();
                        filloprogramin = filloprogramin.toLowerCase();
                    }

                    //# Keto funksione sherbejn per tu kthyer ne menu
                    if("jo".equals(filloprogramin)){
                        programi = 0;
                        System.out.println("\nShkruani \"Po\" per tu rikthyer,");
                        Thread.sleep(100);
                        System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                        Thread.sleep(100);
                        System.out.println("A deshironi te ktheheni mbrapa? ");
                        fillimi_i_menys = sc.next();
                        fillimi_i_menys = fillimi_i_menys.toLowerCase();
                    }
                }
                
                //# Ky kod sherben per tu kthyer prapa ne menu
                while(programi == 9){
                    programi = 0;
                    menuja = 0;
                    fillimi_i_menys = "po";
                }
                
                //# Ky funksion sherben kur perdoruesi nuk deshiron te kthehet ne menu
                while("jo".equals(fillimi_i_menys)){
                    programi = 0;
                    menuja = 0;
                    System.out.println("\nMire u pafshim " + perdoruesi);
                    Thread.sleep(100);
                    break;
                }   
            }
            
            //# Menuja e trete
            while(menuja == 3){
                //# Grafiku i perimetrit
                System.out.println("\n/////////////////////////////////////////////////////////////");
                Thread.sleep(100);
                System.out.println("/                                                           /");
                Thread.sleep(100);
                System.out.println("/                                                           /");
                Thread.sleep(100);
                System.out.println("/                 Informacione rreth programit              /");
                Thread.sleep(100);
                System.out.println("/                                                           /");
                Thread.sleep(100);
                System.out.println("/                                                           /");
                Thread.sleep(100);
                System.out.println("/////////////////////////////////////////////////////////////");
                Thread.sleep(100);

                //                      #Per te pytur perdoruesin a deshiron te filloj me shfaqjen e informacionit
                System.out.println("\nShkruani \"Po\" per te shfaqur informacione rreth programit,");
                Thread.sleep(100);
                System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                Thread.sleep(100);

                System.out.println("\nA deshironi te shfaqni informacionet? ");
                filloinfo = sc.next();
                filloinfo = filloinfo.toLowerCase();
                
                while(!"po".equals(filloinfo) && !"jo".equals(filloinfo)){
                        System.out.println("\nJu lutemi shkruani \"Po\" ose \"Jo\"!");
                        System.out.println("A deshironi te shfaqni informacionet? ");
                        filloinfo = sc.next();
                        filloinfo = filloinfo.toLowerCase();
                    }
                
                while("po".equals(filloinfo)){
                    System.out.println("\nKy është projekti im final i kursit dy mujor në Bonevet rreth Python, por eshte konvertuar ne Java.");
                    Thread.sleep(1000);
                    System.out.println("\nProjekti përmban një Main Menu (Menyn Kryesore) i cili përbëhet nga 4 Lojra & 2 Programe,"
                                        + "\nProgrami në Python përmban 5 lojra & 3 programe!");
                    Thread.sleep(1500);
                    System.out.println("\nKy programë është realizuar në vitin 2019 në Python dhe është konvertuar në Java në vitin 2022!");
                    Thread.sleep(1000);
                    System.out.println("Zhvilluesi i ketij programi është Rilind Kyçyku");
                    Thread.sleep(1000);
                    System.out.println("Përditësimi i fundit i këtij programit është bërë në vitin 2022");
                    Thread.sleep(1500);
                    System.out.println("\nLista e Lojrave");
                    Thread.sleep(1000);
                    System.out.println("* Loja e Lotaris");
                    Thread.sleep(500);
                    System.out.println("* Hedhja e Gurëve - 2 Lojtarë");
                    Thread.sleep(500);
                    System.out.println("* Gure,Leter & Gershere");
                    Thread.sleep(500);
                    System.out.println("* Loja e Fantazmës");
                    Thread.sleep(500);
                    System.out.println("\nLista e Programeve");
                    Thread.sleep(1000);
                    System.out.println("* Konvertimi i Gradëve °C & °F");
                    Thread.sleep(500);
                    System.out.println("* Gjetja e Perimetrit");
                    Thread.sleep(500);

                    Thread.sleep(1000);
                    System.out.println("\nShkruani \"Po\" per tu shfaqur perseri informacionin,");
                    Thread.sleep(100);
                    System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                    Thread.sleep(100);
                    System.out.println("\nA deshironi te shfaqni perseri informacionin? ");
                    filloinfo = sc.next();
                    filloinfo = filloinfo.toLowerCase();
                }
                
                //# Keto funksione sherbejn per tu kthyer ne menu
                if("jo".equals(filloinfo)){
                    programi = 0;
                    System.out.println("\nShkruani \"Po\" per tu rikthyer,");
                    Thread.sleep(100);
                    System.out.println("Shkruani \"Jo\" per te mbyllur programin.");
                    Thread.sleep(100);
                    System.out.println("A deshironi te ktheheni mbrapa? ");
                    fillimi_i_menys = sc.next();
                    fillimi_i_menys = fillimi_i_menys.toLowerCase();
                }

                //# Ky kod sherben per tu kthyer prapa ne menu
                while(menuja == 9){
                    menuja = 0;
                    fillimi_i_menys = "po";
                }

                //# Ky funksion sherben kur perdoruesi nuk deshiron te kthehet ne menu
                while("jo".equals(fillimi_i_menys)){
                    menuja = 0;
                    System.out.println("\nMire u pafshim " + perdoruesi);
                    Thread.sleep(100);
                    break;
                }
            }
        }
    }
}

