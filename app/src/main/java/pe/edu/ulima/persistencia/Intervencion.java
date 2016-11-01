package pe.edu.ulima.persistencia;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.annotations.Required;

/**
 * Created by sodm on 10/31/2016.
 */
@RealmClass
public class Intervencion extends RealmObject{
    @PrimaryKey
    private String id;
    @Required
    private String tipo;
    private String categoria;
    private String sector;

    public Intervencion() {
    }

    public Intervencion(String id, String tipo, String categoria, String sector) {

        this.id = id;
        this.tipo = tipo;
        this.categoria = categoria;
        this.sector = sector;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
