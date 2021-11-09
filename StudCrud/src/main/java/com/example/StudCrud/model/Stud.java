package com.example.StudCrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class Stud {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String semester;
	public Stud()
	{
		
	}
    public Stud(String string, String string2, String string3) {
        id=string;
		name=string2;
		semester=string3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}

