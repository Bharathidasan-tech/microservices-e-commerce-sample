package com.bharathi.shopping.auth.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "role")
public class Role implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "permission_role", joinColumns = {
            @JoinColumn(name = "role_id", referencedColumnName = "id") },
            inverseJoinColumns = {
                    @JoinColumn(name = "permission_id",
                            referencedColumnName = "id") })
    private List<Permission> permissions;

    public Role()
    {
    }

    /**
     * @return Integer holds the id
     */
    public Integer getId()
    {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Integer id)
    {
        this.id = id;
    }

    /**
     * @return String holds the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return List<Permission> holds the permissions
     */
    public List<Permission> getPermissions()
    {
        return permissions;
    }

    /**
     * @param permissions
     *            the permissions to set
     */
    public void setPermissions(List<Permission> permissions)
    {
        this.permissions = permissions;
    }

}
