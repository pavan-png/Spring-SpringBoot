package in.orcas.model;

public class Customer {
    private int cno;
    private String cname;
    private String country;
    private float avg;

    // Getters & Setters
    public int getCno() { return cno; }
    public void setCno(int cno) { this.cno = cno; }

    public String getCname() { return cname; }
    public void setCname(String cname) { this.cname = cname; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public float getAvg() { return avg; }
    public void setAvg(float avg) { this.avg = avg; }

    @Override
    public String toString() {
        return "Customer [cno=" + cno + ", cname=" + cname + ", country=" + country + ", avg=" + avg + "]";
    }
}
