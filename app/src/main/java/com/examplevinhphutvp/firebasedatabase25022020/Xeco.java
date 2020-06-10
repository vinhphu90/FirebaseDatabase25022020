package com.examplevinhphutvp.firebasedatabase25022020;

import java.util.Objects;

public class Xeco {
    private String ten;
    private Integer sobanhxe;

    public Xeco(String ten, Integer sobanhxe) {
        this.ten = ten;
        this.sobanhxe = sobanhxe;
    }

    public Xeco() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getSobanhxe() {
        return sobanhxe;
    }

    public void setSobanhxe(Integer sobanhxe) {
        this.sobanhxe = sobanhxe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Xeco xeco = (Xeco) o;
        return ten.equals(xeco.ten) &&
                sobanhxe.equals(xeco.sobanhxe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ten, sobanhxe);
    }
}
