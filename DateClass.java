public class date {
    int dd,mm,yy;
    date(int d, int m, int y){
        this.dd = d;
        this.mm = m;
        this.yy = y;

    }
    String getDate(){
        return this.dd+"-"+this.mm+"-"+this.yy;
    }
}
