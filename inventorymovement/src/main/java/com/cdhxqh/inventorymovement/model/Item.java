package com.cdhxqh.inventorymovement.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by apple on 15/6/3.
 * 主项目信息
 */
public class Item extends Entity implements Parcelable {
    private static final String TAG = "Item";
    private static final long serialVersionUID = 2015050105L;

    public String itemid; //id
    public String itemnum; //项目编号
    public String description; //描述
    public String in20; //规格型号
    public String orderunit; //订购单位
    public String issueunit; //发放单位
    public String enterby; //录入人
    public String enterdate; //录入时间


    @Override
    public void parse(JSONObject jsonObject) throws JSONException {
        itemid = jsonObject.getString("itemid");
        itemnum = jsonObject.getString("itemnum");
        description = jsonObject.getString("description");
        in20 = jsonObject.getString("in20");
        orderunit = jsonObject.getString("orderunit");
        issueunit = jsonObject.getString("issueunit");
        enterby = jsonObject.getString("enterby");
        enterdate = jsonObject.getString("enterdate");
    }

    public Item() {
    }


    private Item(Parcel in) {
        itemid = in.readString();
        itemnum = in.readString();
        description = in.readString();
        in20 = in.readString();
        orderunit = in.readString();
        issueunit = in.readString();
        enterby = in.readString();
        enterdate = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(itemid);
        dest.writeString(itemnum);
        dest.writeString(description);
        dest.writeString(in20);
        dest.writeString(orderunit);
        dest.writeString(issueunit);
        dest.writeString(enterby);
        dest.writeString(enterdate);

    }


    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel source) {
            return new Item(source);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getItemnum() {
        return itemnum;
    }

    public void setItemnum(String itemnum) {
        this.itemnum = itemnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIn20() {
        return in20;
    }

    public void setIn20(String in20) {
        this.in20 = in20;
    }


    public String getOrderunit() {
        return orderunit;
    }

    public void setOrderunit(String orderunit) {
        this.orderunit = orderunit;
    }

    public String getIssueunit() {
        return issueunit;
    }

    public void setIssueunit(String issueunit) {
        this.issueunit = issueunit;
    }

    public String getEnterby() {
        return enterby;
    }

    public void setEnterby(String enterby) {
        this.enterby = enterby;
    }

    public String getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(String enterdate) {
        this.enterdate = enterdate;
    }
}
