package g4s21p8qacj;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "Antoine Lavoisier","En el ombligo de la Luna","1945","Friedrich Nietzsche","Albert Hofmann"
    };
    
    String[] radioR = {
        "Antoine Lavoisier, Alhaitham, Nikola Tesla, Kuki ShinobuAntoine Lavoisier",
        "En el ombligo de la Luna, Arruyo de Estrella, Nacion de vencedores, Territorio de dioses",
        "1945, 1699, 1994, 2001",
        "Friedrich Nietzsche, Jacobo Gringber, Rambam Maimonides, Zaratustra",
        "Albert Hofmann, Nikita Krushev, Vladimir Putin, Benito Juarez"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
