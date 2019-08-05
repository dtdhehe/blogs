package com.dtdhehe.blogs.entity;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/5 22:20
 * @description
 **/
public class Permission {

    private String id;

    private String permissionName;

    private String valid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }
}
