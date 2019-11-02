package com.jiahao.bean;

import java.util.Date;

public class Emp {
	
	private Integer eid;

    private String ename;

    private Date bridhday;

    private Date updatetime;

    private Date createtime;

    public Emp() {
		super();
	}

	public Emp(Integer eid, String ename, Date bridhday, Date updatetime, Date createtime) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.bridhday = bridhday;
		this.updatetime = updatetime;
		this.createtime = createtime;
	}

	public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Date getBridhday() {
        return bridhday;
    }

    public void setBridhday(Date bridhday) {
        this.bridhday = bridhday;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    
    @Override
 	public String toString() {
 		return "Emp [eid=" + eid + ", ename=" + ename + ", bridhday=" + bridhday + ", updatetime=" + updatetime
 				+ ", createtime=" + createtime + "]";
 	}
}