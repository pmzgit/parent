package com.pmz.model.sys;

import com.pmz.model.base.proxy.DataEntity;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.type.Alias;

/**
 * Created by Administrator on 2016/12/30.
 */
@Alias("permission")
public class Permission extends DataEntity<Permission>{
    private static final long servialVersionUID = 1l;
    public static final Integer MENU = 1;
    public static final Integer BUTTON = 2;
    public static final Integer DATA = 3;

    private Permission parent;
    private String name;
    private String permission;
    private String href;
    private Integer no;
    private String route;
    private Integer permissionType;
    private Integer menuType;
    private String icon;
    private Integer sort;

    public Permission getParent() {
        return parent;
    }

    public void setParent(Permission parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Integer getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(Integer permissionType) {
        this.permissionType = permissionType;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Permission)) return false;

        Permission that = (Permission) o;

        return new EqualsBuilder()
                .append(getParent(), that.getParent())
                .append(getPermission(), that.getPermission())
                .append(getHref(), that.getHref())
                .append(getPermissionType(), that.getPermissionType())
                .append(getMenuType(), that.getMenuType())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getParent())
                .append(getPermission())
                .append(getHref())
                .append(getPermissionType())
                .append(getMenuType())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("parent", parent)
                .append("name", name)
                .append("permission", permission)
                .append("href", href)
                .append("no", no)
                .append("route", route)
                .append("permissionType", permissionType)
                .append("menuType", menuType)
                .append("icon", icon)
                .append("sort", sort)
                .toString();
    }
}
