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
@Table(name = "user")
public class User implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "enabled")
    private boolean enabled;

    @Column(name = "accountNonExpired")
    private boolean accountNonExpired;

    @Column(name = "credentialsNonExpired")
    private boolean credentialsNonExpired;

    @Column(name = "accountNonLocked")
    private boolean accountNonLocked;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_user", joinColumns = {
            @JoinColumn(name = "user_id", referencedColumnName = "id") },
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id",
                            referencedColumnName = "id") })
    private List<Role> roles;

    public User()
    {
    }

    public User(User user)
    {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.enabled = user.isEnabled();
        this.accountNonExpired = user.isAccountNonExpired();
        this.credentialsNonExpired = user.isCredentialsNonExpired();
        this.accountNonLocked = user.isAccountNonLocked();
        this.roles = user.getRoles();
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
     * @return String holds the username
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * @param username
     *            the username to set
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * @return String holds the password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * @return String holds the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @return boolean holds the enabled
     */
    public boolean isEnabled()
    {
        return enabled;
    }

    /**
     * @param enabled
     *            the enabled to set
     */
    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    /**
     * @return boolean holds the accountNonExpired
     */
    public boolean isAccountNonExpired()
    {
        return accountNonExpired;
    }

    /**
     * @param accountNonExpired
     *            the accountNonExpired to set
     */
    public void setAccountNonExpired(boolean accountNonExpired)
    {
        this.accountNonExpired = accountNonExpired;
    }

    /**
     * @return boolean holds the credentialsNonExpired
     */
    public boolean isCredentialsNonExpired()
    {
        return credentialsNonExpired;
    }

    /**
     * @param credentialsNonExpired
     *            the credentialsNonExpired to set
     */
    public void setCredentialsNonExpired(boolean credentialsNonExpired)
    {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    /**
     * @return boolean holds the accountNonLocked
     */
    public boolean isAccountNonLocked()
    {
        return accountNonLocked;
    }

    /**
     * @param accountNonLocked
     *            the accountNonLocked to set
     */
    public void setAccountNonLocked(boolean accountNonLocked)
    {
        this.accountNonLocked = accountNonLocked;
    }

    /**
     * @return List<Role> holds the roles
     */
    public List<Role> getRoles()
    {
        return roles;
    }

    /**
     * @param roles
     *            the roles to set
     */
    public void setRoles(List<Role> roles)
    {
        this.roles = roles;
    }

}
