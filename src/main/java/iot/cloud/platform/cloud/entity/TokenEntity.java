package iot.cloud.platform.cloud.entity;


import java.util.Date;

public class TokenEntity {
    private Long expiredTs;
    private String token;
    private String userId;
    private Date expiredTime;


    public boolean expired() {
        long now = new Date().getTime();
        return expiredTs < now;
    }

    //请补充缺失的属性、getter 和 setter。
    public Long getExpiredTs() {
        return expiredTs;
    }

    public void setExpiredTs(Long expiredTs) {
        this.expiredTs = expiredTs;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }
}
