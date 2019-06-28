public class Adapter extends Adaptee implements ITarget {


    public String Request(int i) {

        String Gavab = null;

        if( i <= 10 ) {
            Gavab = "Kodak : " + "Amanat Time = " + Function_Amanat_time(i, 10) + "Day" +
                    " | Garimhe : " + Function_Garimhe(i, 100) + "$";
        }
        else if ((i > 10) && (i <= 20)){
            Gavab =  "NoJavan : " + "Amanat Time = " + Function_Amanat_time(i , 10) + "Day" +
                    " | Garimhe : " + Function_Garimhe(i , 100) + "$";
        }
        else if ((i > 20) && (i <= 30)){
            Gavab =  "Javan : " + "Amanat Time = " + Function_Amanat_time(i , 10) + "Day" +
                    " | Garimhe : " + Function_Garimhe(i , 100) + "$";
        }
        else if ((i > 30) && (i <= 40)){
            Gavab =  "Miansal : " + "Amanat Time = " + Function_Amanat_time(i , 10) + "Day" +
                    " | Garimhe : " + Function_Garimhe(i , 100) + "$";
        }
        else if ((i > 40) && (i <= 60)){
            Gavab =  "Pir : " + "Amanat Time = " + Function_Amanat_time(i , 10) + "Day" +
                    " | Garimhe : " + Function_Garimhe(i , 100) + "$";
        }
        else {
            Gavab = "Ena Lelah Va Ena Elaihe Rageuon !!!";
        }
        return Gavab;
    }
}
