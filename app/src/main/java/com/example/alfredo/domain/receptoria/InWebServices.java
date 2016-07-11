package com.example.alfredo.domain.receptoria;

/**
 * Created by Alfredo on 11/07/2016.
 */
public class InWebServices {
    private Integer ws_empresa;
    private Integer ws_id;
    private String ws_url;

    public InWebServices(Integer ws_empresa, Integer ws_id, String ws_url) {
        this.ws_empresa = ws_empresa;
        this.ws_id = ws_id;
        this.ws_url = ws_url;
    }

    public Integer getWs_empresa() {return ws_empresa;}
    public void setWs_empresa(Integer ws_empresa) {this.ws_empresa = ws_empresa;}
    public Integer getWs_id() {return ws_id;}
    public void setWs_id(Integer ws_id) {this.ws_id = ws_id;}
    public String getWs_url() {return ws_url;}
    public void setWs_url(String ws_url) {this.ws_url = ws_url;}

    @Override
    public String toString() {
        return "InWebServices{" +
                "ws_empresa=" + ws_empresa +
                ", ws_id=" + ws_id +
                ", ws_url='" + ws_url + '\'' +
                '}';
    }
}
