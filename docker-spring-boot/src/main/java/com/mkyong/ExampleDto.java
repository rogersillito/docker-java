package com.mkyong;

import java.util.Objects;

public final class ExampleDto {
    private Integer id;
    private String name;

    public ExampleDto(Integer id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (ExampleDto) obj;
        return Objects.equals(this.getId(), that.getId()) &&
                Objects.equals(this.getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "ExampleDto[" +
                "id=" + getId() + ", " +
                "name=" + getName() + ']';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}