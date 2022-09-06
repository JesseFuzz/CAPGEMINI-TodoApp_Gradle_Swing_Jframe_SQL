/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author jesse
 */
public class ProjectEntity {
    private int id;
    private String name;
    private String Description;
    private Date createdAt;
    private Date updatedAt;

    public ProjectEntity(int id, String name, String Description, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.Description = Description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ProjectEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ProjectEntity{" + "id=" + id + ", name=" + name + ", Description=" + Description + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
    
}
