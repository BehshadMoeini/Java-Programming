public class Gen <USERNAME,PASSWORD> implements Cloneable {
    private USERNAME u;
    private PASSWORD p;
    public USERNAME getU() {
        return u;
    }
    public void setU(USERNAME u) {
        this.u = u;
    }
    public PASSWORD getP() {
        return p;
    }
    public void setP(PASSWORD p) {
        this.p = p;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
