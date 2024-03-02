public class Publiccarrier implements Vechile,Transport{
    int nw,tp;
    double av,mxwt;
    String tov;
    Publiccarrier(){
        nw=0;
        tp=0;
        av=0.0;
        mxwt=0.0;
        tov="";

    }
    Publiccarrier(int a,int b,double c,double d,String e){
        nw=a;
        tp=b;
        av=c;
        mxwt=d;
        tov=e;


    }
    @Override
    public int getNoOfWheels() {
        return nw;
    }

    @Override
    public int getTopSpeed() {
        return tp;
    }

    @Override
    public double getAvg() {
        return av;
    }

    @Override
    public double getMaxWt() {
        return mxwt;
    }

    @Override
    public String getTypOfVchl() {
        return tov;
    }

    @Override
    public String toString() {
        return "\n no of wheel"+nw+"\n mx speed "+tp+"\n average "+av+"\n max weight"+mxwt+"\n type of vechile "+tov;
    }
}
