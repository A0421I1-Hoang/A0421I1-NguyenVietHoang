package cg.wbd.grandemonstration.model;

public class Condiments implements Cloneable {
    private long id;
   private String lettuce;
   private String tomato;
   private String mustand;
   private String sprout;

    public Condiments() {
    }

    public Condiments(long id, String lettuce, String tomato, String mustand, String sprout) {
        this.id=id;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.mustand = mustand;
        this.sprout = sprout;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLettuce() {
        return lettuce;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public String getTomato() {
        return tomato;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    public String getMustand() {
        return mustand;
    }

    public void setMustand(String mustand) {
        this.mustand = mustand;
    }

    public String getSprout() {
        return sprout;
    }

    public void setSprout(String sprout) {
        this.sprout = sprout;
    }

    @Override
    public Condiments clone() {
        Condiments condiments = new Condiments();
        condiments.setId(id);
        condiments.setLettuce(lettuce);
        condiments.setTomato(tomato);
        condiments.setMustand(mustand);
        condiments.setSprout(sprout);
        return condiments;
    }

    @Override
    public String toString() {
        return "Condiments{" +
                "id='" +id+'\'' +
                "lettuce='" + lettuce + '\'' +
                ", tomato='" + tomato + '\'' +
                ", mustand='" + mustand + '\'' +
                ", sprout='" + sprout + '\'' +
                '}';
    }
}
