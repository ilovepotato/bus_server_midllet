package com.chelaile.domain;

/**
 * ����ʵ��
 * Created by wangshiyu on 2015/8/7.
 */
public class DataInfo {

    //�������
    private String busId;

    //��·
    private String line;

    //����
    private double longitude;

    //γ��
    private double latitude;

    //����ʱ��
    private String sendTime;

    //����ʱ��
    private String receiveTime;

    public DataInfo() {
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }
}
